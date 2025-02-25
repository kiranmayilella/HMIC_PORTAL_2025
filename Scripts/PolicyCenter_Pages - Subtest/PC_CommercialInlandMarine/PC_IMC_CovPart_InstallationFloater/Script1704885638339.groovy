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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Installation Floater')

if (InstallationFloaterCoverage.equals('IM 7100')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_InstallationFloater_IM7100'), [
            ('IM7100_PropertyCovered') : IM7100_PropertyCovered], FailureHandling.STOP_ON_FAILURE)
}

if (InstallationFloaterCoverage.equals('IM 7102')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_InstallationFloater_IM7102'), [
            ('IM7102_ScheduledContractorsEquipment') : IM7102_ScheduledContractorsEquipment], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_InstallationFloater_Transportation'), 
    [:], FailureHandling.STOP_ON_FAILURE)

if (AddAdditionalCoverage.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    if (CoverageNumber.equals('IM 7114')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_InstallationFloater_AddCov_IM7114'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
    
    if (CoverageNumber.equals('IM 7129')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_InstallationFloater_AddCov_IM7129'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.waitForPageLoad(60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Inland Marine')

