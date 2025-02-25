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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Tab_PriorLosses'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Dropdown_LossHistoryType'), LossHistoryType, 
    false)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_DateCalender_OccuranceDate'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_Button_Today_OccuranceDate'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLosses_TextField_Description'), 'Loss')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_DateCalender_ClaimDate'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_Button_Today_ClaimDate'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_TextField_TotalIncured'), '50000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_TextField_AmountPaid'), '6000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_TextField_OpenReserve'), '10000')

if (subrogation.equals('No')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_RadioButton_No'))
} else {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_PriorLossess_RadioButton_Yes'))
}

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_HistoricalLossess_Dropdown_Status'), 
    HistoricalLossesStatus, false)

