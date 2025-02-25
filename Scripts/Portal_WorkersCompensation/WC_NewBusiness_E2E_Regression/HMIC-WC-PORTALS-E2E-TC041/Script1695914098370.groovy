import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import internal.GlobalVariable as Keys
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.comment('HMIC-WC-PORTALS-E2E-TC041')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_CreateAccount'), [('Address1') : Address1, ('City') : City
        , ('AddressType') : AddressType, ('AgencyName') : AgencyName, ('ProducerCode') : ProducerCode, ('ZipCode') : Zipcode
        , ('State') : State, ('TCName') : TCName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

LOB = WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_InitiateSubmission'), [('State') : State, ('LOB') : LOB
        , ('TCName') : TCName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_PolicyInfo'), [('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_Locations'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State Coverages')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_StateCoverages'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Line Coverages')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Supplemental')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_WorkersCompensation/PC_WC_Supplemental'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('User should able to search the quote in Portal')

WebUI.click(findTestObject('Portal/Portal_Common_Tab_Quote'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Quote_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

String subNum = GlobalVariable.SubmissionNumber

if (subNum.contains('Submission')) {
    subNum = subNum.replace('Submission ', '')
}

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : subNum]))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification', 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(5)

WebUI.comment('Prequalification statement should be displayed.')

WebUI.mouseOver(findTestObject('Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Portal/Portal_PreQual_Button_Agree'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextLoc'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextStateCov'))

WebUI.click(findTestObject('Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.click(findTestObject('Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.click(findTestObject('Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextQuote'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Portal/Portal_Quote_Button_NextAdditionalInfo'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info')

WebUI.setText(findTestObject('Portal/Portal_AddInfo_TextArea_DescriptionOfOp'), 'Individual')

WebUI.click(findTestObject('Portal/Portal_AccAndinsCont_button_EditIcon'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'))

WebUI.setText(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'), '8567123411')

WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'))

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Test')

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'Person')

WebUI.setText(findTestObject('Portal/Portal_FirstCall_TextBox_EmailAddress'), 'ssomasundaram@hastingsmutual.com')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_Checkbox_LossHistory'))

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_input_LossHistory_DateOfLoss'))

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_LossHistory_DateOfLoss'), '01/01/2021')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_input_LossHistory_Description'))

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_LossHistory_Description'), 'ENTERED FOR TESTING PURPOSE')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_Button_LossHistory_Save'))

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_Chckbox_PriorCarrierInfo'))

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_Carrier_PriorCarrierInfo'), 'HANOVER INSURANCE COMPANY')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_input_EffectiveDate_PriorCarrierInfo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_EffectiveDate_PriorCarrierInfo'), '01/01/2020')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_input_ExpirationDate_PriorCarrierInfo'))

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_ExpirationDate_PriorCarrierInfo'), '01/01/2021')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_Container_PriorCarrierInfo'))

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_button_Save_PriorCarrierInfo'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextReview'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.comment('User should be able to quote the submission in Portal')

String SubmissionNumber = GlobalVariable.SubmissionNumber

WebUI.takeFullPageScreenshot()

WebUI.comment('Login to PC and approve UW issues')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.SubmissionNumber = SubmissionNumber.replace('Quote No. ', '')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysisScreen_ApproveUWIssues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Quote_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

String sub = GlobalVariable.SubmissionNumber

if (sub.contains('Submission')) {
    sub = sub.replace('Submission ', '')
}

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : sub]))

WebUI.waitForPageLoad(5)

WebUI.takeFullPageScreenshot()

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextPayment'))

WebUI.waitForElementHasAttribute(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 9: Payment', 10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 9: Payment')

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_PaymentPlan_Radio_Monthly'))

WebUI.click(findTestObject('Portal/Portal_Payment_PaymentPlan_Radio_Monthly'))

WebUI.click(findTestObject('Portal/Portal_Payment_CheckBox_DeferDownPayment'))

WebUI.waitForPageLoad(20)

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), 'AgentName')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactEmail'), 'abc@gmail.com')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentPhoneNum'), '8567123411')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_Submit'))

WebUI.click(findTestObject('Portal/Portal_Payment_Button_PleaseConfirmPopUp_SubmitPayment'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Portal/Portal_SubSuccess_Label_ApplicationIssued'), 'This application has been issued. Please contact your underwriter with questions.', 
    FailureHandling.OPTIONAL)

String polNum = WebUI.getText(findTestObject('Portal/Portal_SubSuccess_Label_PolNum'))

GlobalVariable.PolicyNumber = polNum.replace('Policy No. ', '')

WebUI.comment('Policy issued successfully in Portal')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_UserDropdown_Button_Arrow'))

WebUI.click(findTestObject('Portal/Portal_UserDropdown_TypeList_LogOut'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

