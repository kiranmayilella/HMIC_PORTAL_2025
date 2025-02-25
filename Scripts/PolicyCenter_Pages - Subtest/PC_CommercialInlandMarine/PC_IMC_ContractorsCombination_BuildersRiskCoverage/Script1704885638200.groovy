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

WebUI.comment('BuildersRiskCoverage')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Checkbox_BuildersriskCov'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_BasicLoad'), 
    BasicLoad)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Dropdown_BuildersRiskConstructionType'), 
    BuildersRiskConstructionType, true)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRiskLimitForAllBuildersRiskPro'), 
    LimitForAllBuildersRiskPro)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_ScheduleJobSite'), 
    scheduleJobSite)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_ScheduleJobDescription'), 
    scheduleJobDescription)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_ScheduleLimit'), 
    BuildersRiskScheduleLimit)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_CalenderButton_BuildersRikCov_ScheduleJobCommencement'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Button_Today'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_CalenderButton_BuildersRikCov_ScheduleJobCompletion'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Button_Today'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_ScheduleContractAmt'), 
    ScheduleContractAmt)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_ScheduleOwnerSuppliedPropAmt'), 
    ScheduleOwnerSuppliedPropAmt)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ContractorsCombination_Textbox_BuildersRikCov_ScheduleSecurityDescription'), 
    ScheduleSecurityDescription)

