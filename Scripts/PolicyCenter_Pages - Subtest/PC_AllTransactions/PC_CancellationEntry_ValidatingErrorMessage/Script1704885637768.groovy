import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_Dropdown_Source'), Cancellation_Source, 
    false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_Dropdown_Reason'), Cancellation_Reason, 
    false)

WebUI.waitForPageLoad(30)

if (!(Cancellation_RefundMethod.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_Dropdown_RefundMethod'), 
        Cancellation_RefundMethod, false)

    WebUI.waitForPageLoad(30)
}

WebUI.waitForPageLoad(30)

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

CancellationEffectiveDate = format.format(d)

Calendar c = Calendar.getInstance()

c.setTime(d)

c.add(Calendar.DAY_OF_MONTH, Integer.parseInt(Cancellation_EffectiveAddDays))

Date currentDatePlus = c.getTime()

CancellationEffectiveDate = format.format(currentDatePlus)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_TextBox_CancellationEffectiveDate'))

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_TextBox_CancellationEffectiveDate'), 
    CancellationEffectiveDate)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_TextBox_CancellationEffectiveDate'), 
    Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(50)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_TextBox_ReceivedDate'))

Date d1 = new Date()

Cancellation_ReceivedDate = format.format(d)

Calendar c1 = Calendar.getInstance()

c1.setTime(d1)

c1.add(Calendar.DAY_OF_MONTH, Integer.parseInt(Cancellation_ReceivedAddDays))

Date currentDatePlus1 = c1.getTime()

Cancellation_ReceivedDate = format.format(currentDatePlus1)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_TextBox_ReceivedDate'))

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartCancellation_TextBox_ReceivedDate'), Cancellation_ReceivedDate)

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation2_Label_ErrorMessage'), 'Cannot cancel policy: The policy is already canceled as of this date')

WebUI.doubleClick(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Cancellation2_Label_ErrorMessage'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Cannot cancel policy: The policy is already canceled as of this date')

