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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_BuildersRisk_CheckBox_IM7980'))

WebUI.waitForPageLoad(15)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_Dropdown_Catastrophe'), 
    'Single Catastrophe', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_TextBox_SingleCatastropheLimit'), 
    '21000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_Dropdown_Coinsurance'), 
    '80%', true)

if (AddNewLocation.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddNewLocation'), [('BuildersRiskCoverage') : BuildersRiskCoverage
            , ('NewLocationZipCode') : NewLocationZipCode, ('NewLocationAddress') : NewLocationAddress, ('NewLocationState') : NewLocationState
            , ('NewLocationCity') : NewLocationCity], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleTextBox_DescriptionOfCivilWorksProject'), 
    'Project1')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleTextBox_Limit'), 
    '25000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleDropdown_ConcentrationOfValues'), 
    '25% or Less', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleTextBox_BasicLoad'), 
    '0.025')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleCalenderButton_JobCommencement'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleCalenderButton_JobCompletion'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_JobCompletion_ScheduleButton_Today'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleTextBox_ContractAmount'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleTextBox_OwnerSuppliedPropertyAmount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_ScheduleTextBox_JobsiteSecurityDescription'), 
    'Security1')

