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

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7719_Dropdown_ToolsIntendedForSale'), IM7719_ToolsIntendedForSale, 
    false)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7719_TextBox_ToolsIntendedForSaleLimit'), IM7719_ToolsIntendedForSaleLimit)

WebUI.waitForPageLoad(10)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7719_Dropdown_ToolsYouLeaseOrRentToOthers'), 
    IM7719_ToolsYouLeaseOrRentToOthers, false)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7719_TextBox_ToolsYouLeaseOrRentToOthersLimit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7719_TextBox_ToolsYouLeaseOrRentToOthersLimit'), 
    IM7719_ToolsYouLeaseOrRentToOthersLimit)

WebUI.waitForPageLoad(10)

