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

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Dropdown_ModelHomes'), 
    ModelOffices, false)

WebUI.waitForPageLoad(20)

if (ModelOffices.contains('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_ModelHomesLimit'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_ModelHomesLimit'), 
        ModelOfficesLimit)

    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_ModelHomesLimit'), 
        Keys.chord(Keys.TAB))

    WebUI.waitForPageLoad(20)
}

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Dropdown_SalesOffices'), 
    SalesOffices, false)

WebUI.waitForPageLoad(20)

if (SalesOffices.contains('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_SalesOfficesLimit'))

    WebUI.waitForPageLoad(20)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_SalesOfficesLimit'), 
        SalesOfficesLimit)

    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_SalesOfficesLimit'), 
        Keys.chord(Keys.TAB))

    WebUI.waitForPageLoad(20)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_SalesOfficesFactor'), 
        SalesOfficesFactor)

    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Textbox_SalesOfficesFactor'), 
        Keys.chord(Keys.TAB))
}

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7973_Dropdown_DeductibleAmount'), 
    DeductibleAmount, false)

