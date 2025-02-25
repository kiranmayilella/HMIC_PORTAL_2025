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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Additional Insured')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalInsured_Dropdown_Type'), NewAdditionalInsured_Type, 
    false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'AdditionalInsured_FirstName')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        3))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), AdditionalInsured_Address1)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'))

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), 'Keys.TAB')

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), AdditionalInsured_City)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(20)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_State'), State, false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), AdditionalInsured_ZipCode)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Icon_AddressAutoFill'))

WebUI.waitForPageLoad(20)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'), AdditionalInsured_AddressType, 
    false)

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalInsured_Button_OK'))

