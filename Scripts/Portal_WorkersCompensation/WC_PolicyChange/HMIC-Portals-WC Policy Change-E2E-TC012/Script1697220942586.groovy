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

WebUI.comment('HMIC-Portals-WC Policy Change-E2E-TC012')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_StartANewBusiness'), [('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_AccInfoAndPolDetails'), [('State') : State, ('ZipCode') : ZipCode
        , ('Address1') : Address1], FailureHandling.STOP_ON_FAILURE)

getSSN = WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_GetPolicyDetailsData_NB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_Locations'), [('TotalPayroll') : TotalPayroll], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Portal/Portal_Loc_btn_AddLocation'))

WebUI.click(findTestObject('Portal/Portal_Loc_radiobtn_NonSpecLoc'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Loc_TextBox_NonSpec_LocDesc'), 'Non Specific Location')

WebUI.click(findTestObject('Portal/Portal_Loc_TypeList_Dropdwn_NonSpecLocState'))

WebUI.click(findTestObject('Portal/Portal_Loc_Select_NonSpecLoc_Indiana'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

WebUI.click(findTestObject('Portal/Portal_Loc_NonSpecific_TextBox_WorkClassification'))

WebUI.click(findTestObject('Portal/Portal_Loc_WorkClassification_NonSpecLoc_Select_0005_IN'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '5000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

WebUI.click(findTestObject('Portal/Portal_Loc_btn_StandardizeAddress'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

locCount_NB = WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_GetLocationsCount_NB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

WebUI.click(findTestObject('Portal/Portal_StateCov_Chkbox_ExpRating'))

WebUI.setText(findTestObject('Portal/Portal_StateCov_input_ExpRating'), '2.66')

WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCoverages_BlanketCheckBox_Unchecked'))

WebUI.click(findTestObject('Portal/Portal_LineCoverages_TypeList_BlanketWaiverOfSub'))

WebUI.click(findTestObject('Portal/Portal_LineCov_Blanket_Select_Iowa'))

WebUI.click(findTestObject('Portal/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCov_Blanket_ButtonSave'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE3/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_Cov_SeByCondition'))

WebUI.click(findTestObject('Portal/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCov_ConclusionExclusion_ 000305 - JointVenture'))

WebUI.click(findTestObject('Portal/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCov_ConclusionExclusion_Button_Add Selected'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_SupplementalQues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_Quote'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Quote_Button_NextAdditionalInfo'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Tab_Quote/Portal_Quote_AdditionalInfo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_IA_BureauID'), '867567898')

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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

WebUI.waitForPageLoad(10)

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

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_CheckLocationsCount_PolicyChange'), [('locCount_NB') : locCount_NB], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Portal/Portal_PolicyChange_LocationPage_PrimaryLocIcon'), 0)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_PolicyChange_LocationsPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_PolicyChange_StateCoveragesPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_PolicyChange_LineCoveragesPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_Transactions/Portal_PolicyChange_AdditionalInfoPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Portal/Portal_Review_PolicyChange_text_NewPremium'), totalPremium_NBS)

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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyChange_button_IssuePolicy'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysis_HandleUWIssues'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SaveData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

