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

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_CreateAccount'), [('Address1') : Address1, ('City') : City
        , ('AddressType') : AddressType, ('AgencyName') : AgencyName, ('ProducerCode') : ProducerCode, ('ZipCode') : ZipCode
        , ('State') : State, ('County') : County], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_InitiateSubmission'), [('State') : State, ('LOB') : LOB], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PolicyInfo'), [(YearBusinessStarted) : YearBusinessStarted
        , (LegalEntity) : LegalEntity, ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

if (!(AddCertificateHolders.equals('')) && AddCertificateHolders.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PolicyInfo_NewPerson_AddNewCertificateHolders'), 
        [('CertificateHolder_Address1') : CertificateHolder_Address1, ('CertificateHolder_City') : CertificateHolder_City
            , ('CertificateHolder_AddressType') : CertificateHolder_AddressType, ('CertificateHolder_State') : CertificateHolder_State
            , ('CertificateHolder_ZipCode') : CertificateHolder_ZipCode], FailureHandling.STOP_ON_FAILURE)
}

if (!(AddPremiumFinance.equals('')) && AddPremiumFinance.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PolicyInfo_NewPerson_AddNewPremiumFinance'), 
        [('PremiumFinance_ZipCode') : PremiumFinance_ZipCode, ('PremiumFinance_Address1') : PremiumFinance_Address1, ('PremiumFinance_City') : PremiumFinance_City
            , ('PremiumFinance_AddressType') : PremiumFinance_AddressType], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Property')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_CommercialPropertyScreen'), [('RiskType') : RiskType
        , ('CoverageforCertifiedActsofTerrorism') : CoverageforCertifiedActsofTerrorism], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_CP_Locations'), [('EarthquakeTerritoryOrZone') : EarthquakeTerritoryOrZone
        , ('EarthquakeCauseofLossForm') : EarthquakeCauseofLossForm, ('PC_CP_Location_TerrorismTerritory') : PC_CP_Location_TerrorismTerritory], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State-Specific Information')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Blankets')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_Risks_AddBuilding'), [('CP_ClassCode') : CP_ClassCode
        , ('NewBuilding_StructureMineSubsidence_StructureType') : NewBuilding_StructureMineSubsidence_StructureType, ('NewBuilding_StructureMineSubsidence_Limit') : NewBuilding_StructureMineSubsidence_Limit
        , ('NewBuilding_EQCauseOfLossCoverage') : NewBuilding_EQCauseOfLossCoverage, ('NewBuilding_EQConstructionClass') : NewBuilding_EQConstructionClass
        , ('RoofTankHazard') : RoofTankHazard], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Modifiers')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Supplemental')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Supplemental'), [('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Policy Review')

WebUI.takeFullPageScreenshot()

