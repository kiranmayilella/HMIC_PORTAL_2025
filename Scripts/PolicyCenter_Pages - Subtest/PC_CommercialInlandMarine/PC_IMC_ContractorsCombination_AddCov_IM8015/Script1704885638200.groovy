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

WebUI.comment('8015')

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Dropdown_WaitingPeriod'), 'BRWatingPrd24', 
    true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Dropdown_AdditionalSoftCosts'), 
    'No', true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Dropdown_ExtraExpense'), 'No', 
    true)

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Dropdown_RentalIncome'), 'Yes', 
    true)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Textbox_RentalIncome30DayLimit'), '25000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Textbox_RentalIncomeOccuranceLimit'), '25000')

WebUI.waitForPageLoad(20)

WebUI.selectOptionByIndex(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM8015_Dropdown_Schedule_JobsiteLocation'), 
    1)

