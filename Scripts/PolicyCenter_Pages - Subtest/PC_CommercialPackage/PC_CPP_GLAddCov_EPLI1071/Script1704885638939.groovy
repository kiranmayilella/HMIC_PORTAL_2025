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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_EPLI 1071_Dropdown_RiskMeetEligibility'), 
    'Yes', false)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 25)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_EPLI 1071_Dropdown_SICClassification'), 
    'Agr. Production - Crops', false)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 25)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_EPLI 1071_Dropdown_EachClaimAggregateLimit'), 
    EPLI_EachClaimAggregateLimits, false)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 25)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_EPLI 1071_Dropdown_Deductible'), '5,000', 
    false)

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String retroActiveDate = format.format(d)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_EPLI_TextBox_RetroActiveDate'), retroActiveDate, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot()

