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

WebUI.comment('HMIC-WC-PORTALS-E2E-TC051')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User is able to Initiate the quote successfully')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LOB_TypeList_WorkersComp'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification')

WebUI.comment('Prequalification statement should be displayed.')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Agree'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information')

WebUI.comment('User successfully navigated to Account Information screen')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Dropdown_SearchOrQuoteFor'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_Individual'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

// + RandomStringUtils.randomAlphabetic(5)
WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_ZipCode'), '46268')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_CreateNewAcc'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 'Add a New Account')

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), '3221 W 86th St')

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal/Portal_NewAccountCreated_Label_AccountNum'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Portal/Portal_NewAccountCreated_Button_Continue'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyDetails_Dropdown_OrgType'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_OrgType_TypeList_Individual'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), Keys.chord('123456789'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyDetails_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_WorkClassification'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_WorkClassification_TypeList_0005'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '50000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

WebUI.comment('Adding State Coverages')

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages')

WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.comment('Adding Line Coverage')

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.comment('SupplementalQuestions')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote')

WebUI.click(findTestObject('Portal/Portal_Quote_Dropdown_ScheduleModifierPercentage'))

WebUI.mouseOver(findTestObject('Portal/Portal_Quote_ScheduleModPercent_Typelist_1Percent'))

WebUI.click(findTestObject('Portal/Portal_Quote_ScheduleModPercent_Typelist_1Percent'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Quote_Dropdown_ScheduleModifierType'))

WebUI.mouseOver(findTestObject('Portal/Portal_Quote_ScheduleModType_TypeList_Debit'))

WebUI.click(findTestObject('Portal/Portal_Quote_ScheduleModType_TypeList_Debit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Quote_EstimatedAnnualPremium_Link_ReCalculate'))

WebUI.waitForPageLoad(10)

WebUI.comment('Added Schedule modifiers in Quote screen.')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Quote_Quote'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.comment('Login to PC and validate the UW issue \'Review Schedule Modification\' should trigger.')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchAccount'), [('AccountNumber') : GlobalVariable.AccountNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Open the submission in PC')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PerformEditPolicyTransaction'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Common_RiskAnalysis_ValidateUWIssueName'), [('UWIssueName') : UWIssueName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('UW issue \'Review Schedule Modification\' triggered successfully in PC - RiskAnalysis')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_StateCoverages'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State Coverages')

WebUI.takeFullPageScreenshot()

WebUI.comment('Override the schedule % modification in PC')

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_TextField_AgencyScheduleModificationPercentage'), 
    '1')

WebUI.comment('Agency Schedule Modification Applied (%) is displayed as 1 which matches with Portal data')

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_TextField_AgencyScheduleModificationType'), 
    'Credit')

WebUI.comment('Agency Schedule Modification Type Applied is displayed appropriately')

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_DropDown_ScheduleModificationTypeOverride'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_DropDown_ScheduleModificationTypeOverride'), 
    'Credit', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_StateCoverages_DropDown_ScheduleModificationOverride'), 
    '1', false)

WebUI.comment('User is able to override the schedule modification% field')

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))

not_run: WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysisScreen_ApproveSpecificUWIssue'), 
    [('UWIssueName') : UWIssueName, ('UWIssueApprovalAllowEdit') : 'No'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

not_run: WebUI.comment('User should able to search the quote in Portal')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_Quote_TextBox_SearchFor'), GlobalVariable.SubmissionNumber)

not_run: WebUI.waitForPageLoad(10)

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

not_run: WebUI.waitForPageLoad(10)

not_run: WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : GlobalVariable.SubmissionNumber]))

