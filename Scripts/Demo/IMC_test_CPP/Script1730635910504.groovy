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
import java.text.SimpleDateFormat as SimpleDateFormat
//import org.apache.poi.xsff.usermodel.XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import java.io.FileOutputStream as FileOutputStream
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.poi.ss.usermodel.Cell.*

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [(PC_Username) : PC_Username, (PC_Password) : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_CreateAccount'), [('Address1') : '69 Washington Ave'
        , ('City') : 'Cicero', ('AddressType') : 'Billing', ('AgencyName') : 'AssuredPartners', ('ProducerCode') : '0003480-0000-HOUSE House Code'
        , ('ZipCode') : '46034-9997', ('State') : 'Indiana'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Actions'))

not_run: WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_New Submission'))

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneIllinoisIndianaIowaMichiganOhio'), 
    findTestData('IMC/New_Submission/new_submission').getValue(1, 2), true)

not_run: TestData exceldata = TestDataFactory.findTestData('IMC/New_Submission/new_submission')

not_run: String productName = exceldata.getValue(2, 3)

not_run: String dynamicXpath = ('//tr[td[contains(@id, \'Name_Cell\')]//div[text()=\'' + productName) + '\']]//td[contains(@id, \'Select\')]//div[text()=\'Select\']'

not_run: TestObject dynamicTestObject = new TestObject('DynamicObject')

not_run: dynamicTestObject.addProperty('xpath', ConditionType.EQUALS, dynamicXpath)

not_run: WebUI.click(dynamicTestObject)

//WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Select_1'))
//WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Received Date_SubmissionWizard-LOBWizar_21dab9'))
//Date d = new Date()
TestData exceldata_date = TestDataFactory.findTestData('IMC/Policy_Info/policy_info')

String dateStr = exceldata_date.getValue(7, 2 //mmddyyyy
    )

SimpleDateFormat inputformat = new SimpleDateFormat('MM/dd/yyyy')

SimpleDateFormat outputformat = new SimpleDateFormat('MM/dd/yyyy')

Date dateObject

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

//String receivedDate = format.format(dateObject)
//System.out.println('The value is ' + receivedDate)
/*String filepath = "C:\\Users\\LellKir\\Desktop\\Project_DOC\\katalon\\Testdata.xlsx"

FileInputStream file = new FileInputStream(new File(filepath))
Workbook workbooktd = new XSSFWorkbook(file)

Sheet sheet_td = workbooktd.getSheetAt(0)

Row row_td = sheet_td.getRow(1)

String getCellValue(Cell cell) {
	switch(cell.getCellType()) {
		case CellType.STRING:
			return cell.getStringCellValue()
		case CellType.NUMERIC:
			return cell.getNumericCellValue()
		default:
			return
	}
}


Cell yearCell = row_td.getCell(0)
String yearValue = yearCell.getStringCellValue()

Cell descCell = row_td.getCell(1)
String descValue = yearCell.getStringCellValue()

file.close()
workbooktd.close()

println("year"+yearValue)
println("desc"+descValue)


TestData excelData = TestDataFactory.findTestData('Data Files/IMCTestData')

String yearValue = excelData.getValue('Year', 1)

String descValue = excelData.getValue('Description', 1)
*/
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

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneFarmCommercial'), 
    'commercial', true)

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NeNext'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC_DD_RiskType'))

WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/IMC_DD_RiskType'), findTestData('IMC/LineSelection Risk/LineSelection RiskType').getValue(
        1, 2), false)

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC_CPP_LineHeader'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/CPP Line Selection Next'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/CommericialInland Marine'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Contractors Equipment'))

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

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneSchedule on FileSchedule Equipment'), 
    'Schedule Equipment', false)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneFlat DeductiblePercentage Deductible'), 
    'CEDeducFlatDeduc', false)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_none2505001,0002,5005,00010,00025,000'), 
    'Deductible500', false)

not_run: WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Add'))

not_run: WebUI.selectOptionByValue(findTestObject('dd_equipment_type'), 'Small Tools', false)

not_run: WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_NewUsed_IM7ContractorsEquipmentPopup-_8599bc'), 
    'construction')

not_run: WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Description should include Manufactur_ab2508'), 
    '10000')

not_run: WebUI.setText(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_NewUsed_IM7ContractorsEquipmentPopup-_121599'), 
    '1.45')

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_OKOK'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Next'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC Modifiers Next'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC Modifier2 Next'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC Supplemental Next'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC Supplemental Next'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Prior Policies'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Add'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Total Losses_SubmissionWizard-Job_Ris_3bb92b'), 
    findTestData('IMC/Risk Analysis/Risk Analysis').getValue(1, 2))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Total Losses_SubmissionWizard-Job_Ris_6411f6'), 
    findTestData('IMC/Risk Analysis/Risk Analysis').getValue(2, 2))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Total Losses_SubmissionWizard-Job_RiskA_a36184'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_31'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_64c1fb'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_84c017'), 
    '')

WebUI.doubleClick(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_84c017'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_84c017'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_a915aa'), 
    '')

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_a915aa'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Prior Losses'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NeNext'))

not_run: WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_RaRate'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Actions (1)'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NANew Activity'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('IMC Objects/IMC Coverages/IMC_Request'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Review and Approve'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Description_NewActivityWorksheet-NewA_36498c'), 
    'test')

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC_btn_OK'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Rate'))

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_FinishQuote'))

String capturedvalue = WebUI.getText(findTestObject('submissionId'))

println('Submission Id is ' + capturedvalue)

//path to excel
//String excelpath = "////resources//TESTING//Katalon//PortalOutput//SubmissionId.xlsx"
//String excelpath ="C://savedata//data.xlsx"
//Define Folder Path -- // savedata is name of folder  , and data.xlsx is excel file  // 
//just change the C:// - to your specific location --> the code will create afolder as savedata automatically and write aexcelfile as data.xlsx based on run 
String folderpath = 'C://savedata/'

//Create Folder if it doenst exist
File folder = new File(folderpath)

if (!(folder.exists())) {
    folder.mkdirs()
}

//define File path
String excelpath = folderpath + '/data.xlsx'

FileInputStream inputStream = null

Workbook workbook = null

try {
    inputStream = new FileInputStream(excelpath)

    workbook = new XSSFWorkbook(inputStream)
}
catch (IOException e) {
    workbook = new XSSFWorkbook()
} 
finally { 
    if (inputStream != null) {
        inputStream.close()
    }
}

Sheet sheet = workbook.getSheet('capturedvalue')

if (sheet == null) {
    sheet = workbook.createSheet('capturedvalue')
}

if ((sheet.getLastRowNum() == 0) && (sheet.getRow(0) == null)) {
    Row headerRow = sheet.createRow(0)

    Cell headerCell = headerRow.createCell(0)

    headerCell.setCellValue('SubmissionID')
}

int lastrownum = sheet.getLastRowNum()

Row row = sheet.createRow(lastrownum + 1)

Cell cell = row.createCell(0)

//cell.setCe
//Cell headerCell = row.
cell.setCellValue(capturedvalue)

FileOutputStream fileOut = new FileOutputStream(excelpath)

workbook.write(fileOut)

fileOut.close()

