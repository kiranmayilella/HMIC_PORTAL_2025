import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Manufacturing_TextArea_WebsiteAddress'), 
    'Address', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Manufacturing_CheckBox_ManufactureCompleted_CompletedProduct'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Manufacturing_ManufactureCompleted_TextArea_DescribeProduct'), 
    'Product', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_ManufactureComponentParts_Used'), 
    'Part', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_ManufactureComponentPart_Tolerance'), 
    'Component', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextBox_ListOfCustomers'), 
    'Customers', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_DiscontinuedProducts'), 
    'Product', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_ControlProgram'), 
    'Control Program', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_ManufacturingProcess'), 
    'Process', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_ListOfMachineryUsed'), 
    'CNC', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_ListOfMachines'), 
    'Machines', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_TextArea_AmountOfFlammableLiquid'), 
    'Liquid', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_Perform_CheckBox_HeatTreating'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(40, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ManufacturingSupplQues_Perform_TextArea_ProvideDetails'), 
    'Details', FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

