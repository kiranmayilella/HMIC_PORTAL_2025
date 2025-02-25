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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_ButtonOptions_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Add_ListOfSchedule'))

WebUI.waitForPageLoad(30)

if (!(Type_AddNewPerson.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_AddNewPerson_DropDown_Type'), Type_AddNewPerson, 
        false)
}

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + 
    RandomStringUtils.randomAlphabetic(5))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), ZipCode)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), Address1)

WebUI.waitForPageLoad(15)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

if (!(City.equals(''))) {
    WebUI.clearText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'))

    WebUI.waitForPageLoad(15)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), City)

    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

    WebUI.waitForPageLoad(30)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Button_StandardizeAddress'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EnterAccInfo_Button_StandardizeAddressSelect'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'), 'Billing', 
    true)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalInsured_Button_OK'))

