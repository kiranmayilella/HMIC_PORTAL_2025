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

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Prior Policies'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Add'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Total Losses_SubmissionWizard-Job_Ris_3bb92b'), 
    findTestData('IMC/Risk Analysis/Risk Analysis').getValue(1, 2))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Total Losses_SubmissionWizard-Job_Ris_6411f6'), 
    findTestData('IMC/Risk Analysis/Risk Analysis').getValue(2, 2))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Total Losses_SubmissionWizard-Job_RiskA_a36184'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_31'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_64c1fb'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_84c017'), 
    '')

WebUI.doubleClick(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_84c017'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_84c017'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_a915aa'), 
    '')

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input__SubmissionWizard-Job_RiskAnalysisScr_a915aa'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Prior Losses'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NeNext'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_RaRate'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Actions (1)'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NANew Activity'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Review and Approve'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Description_NewActivityWorksheet-NewA_36498c'), 
    'test')

