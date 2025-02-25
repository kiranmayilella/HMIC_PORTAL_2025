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

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CameraAndMusicalInstrumentDealers_Textbox_CatastropheLimit'), 
    CatastropheLimit)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CameraAndMusicalInstrumentDealers_Dropdown_Coinsurance'), 
    Coinsurance, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CameraAndMusicalInstrumentDealers_Dropdown_Deductible'), 
    Deductible, false)

if (PropertyAwayFromPremises.contains('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CameraAndMusicalInstrumentDealers_Checkbox_PropertyAwayFromPremises'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CameraAndMusicalInstrumentDealers_Textbox_AdditionalLimit-PropertyAwayFromPremises'), 
        AdditionalLimit)
}

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_ExistingLocation'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_ExistingLocation'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ExistingAddress'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Location Information')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_StandardizeAddress'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Select'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), FailureHandling.STOP_ON_FAILURE)

if (TitleName.equals('Location Information')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))
}

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CameraAndMusicalInstrumentCov_Schedule'), 
    [('ItemType') : 'Camera', ('CovScheduleLimit') : '20000'], FailureHandling.STOP_ON_FAILURE)

