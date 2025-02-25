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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_ReleaseLock'), FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter_LogOut/span_PC_Menu_Button_Settings'))

LoggedinUsername = WebUI.getText(findTestObject('PolicyCenter_LogOut/div_PC_LogOut_TypeList_LogOut'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

if (LoggedinUsername.contains('testuwsup2')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'Test Supervisor2 (Commercial Tech)', 
        false, FailureHandling.OPTIONAL)
} else if (LoggedinUsername.contains('testproc3')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'Test Processor3 (Processing)', 
        false, FailureHandling.OPTIONAL)
} else if (LoggedinUsername.contains('testproc1')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'Test Processor1 (Commercial Tech)', 
        false, FailureHandling.OPTIONAL)
} else if (LoggedinUsername.contains('AutoTestproc3')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'AutoTestproc3 AutoTestproc3 (Underwriting)', 
        false, FailureHandling.OPTIONAL)
} else if (LoggedinUsername.contains('AutoTestproc1')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'AutoTestProc1 AutoTestProc1 (Processing)', 
        false, FailureHandling.OPTIONAL)
} else {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'AutoTestProc1 AutoTestProc1 (Processing)', 
        false, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Button_Release'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

