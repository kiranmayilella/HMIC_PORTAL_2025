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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Contractors\' Combination')

WebUI.comment('PartLevelInformation')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_CatastropheLimit'), 
    '25000')

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Dropdown_DeductibleType'), 
    'CCDeducCovProp', true)

if (EquipmentToolsCov.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_ContractorsCombination_EquipmentToolsCoverage'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (ElectronicBusinessEquipmentCov.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_ContractorsCombination_ElectronicBussinessEquipmentCoverage'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (BildersRiskCov.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_ContractorsCombination_BuildersRiskCoverage'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('Transportation')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Transportation_Textbox_AmountShipped'), 
    '25000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Transportation_Textbox_PercentageForApplicantVehicles'), 
    '20')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Transportation_Textbox_PercentageContractCarrier'), 
    '20')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Transportation_Textbox_DistanceInvolved'), 
    '200')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_SupplementalCoverages_Tab_ContractorCombination'))

WebUI.waitForPageLoad(10)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_SupplementalCoveragesTab_ContractorsCombination_Dropdown_WaitingPeriod'), 
    '24 Hours', false)

if (AddAdditionalCoverage.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    if (CoverageNumber.contains('IM 8015')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_ContractorsCombination_AddCov_IM8015'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

