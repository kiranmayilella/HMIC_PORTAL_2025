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

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_30daysorless'), 
    '10%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_60daysorless,butmorethan30days'), 
    '20%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_90daysorles,butmorethan60days'), 
    '30%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_120daysorles,butmorethan90days'), 
    '40%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_150daysorles,butmorethan120days'), 
    '50%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_180daysorles,butmorethan150days'), 
    '60%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_210daysorles,butmorethan180days'), 
    '70%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_240daysorles,butmorethan210days'), 
    '80%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_270daysorles,butmorethan240days'), 
    '90%', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_ExclAndCond_CP1507_Dropdown_300daysorles,butmorethan270days'), 
    '100%', false)

WebUI.waitForPageLoad(40)

