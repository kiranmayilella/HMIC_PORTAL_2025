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
import static org.junit.Assert.*
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Account_TypeList_Arrow'), 15)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Account_TypeList_Arrow'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Account_TypeList_NewAccount'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + 
    RandomStringUtils.randomAlphabetic(5))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), ZipCode)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Button_Search'))

WebUI.waitForPageLoad(10)

WebUI.scrollToElement(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccountInformation_Button_CreateNewAccount'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccountInformation_Button_CreateNewAccount'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccountInformation_Button_CreateNewAccount'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_TypeList_Person'))

WebUI.takeFullPageScreenshotAsCheckpoint('Enter Account Information')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), Address1)

WebUI.waitForPageLoad(15)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(15)

if (!(City.equals(''))) {
    WebUI.clearText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'))

    WebUI.waitForPageLoad(15)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), City)

    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

    WebUI.waitForPageLoad(30)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Button_StandardizeAddress'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Button_StandardizeAddressSelect'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'), findTestData(
        'IMC/Account/account').getValue(8, 2), true)

WebUI.takeFullPageScreenshot()

not_run: WebUI.selectOptionByValue(findTestObject('IMC Objects/IMC Coverages/IMC_Legal_Entity'), findTestData('IMC/Account/account').getValue(
        13, 2), false)

WebUI.setText(findTestObject('IMC Objects/IMC Coverages/IMC_Agency_Code'), findTestData('IMC/Account/account').getValue(
        9, 2))

not_run: WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_SearchIconButton_Agency'))

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_TextBox_AgencyName'), 'AssuredPartners')

not_run: WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_AgencySearch_Button_Search'))

not_run: WebUI.setText(findTestObject(null), '')

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Button_Select'))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC_Nickname'))

//WebUI.waitForElementVisible(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Dropdown_ProducerCode'), findTestData(
//      'IMC/Account/account'), 10)
WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Dropdown_ProducerCode'), findTestData(
        'IMC/Account/account').getValue(10, 2), true)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Imc_FaxPhone'), findTestData('IMC/Account/account').getValue(11, 
        2))

//WebUI.setText(findTestObject('IMC Objects/IMC Coverages/Imc_Primary_Email'), findTestData('IMC/Account/account').getValue(
//      12, 2) + ' ')
WebUI.waitForElementVisible(findTestObject('IMC Objects/IMC Coverages/Imc_Primary_Email'), 15)

String excelvalue = findTestData('IMC/Account/account').getValue(12, 2)

//div/input[@name="CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress1"]
WebUI.executeJavaScript((('var element = document.evaluate("//div/input[@name=\'CreateAccount-CreateAccountScreen-CreateAccountDV-CreateAccountContactInputSet-EmailAddress1\']", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;' + 
    'element.value=\'') + excelvalue) + '\';', null)

//WebUI.sendKeys(findTestObject('IMC Objects/IMC Coverages/Imc_Primary_Email'), findTestData('IMC/Account/account').getValue(
//      12, 2) + ' ')
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CreateAccount_Button_Update'), 
    15)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CreateAccount_Button_Update'))

WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AccountSummary_Label_AccountNumber'), 15)

WebUI.takeFullPageScreenshot()

'Saving the Account Number in parameter'
GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_AccountSummary_Label_AccountNumber'))

WebUI.takeFullPageScreenshot()

