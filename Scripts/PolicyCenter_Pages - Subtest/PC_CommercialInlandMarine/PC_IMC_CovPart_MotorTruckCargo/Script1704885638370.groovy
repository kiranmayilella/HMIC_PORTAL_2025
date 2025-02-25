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

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_Verify_Name'), 
    'Motor Truck Cargo')

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_RatingType'), 
    'Per Vehicle', false)

WebUI.waitForPageLoad(10)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_Commodity'), 
    'Agricultural equipment', false)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_CatastropheLimit'), 
    '6500')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_PropertyInVehicleLimit'), 
    '7500')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_NumberOfVehicles'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_NumberOfVehicles'), 
    '8')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_BasicLoad'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_BasicLoad'), 
    '1.4')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_Select_CommonCarrier_CheckBox'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_Coverages_CoveredPropertyDescription'), 
    'test')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_PartLevelInfo_body'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_VehicleInformation_VPN'), 
    '786541211')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_VehicleInformation_ModelYear'), 
    '2015')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_VehicleInformation_Make'), 
    'honda')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_VehicleInformation_Model'), 
    'i78')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_VehicleInformation_RadiusOfOperation'), 
    '78')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_VehicleInformation_Limit'), 
    '75000')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MotorTruckCargo_Coverages_Schedule_Limit'), 
    '7500')

/*
	 * if (MotorTruckCargoCoverage.equals('')) {
	 * WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine
	 * /PC_IMC_MiscellaneousFloater_IM7505'), [:], FailureHandling.STOP_ON_FAILURE)
	 * }
	 */
if (AddAdditionalCoverage.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    if (CoverageNumber.equals('IM 7483')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_MotorTruckCargo_AddCov_IM7483'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.waitForPageLoad(60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Inland Marine')

