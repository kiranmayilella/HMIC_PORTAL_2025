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

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_DateEstablished_Button_Calender'))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_supplemental_DateEstablished_Button_CalenderToday'))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_TotalNoOfDirectorsOfficers'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_TotalNoOfDirectorsOfficers'), 
    '10')

not_run: WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_TotalNoOfDirectorsOfficers'), 
    Keys.chord(Keys.TAB))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_TotalNoOfEmps'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_TotalNoOfEmps'), '10')

not_run: WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_TotalNoOfEmps'), Keys.chord(
        Keys.TAB))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_LimitsOfLiabilityRequested'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_LimitsOfLiabilityRequested'), 
    '10')

not_run: WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Textbox_LimitsOfLiabilityRequested'), 
    Keys.chord(Keys.TAB))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NumOfRegAttendees'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NumOfRegAttendees'), '1')

not_run: WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NumOfRegAttendees'), Keys.chord(
        Keys.TAB))

not_run: WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NumOfEmployees'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NumOfEmployees'), '1', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextBox_NumOfEmployees'), Keys.chord(Keys.TAB), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ChurchMembership_CheckBox_Growing'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.takeFullPageScreenshot()

