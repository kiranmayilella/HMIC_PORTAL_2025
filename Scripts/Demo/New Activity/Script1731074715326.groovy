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

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Actions (1)'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_NANew Activity'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('IMC Objects/IMC Coverages/IMC_Request'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/div_Review and Approve'))

WebUI.setText(findTestObject('Object Repository/IMC Objects/IMC Coverages/Page_DEV mode - 10.1.1.1463 Guidewire Polic_b28feb/input_Description_NewActivityWorksheet-NewA_36498c'), 
    findTestData('IMC/NewActivity Text/NewActivity Text').getValue(1, 2))

WebUI.click(findTestObject('IMC Objects/IMC Coverages/IMC_btn_OK'))

