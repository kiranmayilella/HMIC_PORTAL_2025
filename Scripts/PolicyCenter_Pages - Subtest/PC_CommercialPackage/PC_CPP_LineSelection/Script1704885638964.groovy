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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Line Selection')

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Dropdown_RiskType'), 
    LineSelection_RiskType, false)

WebUI.takeFullPageScreenshot()

WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'), 
    60)

WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'), 
    60)

if (UnselectLineType_GeneralLiability.equals('Yes')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_GeneralLiability'))

    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(60)

    WebUI.waitForPageLoad(60)
}

if (UnselectLineType_CommercialProperty.equals('Yes')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Checkbox_CommercialProperty'))

    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(60)

    WebUI.waitForPageLoad(60)
}

if (UnselectLineType_Crime.equals('Yes')) {
    WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_CheckBox_Crime'), 
        60)

    WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_CheckBox_Crime'), 
        60)

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_CheckBox_Crime'))

    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(60)

    WebUI.waitForPageLoad(60)
}

if (UnselectLineType_IMC.equals('Yes')) {
    WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_CheckBox_CommercialInlandMarine'), 
        60)

    WebUI.waitForElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_CheckBox_CommercialInlandMarine'), 
        60)

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_CheckBox_CommercialInlandMarine'))

    WebUI.acceptAlert(FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(60)

    WebUI.waitForPageLoad(60)
}

WebUI.waitForPageLoad(30)

not_run: if (LineSelection_RiskType.equals('Select Metalists Program')) {
    not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_LineSelection_Dropdown_ProgramType'), 
        LineSelection_ProgramType, false)
}

WebUI.takeFullPageScreenshot()

