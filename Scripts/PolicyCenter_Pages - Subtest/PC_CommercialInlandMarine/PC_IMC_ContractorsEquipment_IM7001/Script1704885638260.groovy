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

WebUI.click(findTestObject('Object Repository/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Contractors Equipment'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_Checkbox_IM7001'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001_Textbox_CatastropheLimit'), 
    '25000')

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001_Textbox_CatastropheLimit'), 
    Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001_Dropdown_Deductible'), 
    'Deductible250', true)

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001_Dropdown_Deductible'), 
    Keys.chord(Keys.TAB), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsRquipment_IM7001Schedule_Button_Add'))

WebUI.waitForPageLoad(10)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001Schedule_Textbox_EquipmentType'), 
    'Cranes & Derricks', true)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001Schedule_Textbox_Description'), 
    'test')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001Schedule_Textbox_Limit'), 
    '25000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7001Schedule_Textbox_BasicLoad'), 
    '1')

