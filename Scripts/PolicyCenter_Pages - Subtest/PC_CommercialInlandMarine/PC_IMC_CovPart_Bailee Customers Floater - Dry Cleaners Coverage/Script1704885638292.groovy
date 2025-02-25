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

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BaileeCustFloaterDryCleaners_TextBox_CatastropheLimit'), 
    CatastropheLimit)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_BaileeCustFloaterDryCleaners_Dropdown_Deductible'), 
    Deductible, false)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Bailee Customers Floater - Dry Cleaners Coverage_Schedule'), 
    [('ScheduleCoverageType') : 'Processing Location', ('ScheduleLimit') : ScheduleLimit, ('ScheduleSpecialPerilsLoad') : '0.2'
        , ('ScheduleIncludeEQ') : 'No'], FailureHandling.STOP_ON_FAILURE)

if (AddAdditionalCoverage.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    if (CoverageNumber.equals('IM 7563')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Bailee Customers Floater - Dry Cleaners_AddCov_M 7563'), 
            [('IM7563ErrororOmissionLimit') : '25000', ('IM7563Deductible') : '250'], FailureHandling.STOP_ON_FAILURE)
    }
    
    if (CoverageNumber.equals('IM 7564')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Bailee Customers Floater - Dry Cleaners_IM 7564'), 
            [('IM7564Deductible') : '500', ('IM7564FraudandDeceitLimit') : '3500'], FailureHandling.STOP_ON_FAILURE)
    }
    
    if (CoverageNumber.equals('IM 7561')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Bailee Customers Floater - Dry Cleaners_IM 7561'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
    
    if (CoverageNumber.equals('IM 7563')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Bailee Customers Floater - Dry Cleaners_AddCov_M 7563'), 
            [('IM7563ErrororOmissionLimit') : '50000', ('IM7563Deductible') : '250'], FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

