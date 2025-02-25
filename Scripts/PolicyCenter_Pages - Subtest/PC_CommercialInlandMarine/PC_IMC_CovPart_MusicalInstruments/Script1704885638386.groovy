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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Musical Instruments')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Dropdown_MI Coverage Type'), MI_CoverageType, 
    false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Dropdown_MI Deductible'), MI_Deductible, 
    false)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_MusicalInstruments_Checkbox_IM1251NamedPerilsCoverage'))

if (MI_CoverageType.contains('Scheduled Property')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Musical Instruments_ScheduledProperty'), 
        [('MI_Coinsurance') : '90%', ('MISchedule_ItemType') : MISchedule_ItemType, ('MISchedule_Description') : 'test', ('MISchedule_Limit') : MISchedule_Limit], 
        FailureHandling.STOP_ON_FAILURE)
}

if (MI_CoverageType.contains('Blanket Property')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Musical Instruments_BlanketProperty'), 
        [('MIConstrctionType') : 'Frame', ('BasicGroupRatingType') : 'Specific', ('MIDanceBandsLimit') : MIDanceBandsLimit
            , ('MIStationaryOrganLimit') : MIStationaryOrganLimit, ('BasicGroupSpecificLossCost') : BasicGroupSpecificLossCost
            , ('Classcode') : Classcode], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

