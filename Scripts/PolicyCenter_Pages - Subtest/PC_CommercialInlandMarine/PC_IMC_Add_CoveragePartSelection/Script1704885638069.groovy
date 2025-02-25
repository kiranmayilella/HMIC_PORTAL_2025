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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_LeftPanel_CommercialInlandMarine'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Inland Marine')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Tab_CoveragePartSelection'))

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_Button_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_Button_Add'))

if (CoveragePartSelectionOption.equals('Builders')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_BuildersRiskCoverage'))
} else if (CoveragePartSelectionOption.equals('Contractors')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_ContractorsEquipment'))
} else if (CoveragePartSelectionOption.equals('Fine Arts Floater')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_FineArtsFloater'))
} else if (CoveragePartSelectionOption.equals('ContractorsEquipment')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_ContractorsEquipment'))
} else if (CoveragePartSelectionOption.equals('PhysiciansAndDentistsEquipment')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_PhysiciansDentistEquipment'))
} else if (CoveragePartSelectionOption.equals('ValuablePapersandRecords')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_ValuablePapersandRecords'))
} else if (CoveragePartSelectionOption.equals('Transit')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_Transit'))
} else if (CoveragePartSelectionOption.equals('Camera and Musical Instrument Dealers')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_Camera and Musical Instrument Dealers'))
} else if (CoveragePartSelectionOption.equals('Bailee Customers Floater - Dry Cleaners')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_BaileeCustomersFloater-DryCleaners'))
} else if (CoveragePartSelectionOption.equals('Musical Instruments')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_MusicalInstruments'))
} else if (CoveragePartSelectionOption.equals('Sign Coverage')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_Sign Coverage'))
} else {
    boolean coveragePart = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_CoverageName', 
            [('CoveragePartSelectionOption') : CoveragePartSelectionOption]), FailureHandling.OPTIONAL)

    if (coveragePart.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_CoverageName', 
                [('CoveragePartSelectionOption') : CoveragePartSelectionOption]))
    } else {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_Button_MenuDownArrow'))

        WebUI.waitForPageLoad(5)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CoveragePartSelection_TypeList_CoverageName', 
                [('CoveragePartSelectionOption') : CoveragePartSelectionOption]))
    }
}

