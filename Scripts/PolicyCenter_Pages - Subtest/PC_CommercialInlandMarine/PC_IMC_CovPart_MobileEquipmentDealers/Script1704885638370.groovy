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

if (MobEquipDealrsPropAtPremNotDescribedOnSchdlOfCov.equals('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_CheckBox_PropAtPremisesNotDescribedOnScheduleOfCov'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_PropAtPremNotDescribedOnSchdlOfCov_TextBox_Limit'), 
        '1000')
}

if (MobEquipDealrsPropertyInTransit.equals('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_CheckBox_PropertyInTransit'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_PropInTransit_TextBox_Limit'), 
        '1000')
}

if (MobEquipDealrsNewlyAcquiredLoc.equals('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_CheckBox_NewlyAcquiredLocations'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_NewlyAcquiredLocations_TextBox_Limit'), 
        '1000')
}

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_ScheduleTextBox_PropInsideBuildingLimit'), 
    '1000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MobEquipDealrs_ScheduleTextBox_PropOutsideBuildingLimit'), 
    '1000')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.waitForPageLoad(60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Inland Marine')

