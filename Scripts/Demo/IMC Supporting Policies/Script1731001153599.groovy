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

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Add supporting Policies/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/IMC_Supporting Policies_radiobutton'))

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Add supporting Policies/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/IMC_Supporting Policies_Add button'))

WebUI.click(findTestObject('IMC Objects/IMC Add supporting Policies/IMC_SP_Click_DD'))

WebUI.selectOptionByLabel(findTestObject('IMC Objects/IMC Add supporting Policies/IMC_SP_Click_DD'), findTestData('IMC/PolicyNumber/PolicyNumber').getValue(
        14, 2), false)

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Add supporting Policies/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/IMC_Policy Number_Textbox'), 
    findTestData('IMC/PolicyNumber/PolicyNumber').getValue(13, 2))

