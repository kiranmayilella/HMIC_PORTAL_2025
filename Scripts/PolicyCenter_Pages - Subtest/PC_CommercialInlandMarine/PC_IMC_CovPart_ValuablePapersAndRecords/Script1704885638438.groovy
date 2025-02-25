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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Valuable Papers and Records')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMCValuablePapersRecords_DropDown_CoverageType'), 
    CoverageType, false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Common_DropDown_Deductible'), Deductible, 
    false)

WebUI.selectOptionByIndex(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ValuablePapersRecords_Dropdown_CanPapersBeReplaced'), 
    1)

if ((PropertyAwayfromDescribedPremises.equals('Yes'))) {
    WebUI.check(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Checkbox_ValuablePapersAndRecordsPropertyAwayFromDescribedPremises'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ValuablePapersAndRecordsPropertyAwayFromDescribedPremises_Textbox_AdditionalLimit'), 
        AdditionalLimit)
} 
 
if (CoverageType.contains('Scheduled Property')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForPageLoad(10)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Valuable Papers and Records Coverage_Schedule1'), 
        [('SectionOfBuilding') : SectionOfBuilding, ('Description') : Description, ('ScheduleLimit') : ScheduleLimit, ('ReceptacleType') : ReceptacleType
            , ('Container') : Container, ('NameOfManufacturer') : NameOfManufacturer, ('ClassORHourOfLabel') : ClassORHourOfLabel
            , ('IssuerOfLabel') : IssuerOfLabel], FailureHandling.STOP_ON_FAILURE)
}

if (CoverageType.contains('Blanket Property')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForPageLoad(10)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Valuable Papers and Records Coverage_Blanket'), 
        [('SectionOfBuilding') : SectionOfBuilding, ('Description') : Description, ('BlanketLimit') : BlanketLimit, ('ReceptacleType') : ReceptacleType
            , ('Container') : Container, ('NameOfManufacturer') : NameOfManufacturer, ('ClassORHourOfLabel') : ClassORHourOfLabel
            , ('IssuerOfLabel') : IssuerOfLabel], FailureHandling.STOP_ON_FAILURE)
}

if (AddExclusionsAndConditions.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_AddExclusionOrConditions'), [('ExclusionsConditions') : ExclusionsConditions], 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

