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

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_ComputerCoverage_Select_CheckBox'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Deductible'), 
    'Deductible500', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Valuation'), 
    'Actual Cash Value', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_IncomeCoverageType'), 
    'Income Coverage Not Provided', true)

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Schedule_Button_AddLocation'))

WebUI.mouseOver(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Schedule_MouseOver_ExistingLocation'))

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Schedule_Select_ExistingLocation'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Schedule_Verify_LocationInformationScreen'), 
    'Location Information')

WebUI.click(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Schedule_LocationInfo_Button_Ok'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Verify_ElectronicDataProcessing_ScreenName'), 
    'Electronic Data Processing')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Schedule_ConstructionType'), 
    'IM7Frame', true)

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Textbox_AddCovLoad'), 
    '1')

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Textbox_HardwareLimit'), 
    '25000')

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7201_Textbox_ProgramandaplicationmediaLimit'), 
    '25000')

WebUI.waitForPageLoad(30)

