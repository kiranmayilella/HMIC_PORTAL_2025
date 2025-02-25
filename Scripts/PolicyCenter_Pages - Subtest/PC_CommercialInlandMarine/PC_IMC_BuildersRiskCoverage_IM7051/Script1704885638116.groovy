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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_BuildersRisk_CheckBox_IM7051'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_TextBox_BuildersRiskCatastropheLimit'), 
    '23000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_TextBox_DelayInCompletionCatastropheLimit'), 
    '1000')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_JobDescription'), 
    'Job1')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleDropdown_ConstructionType'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_Limit'), 
    '25000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_BasicLoad'), 
    '0.07')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleCalenderButton_JobCommencement'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_JobCompletion'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_ContractAmount'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_OwnerSuppliedPropertyAmount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7051_ScheduleTextBox_JobsiteSecurityDescription'), 
    'Security')

