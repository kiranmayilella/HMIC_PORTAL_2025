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

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_CheckBox'))

WebUI.selectOptionByValue(findTestObject('Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_2505001,0002,5005,00010,00025,000'), 
    'Deductible500', true)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Click_AddLocation'))

WebUI.mouseOver(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_MouseOver_ExistingLocation'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Click_ExistingLocationAddress'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Verify_Schedule_LocationInformation'), 
    'Location Information')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_LocationInformation_OK'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_SpecialPerilsLoad'), 
    '0.13')

WebUI.setText(findTestObject('Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Amount Of Insurance_IM7ElectronicProc_34f02a'), 
    '289000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_Manufacturer'), 
    'Bajaj')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_Model'), 
    'HT20')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_SerialNumber'), 
    'HM789')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_Select_LeasedOrOwned'), 
    'Leased', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_CurrentFullValue'), 
    '75000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ElectronicDataProcessing_IM7200_Schedule_AmountOfInsurance'), 
    '15000')

