import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_Checkbox_IM7252TripTransitCoverage'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Dropdown_RatingType'), 
    RatingType, true)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textarea_Described Property'), 
    'Test')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textbox_CommodityClassificationFactor'), 
    '1.1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textbox_Catastrophe Limit'), 
    '5000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textbox_NumberofVehicles(PowerUnits)'), 
    '5')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textbox_TripTransitModification'), 
    '0.75')

if (RatingType.equals('Per Vehicle')) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_PerVehicle_Textbox_OwnedVehicleAnnualValueShippedSales'), 
        '500000')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_PerVehicle_Click_Outside'))

    WebUI.waitForPageLoad(30)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_PerVehicle_Textbox_OwnedVehicleLimit'), 
        '50000')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_PerVehicle_Textbox_OwnedVehiclesLoad'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_PerVehicle_Textbox_OwnedVehiclesLoad'), 
        '0.085')

    WebUI.waitForPageLoad(20)
}

if (RatingType.equals('Volume Shipment')) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_VolumeShipment_Textbox_Aircraft AnnualValueShippedSales'), 
        '50000')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_VolumeShipment_Click_Outside'))

    WebUI.waitForPageLoad(30)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_VolumeShipment_Textbox_AircraftLimit'), 
        '50000')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_VolumeShipment_Textbox_AircraftLoad'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_VolumeShipment_Textbox_AircraftLoad'), 
        '0.13')
}

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String DateOfShipmentFrom = format.format(d)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_DateOfShipmentFrom'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_DateOfShipmentFrom'), 
    DateOfShipmentFrom)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Select_DateOfShipmentTo'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Select_TodayDate'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textbox_ShippedFrom'), 
    'Test')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7252TripTransitCoverage_Textbox_ShippedTo'), 
    'Test2')

