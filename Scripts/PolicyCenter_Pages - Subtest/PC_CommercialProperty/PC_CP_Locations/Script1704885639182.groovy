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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

boolean protectionClassOverride = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Locations_Dropdown_ProtectionClassOverride'), 
    0, FailureHandling.OPTIONAL)

if (protectionClassOverride.equals(true)) {
    WebUI.selectOptionByIndex(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Locations_Dropdown_ProtectionClassOverride'), 
        1, FailureHandling.STOP_ON_FAILURE)
}

boolean earthquakeTerritoryOrZone = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPLocations_Dropdown_EarthquakeTerritoryOrZone'), 
    0, FailureHandling.OPTIONAL)

if (earthquakeTerritoryOrZone.equals(true)) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPLocations_Dropdown_EarthquakeTerritoryOrZone'), 
        EarthquakeTerritoryOrZone, false)
}

boolean terrorismTerritory = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Locations_Dropdown_TerrorismTerritory'), 
    0, FailureHandling.OPTIONAL)

if (terrorismTerritory.equals(true)) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Locations_Dropdown_TerrorismTerritory'), 
        PC_CP_Location_TerrorismTerritory, false)
}

if (!(EarthquakeCauseofLossForm.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPLocations_Dropdown_EarthquakeCauseOfLossForm'), 
        EarthquakeCauseofLossForm, false, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Locations_FireTaxName_Button_SearchIcon'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Fire Tax Code Search', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Locations_FireTaxCodeSearch_Button_Select'), FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

WebUI.takeFullPageScreenshot()

