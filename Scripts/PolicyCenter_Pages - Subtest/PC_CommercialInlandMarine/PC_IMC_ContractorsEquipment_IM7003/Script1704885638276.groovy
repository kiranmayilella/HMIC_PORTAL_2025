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

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7003_Select_CheckBox'))

WebUI.setText(findTestObject('Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Catastrophe Limit_IM7ContractorsEquip_e9a95b'), 
    '3500')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7003_BasicLoad'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7003_Select_Deductible'), 
    'Deductible1000', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7003_YourToolsLimit'), 
    '4500')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7003_Select_EmployeeTool'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7003_LeasedRentedTool'), 
    'No', true)

