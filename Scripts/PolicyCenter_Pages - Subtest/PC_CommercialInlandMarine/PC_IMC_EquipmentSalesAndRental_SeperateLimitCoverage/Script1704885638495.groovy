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

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_EquipmentSalesAndRental_CheckBox_SeperateLimitCoverage'))

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_Description'), 
    'Description1')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_SpecialPerilsLoad'), 
    '0.05')

if (ESR_SeperateLimitCov_PropertyInsideBuilding.equals('Yes')) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_PropertyInsideBuildings'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_EquipmentIntendedForSale'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_EquipmentIntendedForSaleLimit'), 
        '25000')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_EquipmentYouLeaseOrRentToOthers'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_EquipmentYouLeaseOrRentToOthersLimit'), 
        '2000')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_EquipmentOfOthersYouAreRepairingOrServicing'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_EquipmentOfOthersYouAreRepairingOrServicingLimit'), 
        '200')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropInside_ScheduleDropdown_PartsAccessoriesFluidAndLubricationSuppliesAndTires'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropInside_ScheduleTextBox_PartsAccessoriesFluidAndLubricationSuppliesAndTiresLimit'), 
        '200')
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_PropertyInsideBuildings'), 
        'No', true)
}

if (ESR_SeperateLimitCov_PropertyOutsideBuilding.equals('Yes')) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_PropertyOutsideBuildings'), 
        'Yes', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleDropdown_EquipmentIntendedForSale'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleTextBox_EquipmentIntendedForSaleLimit'), 
        '200')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleDropdown_EquipmentYouLeaseOrRentToOthers'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleTextBox_EquipmentYouLeaseOrRentToOthersLimit'), 
        '200')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleDropdown_EquipmentOfOthersYouAreRepairingOrServicing'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleTextBox_EquipmentOfOthersYouAreRepairingOrServicingLimit'), 
        '200')

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleDropdown_PartsAccessoriesFluidAndLubricationSuppliesAndTires'), 
        'Yes', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_PropOutside_ScheduleTextBox_PartsAccessoriesFluidAndLubricationSuppliesAndTiresLimit'), 
        '200')
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_PropertyOutsideBuildings'), 
        'No', true)
}

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_BasicLoad'), 
    '0.05')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleTextBox_LeasedOrRentedEquipFactor'), 
    '1.5', FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_OwnOrLease'), 
    'Owned', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_EquipmentSalesAndRental_SeperateLimitCov_ScheduleDropdown_NewOrUsed'), 
    'New', true)

