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

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_EquipmentSalesAndRental_CheckBox_InsideAndOutsideBuilding'))

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleTextBox_Description'), 
    'Description')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleTextBox_SpecialPerilsLoad'), 
    '0.05')

if (ESR_InOutBuilding_PropertyInsideBuilding.equals('Yes')) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_PropertyInsideBuildings'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleTextBox_PropertyInsideBuildingsLimit'), 
        '25000')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_EquipmentIntendedForSale'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_EquipmentYouLeaseOrRentToOthers'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_EquipOfOthersYouAreRepairingOrServicing'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_PropInside_ScheduleDropdown_PartsAccessoriesFluidAndLubricationSuppliesAndTires'), 
        'Yes', true)
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_PropertyInsideBuildings'), 
        'No', true)
}

if (ESR_InOutBuilding_PropertyOutsideBuilding.equals('Yes')) {
    WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_PropertyOutsideBuildings'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleTextBox_PropertyOutsideBuildingLimit'), 
        '20000')

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleTextBox_BasicLoad'), 
        '0.05')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_EquipIntendedForSale'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_EquipYouLeaseOrRentToOthers'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_EquipOfOthrsYouAreRepairingOrServicing'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_PropOutside_ScheduleDropdown_PartsAccessoriesFluidAndLubricationSuppliesAndTires'), 
        'Yes', true)
} else {
    WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_PropertyOutsideBuildings'), 
        'No', true)
}

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_OwnOrLease'), 
    'Owned', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_InsideAndOutsideBuilding_ScheduleDropdown_NewOrUsed'), 
    'New', true)