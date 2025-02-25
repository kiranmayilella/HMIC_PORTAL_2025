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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Exposures')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_Button_Add'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_TypeList_SublineName'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_TypeList_Location1'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_Button_Search'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Class Code Search')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_ClassCodeSearch_TextBox_ClassCode'), 
    ClassCode)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_ClassCodeSearch_Button_Search'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Locations_Button_StandardizeSelect'))

WebUI.takeFullPageScreenshot()

boolean eleARateELPOverride = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ExposureInformation_TextBox_ARateOrELPOverride'), 
    5, FailureHandling.OPTIONAL)

if (eleARateELPOverride.equals(true)) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ExposureInformation_TextBox_ARateOrELPOverride'), 
        '1', FailureHandling.STOP_ON_FAILURE)
}

if (Subline.equals('Premises/Operations and Products/Completed Operations')) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_Dropdown_PremOpBIDeductible'), 
        PremOpBIDeductible, false)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_Dropdown_PremOpPDDeductible'), 
        PremOpPDDeductible, false)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_TextBox_ExposureValue'), 
        Exposures)
} else if (Subline.equals('Products/Completed Operations')) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_Dropdown_PremOpBIDeductible'), 
        '750 Per Claim', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_Dropdown_PremOpPDDeductible'), 
        '750 Per Claim', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_TextBox_ExposureValue'), 
        '25000')
} else {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Exposures_TextBox_ExposureValue'), 
        Exposures)
}

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_SublineSelection_Button_OK'))

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Exposures']), 
    60)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Exposures']), 
    60)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Exposures']), 
    60)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Exposures']), 
    60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Exposures')

WebUI.takeFullPageScreenshot()

