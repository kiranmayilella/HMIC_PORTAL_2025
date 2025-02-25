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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Builders\' Risk')

if (BuildersRiskCoverage.equals('IM 7050')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRiskCoverage_IM7050'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('IM 7050 Builders\' Risk Coverage - Scheduled Jobsite Form - Comprehensive Coverage should be added')
}

if (BuildersRiskCoverage.equals('IM 7051')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRiskCoverage_IM7051'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (BuildersRiskCoverage.equals('IM 7054')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRiskCoverage_IM7054'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (BuildersRiskCoverage.equals('IM 7980')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRiskCoverage_IM7980'), 
        [('BuildersRiskCoverage') : BuildersRiskCoverage, ('AddNewLocation') : AddNewLocation, ('NewLocationZipCode') : NewLocationZipCode
            , ('NewLocationAddress') : NewLocationAddress, ('NewLocationState') : NewLocationState, ('NewLocationCity') : NewLocationCity], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('IM 7980 Builders\' Risk Coverage - Civil Works Project Coverage should be added')
}

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRisk_Transportation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

if (AddAdditionalCoverage.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddAdditionalCoverage'), [('CoverageNumber') : CoverageNumber], 
        FailureHandling.STOP_ON_FAILURE)

    if (CoverageNumber.equals('IM 7999')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRisk_AddCov_IM7999'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
    
    if (CoverageNumber.equals('IM 7068')) {
        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7068_TextBox_Limit'), '10000')
    }
    
    if (CoverageNumber.equals('IM 7077')) {
        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7077_TextBox_Limit'), '10000')
    }
    
    if (CoverageNumber.equals('IM 7083')) {
        WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_BuildersRisk_AddCov_IM7083'), 
            [:], FailureHandling.STOP_ON_FAILURE)
    }
}

if (!(BuildersRisk_AddAdditionalInterests.equals('')) && BuildersRisk_AddAdditionalInterests.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_AdditionalInterests_AddNewPerson'), 
        [('InterestType') : BuildersRisk_AdditionalInterestType, ('Address1') : BuildersRisk_AdditionalInterestAddress1, ('ZipCode') : BuildersRisk_AdditionalInterestZipCode
            , ('AddressType') : BuildersRisk_AdditionalInterestAddressType], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.waitForPageLoad(60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Inland Marine')

