import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

boolean eleApprove = false

eleApprove = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_UWIssueName_Button_Approve', 
        [('UWIssueName') : UWIssueName]), 5, FailureHandling.OPTIONAL)

if (eleApprove.equals(true)) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_UWIssueName_Button_Approve', [('UWIssueName') : UWIssueName]))
}

boolean eleSpecialApprove = false

eleSpecialApprove = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_UWIssueName_Button_SpecialApprove', 
        [('UWIssueName') : UWIssueName]), 5, FailureHandling.OPTIONAL)

if (eleSpecialApprove.equals(true)) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_UWIssueName_Button_SpecialApprove', [('UWIssueName') : UWIssueName]))

    WebUI.acceptAlert()
}

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

if (UWIssueApprovalAllowEdit.equals('No')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskApprovalDetails_AllowEdit_RadioButton_No'))
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_UWIssueName_Button_Reopen', [('UWIssueName') : UWIssueName]), 
    'Reopen')

WebUI.comment(('UW issue - ' + UWIssueName) + ' is approved in Risk Analysis screen')

WebUI.takeFullPageScreenshot()