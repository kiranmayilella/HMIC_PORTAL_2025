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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://policycenter.qa4.hastingsmutual.com/pc/PolicyCenter.do')

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Contractors Equipment'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_IM 7002 Contractors Equipment - Blank_c32a5f'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Catastrophe Limit_IM7ContractorsEquip_7873aa'), 
    findTestData('IMC/7002/IM7002').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Equipment Limit_IM7ContractorsEquipme_d09627'), 
    findTestData('IMC/7002/IM7002').getValue(2, 1))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Basic Load_IM7ContractorsEquipmentPop_bf1e0d'), 
    findTestData('IMC/7002/IM7002').getValue(3, 1))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Basic Load_IM7ContractorsEquipmentPop_bf1e0d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_none2505001,0002,5005,00010,00025,000'), 
    findTestData('IMC/7002/IM7002').getValue(5, 1), true)

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_OK'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_CPCoverage Part SelectionACAdditional C_48933d'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Actions'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Copy Submission'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Next'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Coverage Name_SubmissionWizard-LOBWiz_4cb8f9'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Remove'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Remove'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Submission (Draft)Commercial Inland Mar_c0a10e'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Contractors Equipment'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_IM 7000 Contractors Equipment - Compr_cdd66f'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Catastrophe Limit_IM7ContractorsEquip_74610e'), 
    findTestData('IMC/7000/IMC7000').getValue(2, 1))

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_none2505001,0002,5005,00010,00025,000_1'), 
    '<none>', true)

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_No data to display_gw-click-overlay'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_NewUsed_IM7ContractorsEquipmentPopup-_772e7a'), 
    'toyota')

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Description should include Manufactur_3fc541'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_NewUsed_IM7ContractorsEquipmentPopup-_d89ee4'), 
    '0.745')

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneOwnedLeased'), 
    '<none>', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneOwnedLeased'), 
    'Owned', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneNewUsed'), 
    'New', true)

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_OK'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_AdAdd'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Contractors Equipment'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_IM 7002 Contractors Equipment - Blank_35567f'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Catastrophe Limit_IM7ContractorsEquip_e9a95b'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Basic Load_IM7ContractorsEquipmentPop_80ba77'), 
    '')

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_No data to display_gw-click-overlay'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Basic Load_IM7ContractorsEquipmentPop_80ba77'), 
    '0.495')

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_No data to display_gw-click-overlay'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Your Tools Limit_IM7ContractorsEquipm_f54869'), 
    '10000')

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneYesNo'), 
    '<none>', true)

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_No data to display_gw-click-overlay'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Employee Tool Limit_IM7ContractorsEqu_a7a94b'), 
    '20000')

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneYesNo_1'), 
    '<none>', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/select_noneYesNo_1'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_LeasedRented Tool Limit_IM7Contractor_42bd20'), 
    '25000')

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_No data to display_gw-click-overlay'))

