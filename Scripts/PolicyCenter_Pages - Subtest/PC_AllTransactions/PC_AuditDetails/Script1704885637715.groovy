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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Audit_Leftpanel_Link_Details'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Details')

if (!(PremOpAuditedExposure.equals(''))) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/Pc_AuditDetails_Textbox_AuditedExposure'), 
        PremOpAuditedExposure)
}

if (!(ProdCoAuditedExposure.equals(''))) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/Pc_AuditDetails_Textbox_AuditedExposure'), 
        ProdCoAuditedExposure)
}

if (!(OwnCoAuditedExposure.equals(''))) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/Pc_AuditDetails_Textbox_AuditedExposure'), 
        OwnCoAuditedExposure)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AuditDetails_Button_CalculatePremiums'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Premiums')

