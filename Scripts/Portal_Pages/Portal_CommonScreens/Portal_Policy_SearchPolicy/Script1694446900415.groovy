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

WebUI.comment('User should able to search the policy in Portal')

WebUI.click(findTestObject('Portal/Portal_Policies_AIM_Dashboard'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Portal/Portal_Policies_Header_PolManDashboard'), 'Policy Management Dashboard')

String polNum = PolicyNumber

WebUI.click(findTestObject('Portal/Portal_PolManDashboard_btn_NewCancellation'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Portal/Portal_PolicyChange_PolManDashboard_Policy_TextBox_SearchFor'), polNum)

WebUI.click(findTestObject('Portal/Portal_PolicyChange_PolManDashboard_Policy_btn_Search'))

