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

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellaneousForms_IM7341_DroneCoverage_CheckBox'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneOperationDescription'), 
    'testing')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_CatastropheLimit'), 
    '9000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_Deductible'), 
    'Deductible1000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_CoverageType'), 
    'Blanket', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_BlanketDroneLimit'), 
    '15000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneCoverageCoinsurance'), 
    'BRCoinsurance50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneCoverageValuation'), 
    'Replacement Cost', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneEquipmentCoverage'), 
    'Coverage Not Provided', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneEquipmentCoinsurance'), 
    'BRCoinsurance70', true)

WebUI.selectOptionByValue(findTestObject('Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_Actual Cash ValueReplacement Cost_1'), 
    'Actual Cash Value', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneCargoCoverage'), 
    'Drone Cargo Coverage', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneCargoDescription'), 
    'king')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_DroneCargoLimit'), 
    '18000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_IM7341_ElectricalDisturbance'), 
    'Electrical disturbance exclusion waived', true)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_input_IMC7341_NewlyAcquiredDrone_CheckBox'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_input_IMC7341_NewlyAcquiredDrone_Limit'), 
    '25000')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_input_IMC7341_NewlyAcquiredEquipment_CheckBox'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_MiscellameousForms_input_IMC7341_NewlyAcquiredEquipment_Limit'), 
    '25000')

