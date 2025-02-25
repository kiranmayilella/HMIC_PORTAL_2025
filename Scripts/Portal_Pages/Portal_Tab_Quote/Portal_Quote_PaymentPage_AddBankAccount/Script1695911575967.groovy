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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Payment_btn_AddNewPaymentMethod'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Payment_RadBtn_BankAccount'))

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_Routing_BankAcct'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_Routing_BankAcct'), '072404320')

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_AcctNum_BankAcct'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AcctNum_BankAcct'), '123456700')

WebUI.click(findTestObject('Portal/Portal_Payment_TextBox_ConfirmAcctNum_BankAcct'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_ConfirmAcctNum_BankAcct'), '123456700')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_CreditCard_SAVE'))

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('Portal/Portal_Payment_Select_CreditCard_SavedPaymentMethod'), FailureHandling.OPTIONAL)

