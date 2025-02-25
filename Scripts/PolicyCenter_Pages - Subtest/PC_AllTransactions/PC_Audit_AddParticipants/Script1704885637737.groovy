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

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Verify_Participants_ScreenName'), 
    'Participants')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Add'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Participants_PremiumAuditor'), 
    'Premium Auditor', true)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Participants_Click_btn_SelectUser'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Audit_AddParticipant_SelectUser_UserName'), 'Testauditsup2')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Participants_SearchUser_btn_Search'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Participants_SearchUser_btn_Select'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Participants_Select_AssignedGroup'), 
    'Audit Processors', true)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Audit_Participants_Click_btn_Save'))

