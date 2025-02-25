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

boolean protectionClassOverride = false

protectionClassOverride = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Location_Dropdown_ProtectionClassOverride'), 
    0, FailureHandling.OPTIONAL)

if (protectionClassOverride.equals(true)) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Location_Dropdown_ProtectionClassOverride'), 
        '2', false)
}

boolean earthquakeTerritoryOrZone = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Locations_Dropdown_EarthquakeTerritoryOrZone'),
	0, FailureHandling.OPTIONAL)

if (earthquakeTerritoryOrZone.equals(true)) {
	WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Locations_Dropdown_EarthquakeTerritoryOrZone'),
		'24', true)
}

boolean terrorismTerritory = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Locations_Dropdown_TerrorismTerritory'),
	0, FailureHandling.OPTIONAL)

if (terrorismTerritory.equals(true)) {
	WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Locations_Dropdown_TerrorismTerritory'),
		'Remainder of Cook County (excluding Chicago ZIP Codes)', true)
}

boolean classCode = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Loc_Button_ClassCodeSearch'), 
    0, FailureHandling.OPTIONAL)

if (classCode.equals(true)) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Loc_Button_ClassCodeSearch'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ClassCodeSearch_TextBox_ClassCode'), ClassCode)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ClassCodeSearch_Button_Search'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ClassCodeSearch_Button_Select'))
}

boolean constructionType = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Loc_Dropdown_ConstructionType'), 
    0, FailureHandling.OPTIONAL)

if (constructionType.equals(true)) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Loc_Dropdown_ConstructionType'), 'Frame', 
        true)
}

boolean FireTaxName = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Location_Button_SearchFireTaxName'), 
    0, FailureHandling.OPTIONAL)

if (FireTaxName.equals(true)) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Locations_FireTax'), [:], FailureHandling.STOP_ON_FAILURE)
}

boolean Sprinkler = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Locations_DropDown_Sprinkler'), 
    0, FailureHandling.OPTIONAL)

if (Sprinkler.equals(true)) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Locations_DropDown_Sprinkler'), 'Yes', 
        true)
}