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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Fine Art Floater')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtsFloater_Textbox_CatastropheLimit'), CatastropheLimit_FineArtsFloater)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtsFloater_Dropdown_Deductible'), 
    Deductible_FineArtsFloater, true)

if (FineArtFloater_7401.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_FineArtsFloater_IM7401FineArtCoverage_ComprehensiveForm'), 
        [('IM7401_CoveredFineArts') : 'Schedule on File', ('IM7401_Description') : 'Test', ('IM7401_Limit') : '25000', ('IM7401_SpecialPerilsLoad') : '0.11'
            , ('ScheduleOnFile_SpecialPerilsLoad') : '0.11'], FailureHandling.STOP_ON_FAILURE)
}

if (FineArtFloater_7402.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_FineArtsFloater_IM7402FineArtCoverage_BlanketForm'), 
        [('AnyOnePieceOfArtLimit_7402BlanketForm') : '', ('Description_7402BlanketForm') : '', ('Limit_7402BlanketForm') : ''
            , ('SpecialPerilsLoad_7402_BlanketForm') : ''], FailureHandling.STOP_ON_FAILURE)
}

if (FineArtFloater_7400.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_FineArtsFloater_IM7400FineArtCoverage_FineArtFloater'), 
        [('Description_FineArtsFloater') : 'Test', ('Limit_FineArtsFloater') : '25000', ('SpecialPerilsLoad_FineArtsFloater') : '0.11'], 
        FailureHandling.STOP_ON_FAILURE)
}

if (AddAdditionalCoverage.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_FineArtFloater_AddCov_IM7419'), 
        [('IM7419_limit') : '26000', ('IM7419_Deductible') : '1,000'], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

