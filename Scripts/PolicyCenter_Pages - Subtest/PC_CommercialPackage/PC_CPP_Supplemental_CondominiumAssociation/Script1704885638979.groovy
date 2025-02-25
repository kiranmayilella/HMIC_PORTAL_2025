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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_CalenderButton_DateIncorporated'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_DateIncorporated_Button_Today'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_NumberOfUnits'), 
    '10', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_AverageUnitValue'), 
    '5', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_PercentageOfUnitsSold'), 
    '15', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_PercentageOfUnitsUnsold'), 
    '35', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_PercentageOfUnitsRentedOrLeased'), 
    '50', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_TotalNumberOfDirectorsAndOfficers'), 
    '10', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_TotalNumberOfEmployees'), 
    '60', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CondominiumAssociation_TextBox_LimitsOfLiabilityRequested'), 
    '10', FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

