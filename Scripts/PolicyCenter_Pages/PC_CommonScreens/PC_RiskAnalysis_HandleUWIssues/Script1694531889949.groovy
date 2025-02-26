import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

if (TitleName.contains('Risk Analysis')) {
    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

    boolean eleSpecialApprove = false

    eleSpecialApprove = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'), 
        5, FailureHandling.OPTIONAL)

    if (eleSpecialApprove.equals(true)) {
        List<TestObjectProperty> specialApproveButton = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'), 
            30)

        specialApproveSize = specialApproveButton.size()

        for (int i = 0; i < specialApproveSize; i++) {
            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'))

            WebUI.acceptAlert()

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

            WebUI.waitForElementVisible(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'), 
                30)

            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

            boolean eleApprove = false
        }
    }
    
    eleApprove = WebUI.verifyElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'), 
        5, FailureHandling.OPTIONAL)

    if (eleApprove.equals(true)) {
        List<TestObjectProperty> approveButton = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'), 
            30)

        approveSize = approveButton.size()

        for (int i = 0; i < approveSize; i++) {
            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'))

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))
        }
    }
    
    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'), FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(60)

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Payment', FailureHandling.OPTIONAL)

    String TransactionName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

    if (TransactionName.contains('Submission')) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Payments_Button_SubmissionOptions'))

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Payments_TypeList_IssuePolicy'))

        WebUI.acceptAlert()
    } else if (TransactionName.contains('Policy Change')) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyChange_button_IssuePolicy'))

		WebUI.acceptAlert(FailureHandling.OPTIONAL)

		WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Policy Change Bound', 
			FailureHandling.STOP_ON_FAILURE)
    } else if (TransactionName.contains('Reinstatement')) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ReinstatementPayment_Button_Reinstate'))

        WebUI.acceptAlert()

        WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Reinstatement Bound')

        GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))
    } else if (TransactionName.contains('Renewal')) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Renewal_Payment_Button_BindOptions'))

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Renewal_Payment_TypeList_IssueNow'))

        WebUI.acceptAlert()

        WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Renewal Bound', 
            FailureHandling.OPTIONAL)

        GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))
    } else if (TransactionName.contains('Cancellation')) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_Button_BindOptions'))

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_TypeList_CancelNow'))

        WebUI.acceptAlert(FailureHandling.OPTIONAL)

        WebUI.waitForPageLoad(30)

        WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Cancellation Bound', 
            FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))
    } else {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_OtherTransaction_Button_IssuePolicy'))

        WebUI.acceptAlert(FailureHandling.OPTIONAL)
    }
}

TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

if (TitleName.contains('Issues')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Issues_Button_Details'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

    boolean eleSpecialApprove = false

    eleSpecialApprove = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'), 
        5, FailureHandling.OPTIONAL)

    if (eleSpecialApprove.equals(true)) {
        List<TestObjectProperty> specialApproveButton = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'), 
            30)

        specialApproveSize = specialApproveButton.size()

        for (int i = 0; i < specialApproveSize; i++) {
            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_SpecialApprove'))

            WebUI.acceptAlert()

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

            WebUI.waitForElementVisible(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'), 
                30)

            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

            boolean eleApprove = false
        }
    }
    
    eleApprove = WebUI.verifyElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'), 
        5, FailureHandling.OPTIONAL)

    if (eleApprove.equals(true)) {
        List<TestObjectProperty> approveButton = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'), 
            30)

        approveSize = approveButton.size()

        for (int i = 0; i < approveSize; i++) {
            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Button_Approve'))

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Approval Details')

            WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))
        }
    }
    
    if (TitleName.equals('Pre-Quote Issues')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Common_Quote'), [:], FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Payment'), FailureHandling.OPTIONAL)

        WebUI.waitForPageLoad(60)

        WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Payment', FailureHandling.OPTIONAL)

        String TransactionName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

        if (TransactionName.contains('Submission')) {
            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Payments_Button_SubmissionOptions'))

            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Payments_TypeList_IssuePolicy'))

            WebUI.acceptAlert()
        } else if (TransactionName.contains('Reinstatement')) {
            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ReinstatementPayment_Button_Reinstate'))

            WebUI.acceptAlert()

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Reinstatement Bound')

            GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))
        } else if (TransactionName.contains('Renewal')) {
            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Renewal_Payment_Button_BindOptions'))

            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Renewal_Payment_TypeList_IssueNow'))

            WebUI.acceptAlert()

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Renewal Bound', 
                FailureHandling.OPTIONAL)

            GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))
        } else if (TransactionName.contains('Cancellation')) {
            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_Button_BindOptions'))

            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_TypeList_CancelNow'))

            WebUI.acceptAlert(FailureHandling.OPTIONAL)

            WebUI.waitForPageLoad(30)

            WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Cancellation Bound', 
                FailureHandling.OPTIONAL)

            GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))
        } else {
            WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_OtherTransaction_Button_IssuePolicy'))

            WebUI.acceptAlert(FailureHandling.OPTIONAL)
        }
    }
}

WebUI.takeFullPageScreenshot()

