import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule as Schedule
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Select_CheckBox'))

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Select_CoveredProperty'), 
    'Schedule on File', true)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Select_CoveredProperty'), 
    'Schedule on File', false)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_CatastropheLimit'), 
    IM7000_CatastropheLimit)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_BasicLoad'), 
    IM7000_BasicLoad)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Coinsurance'), 
    'Coinsurance70', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_DeductibleType'), 
    'CEDeducFlatDeduc', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_DeductibleType'), 
    'Flat Deductible', false)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Deductible'), 
    'Deductible500', true)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Deductible'), 
    '500', false)

if (IM7000_CoveredProperty.equals('Schedule Equipment')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_ContractorsEquipment'), 
        [('IM7000_CoveredProperty') : 'Schedule Equipment'], FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Select_CoveredProperty'), 
        'Schedule Equipment', true)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Add'))

    WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Schedule_EquipmentType'), 
        'Cranes & Derricks', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Schedule_Description'), 
        'test')

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Schedule_Limit'), 
        '7500')

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsEquipment_IM7000_Schedule_BasicLoad'), 
        '1.5')
}

