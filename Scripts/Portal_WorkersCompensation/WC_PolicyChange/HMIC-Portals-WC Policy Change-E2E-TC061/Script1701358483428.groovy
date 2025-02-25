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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.comment('HMIC-Portals-WC Policy Change-E2E-TC061')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_StartANewBusiness'), [('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_AccInfoAndPolDetails'), [('State') : State, ('ZipCode') : ZipCode
        , ('Address1') : Address1], FailureHandling.STOP_ON_FAILURE)

getSSN = WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_GetPolicyDetailsData_NB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_Locations'), [('TotalPayroll') : TotalPayroll], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

locCount_NB = WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_GetLocationsCount_NB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.click(findTestObject('Portal/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCov_Dropdown_TypeList_OtherStates'))

WebUI.click(findTestObject('Portal/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCov_Select_OtherStates_non-monopolistic'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_SupplementalQues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_Quote'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Quote_Button_NextAdditionalInfo'))

WebUI.setText(findTestObject('Portal/Portal_AddInfo_TextArea_DescriptionOfOp'), 'Individual')

WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_FirstName'), 'AccAndIns_FirstName')

WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

WebUI.sendKeys(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'), Keys.chord('8567123411'))

WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'))

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Test')

WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'Person')

WebUI.setText(findTestObject('Portal/Portal_FirstCall_TextBox_EmailAddress'), 'abc@hastingsmutual.com')

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_MI_BureauID'), '867567898')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextReview'))

String SubmissionNumber = GlobalVariable.SubmissionNumber

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

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

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Quote_TextBox_SearchFor'), GlobalVariable.SubmissionNumber)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : GlobalVariable.SubmissionNumber]))

WebUI.takeFullPageScreenshot()

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextPayment'))

WebUI.waitForPageLoad(5)

String totalPremium_NB = WebUI.getText(findTestObject('Portal/Portal_Payment_text_TotalPremium'))

String totalPremium_NBS = totalPremium_NB.replace('.00', '')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_IssuePolicy'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_Initiate_PolicyChange'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_CheckPolicyDetailsData_PolicyChange'), [('getSSN') : getSSN], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_PolicyChange_PolicyDetailsPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_LineCoverages_AddWaiverOfSub_Indiana'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_PolicyChange_LineCoveragesPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Portal/Portal_Review_PolicyChange_CalculateBtn_NewPremium'))

WebUI.waitForPageLoad(30)

WebUI.verifyNotEqual(findTestObject('Portal/Portal_Review_PolicyChange_text_NewPremium'), totalPremium_NBS)

WebUI.click(findTestObject('Portal/Portal_PolicyChange_Button_ReviewChanges'))

WebUI.waitForPageLoad(20)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_Submit_PolicyChange'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.comment('Login to PC and cancel the policy')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.SubmissionNumber = SubmissionNumber.replace('Quote No. ', '')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchPolicy'), [('PolicyNumber') : GlobalVariable.PolicyNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_Transactions/PC_PolicySummary_AssignPolicyChangeActivity'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Review_PolicyChange_text_NewPremium'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysis_HandleUWIssues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

