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

WebUI.check(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_Checkbox_BroadcastingEquipmentAndTowerCoverage'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_Textbox_OffSiteCoverageLimit'), 
    OffSiteCoverageLimit)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_Textbox_BasicLoad'), 
    BasicLoad)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_Dropdown_Valuation'), 
    Valuation, false)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_ScheduleTextbox_Description'), 
    Description)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_ScheduleTextbox_SpecialPerilsLoad'), 
    SpecialPerilsLoad)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_ScheduleTextbox_BroadCastEquipmentLimit'), 
    BroadCastEquipmentLimit)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_ScheduleDropdown_WindLoadingZone'), 
    WindLoadingZone, false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_RadioAndTVTowersAndEquipment_IM7600_ScheduleTextbox_BasicLoad'), 
    IM7600ScheduleBasicLoad, FailureHandling.STOP_ON_FAILURE)

