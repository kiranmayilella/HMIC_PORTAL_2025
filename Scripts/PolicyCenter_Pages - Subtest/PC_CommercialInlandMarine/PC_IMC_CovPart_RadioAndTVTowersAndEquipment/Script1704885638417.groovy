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

if (Add_IM7600_RadioTVTowerEquipment.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_IM7600_RadioAndTVTowersAndEquipment'), 
        [('OffSiteCoverageLimit') : '20000', ('BasicLoad') : '1', ('Valuation') : 'Actual Cash Value', ('Description') : 'test'
            , ('SpecialPerilsLoad') : '0.1', ('BroadCastEquipmentLimit') : '25000', ('WindLoadingZone') : 'A:', ('IM7600ScheduleBasicLoad') : '0.55'], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('IM 7600 Broadcasting Equipment And Tower Coverage should be added')
}

if (Add_IM7601_RadioTVTowerEquipment.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_IM7601_RadioAndTVTowersAndEquipment'), 
        [('OffSiteCoverageLimit') : '6580', ('BasicLoad') : '1.50', ('Valuation') : 'Replacement Cost', ('Description') : 'test'
            , ('SpecialPerilsLoad') : '0.1', ('BroadCastEquipmentLimit') : '25000', ('WindLoadingZone') : 'A:', ('IM7600ScheduleBasicLoad') : '0.55'
            , ('TowerandDishesLimit') : '2000', ('TeleCommunicationEquipmentLimit') : '25000', ('BroadCastSoftwareLimit') : '25000'], 
        FailureHandling.STOP_ON_FAILURE)
}

if (IM7600_RadioAndTVTowersAndEquipment_SupplementalCoverages.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_IM7600_RadioAndTVTowersAndEquipment_SupplementalCoverages'), 
        [('BroadcastSoftwareLimit') : '6000', ('DamageToBuildingAndPersonelProperty') : '110000', ('NewlyAcquiredPremisesLimit') : '110000'
            , ('NewlyPurchasedEquipmentLimit') : '110000', ('PollutantCleanupAndRemovalLimit') : '15000', ('SewerBackupCoverageLimit') : '2000'
            , ('Offering') : 'Coverage Provided', ('EarthquakeLimit') : '6000', ('EarthquakeCatastropheLimit') : '12000'
            , ('EarthquakeDeductibleAmount') : '250', ('EarthquakeZone') : '3 , 4 or 5', ('EarthquakeLoad') : '0.02'], FailureHandling.STOP_ON_FAILURE)
}

if (IM7601_RadioAndTVTowersAndEquipment_SupplementalCoverages.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_IM7601_RadioAndTVTowersAndEquipment_SupplementalCoverages'), 
        [('DamageToBuildingAndPersonelProperty') : '55000', ('LibraryCoverageLimit') : '10000', ('NewlyAcquiredPremisesLimit') : '110000'
            , ('NewlyPurchasedEquipmentLimit') : '55000', ('PollutantCleanupAndRemovalLimit') : '12000', ('SewerBackupCoverageLimit') : '1000'
            , ('RewardsLimit') : '12000', ('LimitAnyOneOccuranceLimit') : '10000', ('Offering') : 'Coverage Provided', ('EarthquakeLimit') : '10000'
            , ('EarthquakeCatastropheLimit') : '12000', ('EarthquakeDeductibleAmount') : '250', ('EarthquakeZone') : '1 or 2'
            , ('EarthquakeLoad') : '0.02'], FailureHandling.STOP_ON_FAILURE)
}

if (RadioAndTVTowersAndEquipment_AddCov_IM7611.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_RadioAndTVTowersAndEquipment_AddCov_IM7611_IncomeCoveragePart'), 
        [('IM7611_CoverageType') : 'Extra Expense only', ('IM7611_Coinsurance') : '70%', ('IM7611_InterruptionbyCivilAuthority_NumberofDays') : '60'
            , ('IM7611_PeriodofLossExtension_NumberofDays') : '60', ('IM7611_NewlyAcquiredPremisesLimit') : '55000', ('IM7611_SewerBackup') : 'Coverage Provided'
            , ('IM7611_SewerBackupLimit') : '30000', ('IM7611_EarthquakeCoverage') : 'Coverage Provided', ('IM7611_EarthquakeCatastropheLimit') : '25000'
            , ('IM7611_EarthquakeLimit') : '20000', ('IM7611_RestorationPeriod') : '60', ('IM7611_IncomeLimit') : '10000'
            , ('IM7611_LossOfIncomeModification') : 'Network hookup at transmitter site', ('IM7611_IncomeCoverageWaitingPeriod') : '24 Hours'], 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

