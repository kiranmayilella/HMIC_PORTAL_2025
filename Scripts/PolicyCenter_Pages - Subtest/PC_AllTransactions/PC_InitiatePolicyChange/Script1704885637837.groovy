import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.org.apache.bcel.internal.generic.RETURN as RETURN
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Actions'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_ActionsLink_PolicyChange'))

if (!(PolicyChange_AddDays.equals('0'))) {
Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String PolicyChange_EffectiveDate = format.format(d)

Calendar c = Calendar.getInstance()

c.setTime(d)

c.add(Calendar.DAY_OF_MONTH, Integer.parseInt(PolicyChange_AddDays))

Date currentDatePlus = c.getTime()

PolicyChange_EffectiveDate = format.format(currentDatePlus)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartPolicyChange_TextBox_EffectiveDate'), PolicyChange_EffectiveDate)

}
WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartPolicyChange_TextBox_Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartPolicyChange_TextBox_Description'), 'Policy Change')

if (!(StartPolicyChangeReasons.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartPolicyChange_Select_Reasons'), StartPolicyChangeReasons, 
        false)
}

if (!(StartPolicyChangeReasons2.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartPolicyChange_Select_Reasons'), StartPolicyChangeReasons2, 
        false)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_StartPolicyChange_Button_Next'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_InfoBarTransactionStatus'), 'Policy Change (Draft)')

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Policy Info')

PolicyChange_TransactionNumber = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

CucumberKW.comment('Policy change initiated successfully - ' + PolicyChange_TransactionNumber)

return PolicyChange_TransactionNumber