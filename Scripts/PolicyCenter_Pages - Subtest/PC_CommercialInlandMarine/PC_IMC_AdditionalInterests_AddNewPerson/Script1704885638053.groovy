import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
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
import org.openqa.selenium.Keys as Keys

WebUI.scrollToElement(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Button_Add'), 10)

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Button_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Button_Add'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_TypeList_AddNewPerson'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Dropdown_InterestType'), 
    InterestType, true)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'Auto_FirstName')

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Textbox_ZipCode'), ZipCode)

WebUI.sendKeys(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Keys.chord(
        Keys.TAB))

WebUI.waitForPageLoad(40)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Textbox_Address1'), Address1)

WebUI.waitForPageLoad(40)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'), 
    'Billing', true)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Button_StandardizeAddress'))

WebUI.waitForPageLoad(40)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Select_StandAddress'))

WebUI.waitForPageLoad(40)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Button_Ok'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_Dropdown_InterestType'), 
    InterestType, false)

WebUI.selectOptionByIndex(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterests_ScheduleDropdown_Jobsite'), 
    1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_AdditionalInterest_ScheduleTextBox_ItemDescription'), 
    'Item1')

