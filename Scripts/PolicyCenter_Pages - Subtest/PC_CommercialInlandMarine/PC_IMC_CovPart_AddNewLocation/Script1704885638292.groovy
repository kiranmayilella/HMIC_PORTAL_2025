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

if (BuildersRiskCoverage.equals('IM 7980')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_Button_Add'))

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_TypeList_NewLocation'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7980_TypeList_NewLocation'))
} else {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Add'))

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_NewLocation'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_NewLocation'))
}

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Location Information')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(40)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), NewLocationZipCode)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(40)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_State'))

WebUI.waitForPageLoad(40)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_State'), NewLocationState, 
    false)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_State'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(40)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), NewLocationAddress)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(40, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), NewLocationCity)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(40)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_StandardizeAddress'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Locations_Button_StandardizeSelect'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

