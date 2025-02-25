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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Select_IM7102_InstallationFloaterCoverage_CheckBox'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_Catastrophe Limit_InstallationFloaterCov'), 
    '2500')

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_Select_DeductibleType_InstallationFloaterCov'), 
    'Single Deductible', true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_Select_Deductible_InstallationFloaterCov'), 
    'Deductible1000', true)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_input_InstallationReceipts_InstallationFloaterCov'), 
    '50')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_input_BasicLoad_InstallationFloaterCov'), '0.11')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_input_LengthOfJob_InstallationFloaterCov'), 
    '10')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_InfoBarTransactionStatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(15)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_InstallationFloater_YesNo_DropDown_InstallationFloaterCov'), 
    'Yes', false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_input_Yes_InstallationFloaterLimit'), '2450')

if (IM7102_ScheduledContractorsEquipment.equals('Schedule Equipment')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_ScheduleContractorsEquipment_ScheduleEquipment_InstallationFloaterCov'), 
        IM7102_ScheduledContractorsEquipment, false)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7102_ScheduleTextBox_Equipment'), 
        'Equipment1')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7102_ScheduleTextBox_Limit'), 
        '25000')
}

if (IM7102_ScheduledContractorsEquipment.equals('Schedule on File')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_ScheduleContractorsEquipment_ScheduleOnFile_InstallationFloaterCov'), 
        IM7102_ScheduledContractorsEquipment, false)
}

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_input_AllScheduledContractors_InstallationFloaterCov'), 
    '2500')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_input_ContractorsEquipmentBasicLoad_InstallationFloaterCov'), 
    '1.1')

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_ScheduleContractorsEquipementValuation_InstallationFloaterCov'), 
    'Actual Cash Value', true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_ContractorsEquipmentLeasedOrRentedFromOthers_InstallationFloaterCov'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_OwnedLeasedOrRentedTools_InstallationFloaterCov'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7102_select_EmployeeTools_InstallationFloaterCov'), 
    'No', true)

