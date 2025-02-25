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

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Transportation_TextBox_AmountShipped'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Transportation_TextBox_AmountShipped'), 
    '200')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Transportation_TextBox_PercentageForApplicantsVehicles'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(15)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Transportation_TextBox_PercentageForApplicantsVehicles'), 
    '10')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Transportation_TextBox_PercentageByCommonOrContractCarrier'), 
    '10')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Transportation_TextBox_DistanceInvolved'), 
    '100')

