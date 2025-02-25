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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Radio & TV Towers & Equipment')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Dropdown_CoverageType'), 
    IM7611_CoverageType, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Dropdown_Coinsurance'), 
    IM7611_Coinsurance, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Dropdown_IncomeCoverageWaitingPeriod'), 
    IM7611_IncomeCoverageWaitingPeriod, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Dropdown_InterruptionByCivilAuthorityNoOfDays'), 
    IM7611_InterruptionbyCivilAuthority_NumberofDays, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_DropdownPeriodOfLossExtensionNoOfDays'), 
    IM7611_PeriodofLossExtension_NumberofDays, false)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Textbox_NewlyAcquiredPremisesLimit'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Textbox_NewlyAcquiredPremisesLimit'), 
    IM7611_NewlyAcquiredPremisesLimit, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Dropdown_EarthquakeCoverage'), 
    IM7611_EarthquakeCoverage, false)

if (IM7611_EarthquakeCoverage.contains('Coverage Provided')) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Textbox_EarthquakeCatastropheLimit'), 
        IM7611_EarthquakeCatastropheLimit)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Textbox_EarthquakeLimit'), 
        IM7611_EarthquakeLimit)
}

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Dropdown_SewerBackup'), 
    IM7611_SewerBackup, false)

if (IM7611_SewerBackup.contains('Coverage Provided')) {
    WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Textbox_SewerBackupLimit'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_IncomeCoveragePart_Textbox_SewerBackupLimit'), 
        IM7611_SewerBackupLimit)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Add'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_ExistingLocation'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_ExistingLocation'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ExistingAddress'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_Schedule_Textbox_IncomeLimit'), IM7611_IncomeLimit)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_Schedule_Dropdown_RestorationPeriod'), 
    IM7611_RestorationPeriod, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7611_Schedule_Dropdown_LossOfIncomeModification'), 
    IM7611_LossOfIncomeModification, false)

