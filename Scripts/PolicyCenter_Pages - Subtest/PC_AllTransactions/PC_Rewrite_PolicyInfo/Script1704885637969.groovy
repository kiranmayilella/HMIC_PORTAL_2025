import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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
import org.openqa.selenium.Keys as Keys

Rewrite_TransactionNumber = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

WebUI.comment('Rewrite transaction initiated successfully ' + Rewrite_TransactionNumber)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_PolicyInfo_Label_RewriteWarningMsg'), 
    RewriteWarningMessage)

WebUI.comment('UW should received warning message - ' + RewriteWarningMessage)

WebUI.doubleClick(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Rewrite_PolicyInfo_Label_RewriteWarningMsg'))

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

Rewrite_ReceivedDate = format.format(d)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ReceivedDate'), Rewrite_ReceivedDate)

if (!(Rewrite_EffectiveAddDays.equals('0')) && !(Rewrite_EffectiveAddDays.equals(''))) {
    Date dt = new Date()

    SimpleDateFormat format1 = new SimpleDateFormat('MM/dd/yyyy')

    String RewriteSubmission_EffectiveDate = format1.format(dt)

    Calendar c = Calendar.getInstance()

    c.setTime(dt)

    c.add(Calendar.DAY_OF_MONTH, Integer.parseInt(Rewrite_EffectiveAddDays))

    Date currentDatePlus = c.getTime()

    RewriteSubmission_EffectiveDate = format1.format(currentDatePlus)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_LOB_RewritePolicyInfo_Textbox_EffectiveDate'), 
        RewriteSubmission_EffectiveDate)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Click_OutSide'))

    WebUI.waitForPageLoad(30)
}

if (!(Rewrite_LegalEntity.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Dropdown_LegalEntity'), 
        Rewrite_LegalEntity, false)
}

if (Rewrite_AssignNewPolicyNumber.equals('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_PolicyInfo_Assignnewpolicynumber'))
}

if (Rewrite_AdditionalNamedInsured.equals('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_AdditionalNamedInsureds_Button_Add'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_AddNewPerson'))

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_NewPerson_ExistingAddress_NewAdditionalNamedInsured'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

