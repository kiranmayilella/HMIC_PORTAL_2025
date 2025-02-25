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

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_BusinessComputerCoverage_CheckBox'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Valuation'), 
    'Actual Cash Value', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_CatastropheLimit'), 
    '15000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_DeductibleType'), 
    'AllCoveredPerils', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Deductible'), 
    'Deductible1000', true)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Button_AddLocation'))

WebUI.mouseOver(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_MouseOver_ExistingLocation'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Click_ExistingLocationAddress'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Verify_LocationInfoScreen'), 
    'Location Information')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_LocationInformation_Button_Ok'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Verify_EDP_ScreenName'), 
    'Electronic Data Processing')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Select_ConstructionType'), 
    'IM7Frame', true)

WebUI.setText(findTestObject('Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Web Site Software Modification Factor_c103b7'), 
    '1.12')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_HardwareLimit'), 
    '78900')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Select_ExtraExpenseCoverage'), 
    'Extra Expense Coverage', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_ExtraExpenseLimit'), 
    '25000')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_Click_CoverageExtensionTab'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_CoverageExtension_PowerSupple_500FeetLimitation'), 
    'Waived', true)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7203_Schedule_Verify_EDP_ScreenName'))

