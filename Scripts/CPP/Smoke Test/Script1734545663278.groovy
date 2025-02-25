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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://agencyportal.qa1.hastingsmutual.com/quotes/cpp')

WebUI.setText(findTestObject('Object Repository/CPP/Page_Hastings Insurance - Login/input_USERNAME_UserName'), 'admin8020')

WebUI.setEncryptedText(findTestObject('Object Repository/CPP/Page_Hastings Insurance - Login/input_PASSWORD_Password'), 
    'wnoxtXU/hjBWldglQVct5g==')

WebUI.sendKeys(findTestObject('Object Repository/CPP/Page_Hastings Insurance - Login/input_PASSWORD_Password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Package/span_Cargo Insurance when written as such w_908e0a'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Package/span_Agree'))

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
WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_ZipCode'), '49058')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_CreateNewAcc'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 'Add a New Account')

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), 'IL-83 Antioch IL USA')

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_b66ff7/div_0008020-0000-HOUSE House Code'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_StandardizeAddress_Button_Continue'))

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal/Portal_NewAccountCreated_Label_AccountNum'))

WebUI.click(findTestObject('Portal/Portal_NewAccountCreated_Button_Continue'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_5dfe3c/span_Next Policy Details'))

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/input_Year Business Started_businessStartedYear'), 
    '2019')

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/textarea_Description of Business and Operat_e252ae'), 
    't')

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/textarea_t'), 'te')

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/textarea_te'), 'tes')

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/textarea_tes'), 'test')

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/div_Trust'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/div_Trust'))

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/input_FEIN_contact-s5kyvs4qs-feinId'), 
    '34-6789999_')

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/span_Save'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_2c3a54/span_Next Locations'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_f84621/div_10040 - Appliance Distributors - househ_b8bb1c'))

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_f84621/input_Classification_classCode'), 
    'carp')

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_f84621/div_91342 - CarpentryUnknown'))

WebUI.setText(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_f84621/input__amount'), 
    '20000')

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_f84621/span_Save'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_f84621/span_Next Line Coverages'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_bbf9c1/button_Next State Coverages'))

WebUI.click(findTestObject('Object Repository/CPP/Page_HMIC Agency Portal - Commercial Packag_9abe25/span_Next Quote'))

