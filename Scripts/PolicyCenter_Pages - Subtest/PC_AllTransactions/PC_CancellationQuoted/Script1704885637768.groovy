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
import org.testng.Assert as Assert

String TransactionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionStatus'))

boolean flag = false

if (TransactionStatus.contains('Quoted')) {
    flag = true
}

Assert.assertTrue(flag, 'Cancellation transaction status is Quoted')

String Cancellation_TransactionNumber = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_SaveDraft'))

WebUI.waitForPageLoad(20)

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_Button_BindOptions'))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_TypeList_CancelNow'))

not_run: WebUI.acceptAlert()

WebUI.waitForPageLoad(20)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation_Label_InfoBarStatus'), 'Cancellation (Quoted)')

