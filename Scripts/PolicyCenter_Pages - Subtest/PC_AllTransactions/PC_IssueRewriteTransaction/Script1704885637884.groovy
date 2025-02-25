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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Payment')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Payments_RadioButton_PaymentPlan', [('PaymentPlan') : PaymentPlan]), 
    FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_Button_IssuePolicy'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_Button_IssuePolicy'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 30)

TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), FailureHandling.STOP_ON_FAILURE)

Errormessage = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_WarningMessageOrErrorMessage'),
	FailureHandling.OPTIONAL)

if (TitleName.equals('Payment')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Payments_RadioButton_PaymentPlan', [('PaymentPlan') : PaymentPlan]), 
        FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(30)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_Button_IssuePolicy'))

    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(30)
}

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_WarningMessageOrErrorMessage'), 
    30)

Errormessage = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_WarningMessageOrErrorMessage'), 
    FailureHandling.OPTIONAL)

if (Errormessage.equals('Premium is Below $500 Please re quote the transaction.')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_ClearWarning'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_leftPanel_Quote'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Quote')

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PerformEditPolicyTransaction'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Common_Quote'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Payment')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_Button_IssuePolicy'))

    WebUI.acceptAlert()

    WebUI.waitForPageLoad(30)
}

GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))

if (Errormessage.equals('The current quote may not reflect an accurate Premium Size Discount. Please initiate a requote to generate the accurate discount.')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_ClearWarning'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_leftPanel_Quote'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Quote')

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PerformEditPolicyTransaction'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Common_Quote'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Payment')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_Button_IssuePolicy'))

    WebUI.acceptAlert()

    WebUI.waitForPageLoad(30)

    GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))

    not_run: if (!(TitleName.equals('Submission Bound') || TitleName.contains('Issues'))) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_Button_IssuePolicy'))

        not_run: WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Payments_TypeList_IssuePolicy'))

        WebUI.acceptAlert()

        WebUI.takeFullPageScreenshot()
    }
}

