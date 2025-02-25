import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.*
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat // Added to Format the date that is being read from Excel
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet // to Handle Excel Operations
import java.io.FileOutputStream as FileOutputStream // To handle File Operations (Read & Write)
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook// to handle Excel Operations
import org.apache.poi.ss.usermodel.Cell.*

//Try- Catch block - if there is any failure in the Try Block code , i.e. Full Flow it will go to catch block and execute the testcase test_cpp logic 
try {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [(PC_Username) : PC_Username, (PC_Password) : PC_Password], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_CreateAccount'), [('Address1') : '69 Washington Ave'
            , ('City') : 'Cicero', ('AddressType') : 'Billing', ('AgencyName') : 'AssuredPartners', ('ProducerCode') : '0003480-0000-HOUSE House Code'
            , ('ZipCode') : '46034-9997', ('State') : 'Indiana'], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Actions'))

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_New Submission'))

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneIllinoisIndianaIowaMichiganOhio'), 
        findTestData('IMC/New_Submission/new_submission').getValue(1, 2), true)

	//Here we are from line 49 - 65 we are providing logic if Product is commercial package it will call a different test case from normal flow 
	
    TestData exceldata = TestDataFactory.findTestData('IMC/New_Submission/new_submission') //it will fetch the Dataset 

    String productName = exceldata.getValue(2, 2) // this will fetch the productname from excel sheet 

	// line 54- 65 , we have to create a dynamic Xpath based on product name  below it will fetch the data from excel based on which  it will create xpath during runtime 
    String dynamicXpath = ('//tr[td[contains(@id, \'Name_Cell\')]//div[text()=\'' + productName) + '\']]//td[contains(@id, \'Select\')]//div[text()=\'Select\']'

    TestObject dynamicTestObject = new TestObject('DynamicObject')

    dynamicTestObject.addProperty('xpath', ConditionType.EQUALS, dynamicXpath)

    WebUI.click(dynamicTestObject)

	// If ELse block to call test case based on product name 
    if (productName == 'Commercial Package') {
        WebUI.callTestCase(findTestCase('Demo/IMC_test_CPP'), [:], FailureHandling.STOP_ON_FAILURE)
    } else {
        System.out.println('Selected and Moving Ahead')
    }
    
	//line 70 -97 - its the logic  to fetch date from Excel  and convert the same to Date format and pass the value to Date field accordingly 
    TestData exceldata_date = TestDataFactory.findTestData('IMC/Policy_Info/policy_info')

    String dateStr = exceldata_date.getValue(7, 2) // it will read from Excel

    SimpleDateFormat inputformat = new SimpleDateFormat('MM/dd/yyyy') // Specifying the format of Date 

    SimpleDateFormat outputformat = new SimpleDateFormat('MM/dd/yyyy') // Date FOrmat required 

    Date dateObject
// this  block will conver the date from String to Specific format in line 76 and pass value 
    try {
        dateObject = inputformat.parse(dateStr)

        String receivedDate = outputformat.format(dateObject)

        System.out.println('Date Value is ' + receivedDate)

        WebUI.delay(5)

        WebUI.setText(findTestObject('receivedDate'), receivedDate)
    }
    catch (def e) {
        System.out.println('Error in Parsing data from Excel')

        return 
    } 
    
    String capturedDate = WebUI.getText(findTestObject('date'))
	
	// Capture values from the UI -- capturedValue
	String Fulltext = WebUI.getText(findTestObject('submissionId'))
	
	//using Regex to trim the value of Submission ID
	
	def matcher = Fulltext =~/\d+/  //matches one or more digit 
	String capturedValue = matcher.find()?matcher.group(0) : ''
	

	//String capturedDate = WebUI.getText(findTestObject('date'))
	println('Submission Id is ' + capturedValue)

	println('Date is ' + capturedDate)

	// Define folder and file paths
	String folderPath = 'C://savedata/'

	File folder = new File(folderPath)

	// Create folder if it doesn’t exist
	if (!(folder.exists())) {
		folder.mkdirs()
	}
	
	// Define the Excel file path
	String excelPath = folderPath + '/data.xlsx'

	FileInputStream inputStream = null

	Workbook workbook = null
	 

	//Try catch finally -- try block will access the excel file spcfied in line 338 and will check if it is able to find it and has write access on it   ,
	//if  not then it will create a new instance and will access the workbook
	//after that it will call finally block where if the file is accessed it will close the inputstream
	try {
		inputStream = new FileInputStream(excelPath)

		workbook = new XSSFWorkbook(inputStream)// We are using XSSFWorkbook java library to ahndle Excel Operations
	}
	catch (IOException e) {
		workbook = new XSSFWorkbook()
	}
	finally {
		if (inputStream != null) {
			inputStream.close()
		}
	}
	
	// Access or create the sheet
	Sheet sheet = workbook.getSheet('CapturedValues')

	if (sheet == null) {
		sheet = workbook.createSheet('CapturedValues')
	}
	
	// Create a header row if it’s the first row in the sheet
	if ((sheet.getLastRowNum() == 0) && (sheet.getRow(0) == null)) {
		Row headerRow = sheet.createRow(0)

		Cell headerCell1 = headerRow.createCell(0)

		headerCell1.setCellValue('SubmissionID')

		Cell headerCell2 = headerRow.createCell(1)

		headerCell2.setCellValue('Date')
	}
	
	// Determine the next row to write data
	int lastRowNum = sheet.getLastRowNum()

	Row row = sheet.createRow(lastRowNum + 1)

	// Write SubmissionID to Column A
	Cell cellA = row.createCell(0)

	cellA.setCellValue(capturedValue)

	// Write Date to Column B
	Cell cellB = row.createCell(1)

	cellB.setCellValue(capturedDate)

	// Save the changes to the Excel file
	FileOutputStream fileOut = new FileOutputStream(excelPath)

	workbook.write(fileOut)

	fileOut.close()

    WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Imc_SSN'), findTestData('IMC/Policy_Info/policy_info').getValue(
            1, 2))

    WebUI.setText(findTestObject('IMC Objects/IMC Coverages/IMC_NAICS_Code'), findTestData('IMC/Policy_Info/policy_info').getValue(
            2, 2))

    //TestObject 
    WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Year Business Started_SubmissionWizar_71d170'), 
        findTestData('IMC/Policy_Info/policy_info').getValue(3, 2))

    WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/textarea_Description ofbusiness and operati_ae20b1'), 
        findTestData('IMC/Policy_Info/policy_info').getValue(4, 2))

    WebUI.setText(findTestObject('IMC Objects/IMC Coverages/IMC_Desc_Of_Operation'), findTestData('IMC/Policy_Info/policy_info').getValue(
            5, 2))

    WebUI.setText(findTestObject('IMC Objects/IMC Coverages/IMC_Customer_Number'), findTestData('IMC/Policy_Info/policy_info').getValue(
            6, 2))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneIndividualJoint ventureLimited p_c25258'), 
        'individual', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneFarmCommercial'), 
        'commercial', true)

	// line 125 - 136 this block checks if Radio Button Yes  or No  is selected 
    TestData exceldat = TestDataFactory.findTestData('IMC/Policy_Info/policy_info')

    String cbValue = exceldat.getValue(15, 2)

	// Line 130-136 this block checks if Yes is enabled than it will call the supportin policies Test Case 
    if (cbValue.equalsIgnoreCase('Yes')) {
        WebUI.click(findTestObject('IMC Objects/IMC Add supporting Policies/IMC_SP_CB_Yes'))

        WebUI.callTestCase(findTestCase('Demo/IMC Supporting Policies'), [:], FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.click(findTestObject('IMC Objects/IMC Add supporting Policies/IMC_SP_CB_No'))
    }
    
    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NeNext'))

    WebUI.selectOptionByValue(findTestObject('IMC Objects/PolicyCenter_IMC_Risk_Type'), 'IndustrialProcessing', false)

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Contractors Equipment'))

	//Line 148-306  this block of code actually checks the value of Global Variable "checkBoxvalue" and based on the coverage selected it fills the specific form accrdingly 
	
    String selectCheckbox = GlobalVariable.checkboxvalue

    switch (selectCheckbox) {
        case '7000':
            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_IM 7000 Contractors Equipment - Compr_cdd66f'))

            WebUI.delay(2)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_covered_property'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_covered_property'), 
                findTestData('IMC/7000/IMC7000').getValue(1, 1), false)

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_catastrophe_limit'), 
                findTestData('IMC/7000/IMC7000').getValue(2, 1))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_CoInsurance'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_CoInsurance'), 
                findTestData('IMC/7000/IMC7000').getValue(3, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_7000'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_7000'), 
                findTestData('IMC/7000/IMC7000').getValue(4, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_val_7000'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_val_7000'), 
                findTestData('IMC/7000/IMC7000').getValue(5, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_valuation_7000'), 
                FailureHandling.STOP_ON_FAILURE)

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_valuation_7000'), 
                findTestData('IMC/7000/IMC7000').getValue(6, 1), false)

            break
        case '7001':
            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_imc7001'))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_catastrophe_limit_7001'), 
                findTestData('IMC/7001/IM7001').getValue(1, 1))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_coinsurance_7001'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_coinsurance_7001'), 
                findTestData('IMC/7001/IM7001').getValue(2, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_val_7001'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_val_7001'), 
                findTestData('IMC/7001/IM7001').getValue(3, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_valuation_7001'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_valuation_7001'), 
                findTestData('IMC/7001/IM7001').getValue(4, 1), false)

            break
        case '7003':
            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_7003'))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_catastrophe_limit_7003'), 
                findTestData('IMC/7003/IM7003').getValue(1, 1))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_basic_load_7003'), 
                findTestData('IMC/7003/IM7003').getValue(2, 1))

            WebUI.click(findTestObject(null))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_catastrophe_limit_7003'))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_val_7003'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_val_7003'), 
                findTestData('IMC/7003/IM7003').getValue(3, 1), false)

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_your_tool_limit_7003'), 
                findTestData('IMC/7003/IM7003').getValue(4, 1))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_employee_tool_70903'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_employee_tool_70903'), 
                findTestData('IMC/7003/IM7003').getValue(5, 1), false)

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_employee_tool_limit'), 
                findTestData('IMC/7003/IM7003').getValue(6, 1))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_lease_rental_7003'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_lease_rental_7003'), 
                findTestData('IMC/7003/IM7003').getValue(7, 1), false)

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_lease_rental_limit_7003'), 
                findTestData('IMC/7003/IM7003').getValue(8, 1))

            break
        case '7002':
            WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_IM 7002 Contractors Equipment - Blank_c32a5f'))

            WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Catastrophe Limit_IM7ContractorsEquip_7873aa'), 
                findTestData('IMC/7002/IM7002').getValue(1, 1))

            WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Equipment Limit_IM7ContractorsEquipme_d09627'), 
                findTestData('IMC/7002/IM7002').getValue(2, 1))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_basicload'), 
                findTestData('IMC/7002/IM7002').getValue(3, 1))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible'), 
                findTestData('IMC/7002/IM7002').getValue(4, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_value'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_value'), 
                findTestData('IMC/7002/IM7002').getValue(5, 1), false)

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_valuation'), 
                FailureHandling.STOP_ON_FAILURE)

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_valuation'), 
                findTestData('IMC/7002/IM7002').getValue(6, 1), false)

            break
        case '7004':
            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/Click_imc_7004'))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_catastrophe_limit_7004'), 
                findTestData('IMC/7004/IM7004').getValue(1, 1))

            WebUI.delay(2)

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_basic_load_7004'), 
                findTestData('IMC/7004/IM7004').getValue(2, 1))

            WebUI.delay(5)

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_basic_load_7004'), 
                findTestData('IMC/7004/IM7004').getValue(2, 1))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_equipment_limit'), 
                findTestData('IMC/7004/IM7004').getValue(3, 1))

            WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_equipment_limit'), 
                findTestData('IMC/7004/IM7004').getValue(3, 1))

            WebUI.click(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_7004'))

            WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/click_deductible_7004'), 
                findTestData('IMC/7004/IM7004').getValue(4, 1), false)

            break
        default:
            WebUI.comment('Checkbox Not Selected ')

            break
    }
    
    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_OKOK'))

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Next'))

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Next'))

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Rate'))

    WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_FinishQuote'))

	/*
    // Capture values from the UI
    String capturedValue = WebUI.getText(findTestObject('submissionId'))

    //String capturedDate = WebUI.getText(findTestObject('date'))
    println('Submission Id is ' + capturedValue)

    println('Date is ' + capturedDate)

    // Define folder and file paths
    String folderPath = 'C://savedata/'

    File folder = new File(folderPath)

    // Create folder if it doesn’t exist
    if (!(folder.exists())) {
        folder.mkdirs()
    }
    
    // Define the Excel file path
    String excelPath = folderPath + '/data.xlsx'

    FileInputStream inputStream = null

    Workbook workbook = null
     

	//Try catch finally -- try block will access the excel file spcfied in line 338 and will check if it is able to find it and has write access on it   , 
	//if  not then it will create a new instance and will access the workbook 
	//after that it will call finally block where if the file is accessed it will close the inputstream 
    try {
        inputStream = new FileInputStream(excelPath)

        workbook = new XSSFWorkbook(inputStream)// We are using XSSFWorkbook java library to ahndle Excel Operations 
    }
    catch (IOException e) {
        workbook = new XSSFWorkbook()
    } 
    finally { 
        if (inputStream != null) {
            inputStream.close()
        }
    }
    
    // Access or create the sheet
    Sheet sheet = workbook.getSheet('CapturedValues')

    if (sheet == null) {
        sheet = workbook.createSheet('CapturedValues')
    }
    
    // Create a header row if it’s the first row in the sheet
    if ((sheet.getLastRowNum() == 0) && (sheet.getRow(0) == null)) {
        Row headerRow = sheet.createRow(0)

        Cell headerCell1 = headerRow.createCell(0)

        headerCell1.setCellValue('SubmissionID')

        Cell headerCell2 = headerRow.createCell(1)

        headerCell2.setCellValue('Date')
    }
    
    // Determine the next row to write data
    int lastRowNum = sheet.getLastRowNum()

    Row row = sheet.createRow(lastRowNum + 1)

    // Write SubmissionID to Column A
    Cell cellA = row.createCell(0)

    cellA.setCellValue(capturedValue)

    // Write Date to Column B
    Cell cellB = row.createCell(1)

    cellB.setCellValue(capturedDate)

    // Save the changes to the Excel file
    FileOutputStream fileOut = new FileOutputStream(excelPath)

    workbook.write(fileOut)

    fileOut.close()
	*/
}
catch (Exception e) {
    WebUI.comment('Test Step Failed' + e.getMessage())

    WebUI.callTestCase(findTestCase('Demo/New Activity'), [:], FailureHandling.STOP_ON_FAILURE)
} 

