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

WebUI.comment('Portal_NewBusiness')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Common_Tab_Policies'))

WebUI.click(findTestObject('Portal/Portal_PolicyChange_PolicyManDashboard_btn_NewPolChange'))

WebUI.setText(findTestObject('Portal/Portal_PolicyChange_PolManDashboard_Policy_TextBox_SearchFor'), GlobalVariable.PolicyNumber)

WebUI.click(findTestObject('Portal/Portal_PolicyChange_PolManDashboard_Policy_btn_Search'))

WebUI.click(findTestObject('Portal/Portal_PolicyChange_PolManDashboard_Policies_Table_PolicySearch'))

WebUI.waitForElementPresent(findTestObject('Portal/Portal_PolicyChange_StartPage_textbox_Description'), 60)

WebUI.sendKeys(findTestObject('Portal/Portal_PolicyChange_StartPage_textbox_Description'), 'Initiate Policy Change')

WebUI.click(findTestObject('Portal/Portal_PolicyChange_StartPage_btn_ReviewOrEditPolicy'))

