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

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Tab_AdditionalInsureds'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_AddCoverages'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Search_TextBox_Keyword'), CoverageNumber)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Coverage_Common_Button_Search'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_SearchCoverage_SearchResults_Checkbox', [('CoverageNumber') : CoverageNumber]))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_AddSelectedCoverages'))

WebUI.waitForPageLoad(20)

WebUI.doubleClick(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_AddedCoverageNumber', [('CoverageNumber') : CoverageNumber]))

WebUI.takeFullPageScreenshot()

