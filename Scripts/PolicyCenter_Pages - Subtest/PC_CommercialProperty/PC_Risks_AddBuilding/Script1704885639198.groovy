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

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Risks_Button_AddBuilding'))

WebUI.waitForPageLoad(20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Building')

WebUI.takeFullPageScreenshot()

if (LineSelection_RiskType.equals('Select Metalists I Program') || LineSelection_RiskType.equals('Select Metalists Program')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Risks_NewBuilding_Dropdown_Occupancy'), 
        NewBuilding_Occupancy, false)

    WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_SearchIcon_CPClassCodeSearch'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Class Code Search')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_ClassCodeSearch_TextBox_Classcode'), 
    CP_ClassCode)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CPClassCodeSearch_Button_Search'))

if (!(CP_Risks_ClasscodeClassification.equals(''))) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Newbuilding_ClasscodeSearch_Textbox_Classification'), 
        CP_Risks_ClasscodeClassification)

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CPClassCodeSearch_Button_Search'))
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CPClassCodeSearch_Button_Select'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Building')

WebUI.takeFullPageScreenshot()

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_IsThisARentalProperty'), 
    30, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_IsThisARentalProperty'), 
    NewBuilding_IsThisARentalProperty, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_Construction'), 
    ConstructionType, false)

if (!(NewBuilding_EQConstructionClass.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_Dropdown_EQConstructionClass'), 
        NewBuilding_EQConstructionClass, false)

    WebUI.waitForPageLoad(30)
}

if (!(RoofTankHazard.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_RoofTankHazard'), 
        RoofTankHazard, false)
}

if (!(NewBuilding_EQDeductible.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_EQDeductible'), NewBuilding_EQDeductible, 
        false)
}

if (!(NewBuilding_WindstormorHailDeductible.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_Dropdown_WindstormorHailDeductible'), 
        NewBuilding_WindstormorHailDeductible, false)
}

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_StructureBuilding_TextBox_Limit'))

WebUI.sendKeys(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_StructureBuilding_TextBox_Limit'), 
    Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(60)

WebUI.takeFullPageScreenshot()

if (!(NewBuilding_StructureBuilding_Valuation.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_StructureBuilding_Valuation'), 
        NewBuilding_StructureBuilding_Valuation, false)
}

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_TextBox_YearOfConstruction'), 
    '2011')

if (!(NewBuilding_EQCauseOfLossCoverage.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_EQCauseOfLossCoverage'), 
        NewBuilding_EQCauseOfLossCoverage, false)

    WebUI.waitForPageLoad(30)
}

WebUI.takeFullPageScreenshot()

boolean newBuildingStructureMineSubsidence = false

newBuildingStructureMineSubsidence = WebUI.verifyElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_StructureMineSubsidence_StructureType'), 
    5, FailureHandling.OPTIONAL)

if (newBuildingStructureMineSubsidence.equals(true)) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_StructureMineSubsidence_StructureType'), 
        NewBuilding_StructureMineSubsidence_StructureType, false)

    WebUI.waitForPageLoad(30)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_TextBox_StructureMineSubsidence_Limit'), 
        NewBuilding_StructureMineSubsidence_Limit)
}

if (!(BuildingImprovements.equals(''))) {
    WebUI.mouseOver(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_BuildingImprovements'))

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_BuildingImprovements'))

    WebUI.waitForPageLoad(15)

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_BuildingImprovements'), 
        BuildingImprovements, false)
}

if (!(Improvements_TotalArea.equals(''))) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Improvements_TextBox_TotalArea'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForPageLoad(15)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Improvements_TextBox_TotalArea'), 
        Improvements_TotalArea)
}

if (!(Improvements_PrimaryHeat.equals(''))) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Improvements_Dropdown_PrimaryHeat'))

    WebUI.waitForPageLoad(15)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Improvements_Dropdown_PrimaryHeat'), 
        Improvements_PrimaryHeat, false)
}

WebUI.takeFullPageScreenshot()

if (!(Building_IncludeInBlanketIDOtherthanEQ.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Blanket_DropDown_IncludedinBlanketOtherthanEQ'), 
        Building_IncludeInBlanketIDOtherthanEQ, false)

    WebUI.waitForElementClickable(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Blanket_DropDown_BlanketIDNumberOtherthanEQ'), 
        60, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Blanket_DropDown_BlanketIDNumberOtherthanEQ'), 
        FailureHandling.OPTIONAL)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Blanket_DropDown_BlanketIDNumberOtherthanEQ'), 
        Building_BlanketIDNumber, false, FailureHandling.OPTIONAL)
}

if (!(Building_FullBuildingValue.equals(''))) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Textbox_FullBuildingValue'), 
        Building_FullBuildingValue)

    WebUI.sendKeys(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Textbox_FullBuildingValue'), 
        Keys.chord(Keys.TAB))
}

boolean buildingLimit = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_StructureBuilding_TextBox_Limit'), 
    0, FailureHandling.OPTIONAL)

if (buildingLimit.equals(true)) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_StructureBuilding_TextBox_Limit'), 
        BuildingLimit)
}

boolean buildingInflationGuard = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_InflationGuard'), 
    0, FailureHandling.OPTIONAL)

if (buildingInflationGuard.equals(true)) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_InflationGuard'))

    WebUI.waitForPageLoad(60)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_InflationGuard'), 
        Building_StructureInflationGuard, false, FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(60)

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewBuilding_StructureBuilding_TextBox_Limit'), 
        FailureHandling.OPTIONAL)
}

if (!(NewBuilding_Coverage.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_Coverage'), NewBuilding_Coverage, 
        false)
}

if (!(Building_TheftDeductible.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Building_Coverages_StructureBuildingTheftDeductible'), 
        Building_TheftDeductible, false)
}

if (!(Building_AddAdditionalInterests.equals('')) && Building_AddAdditionalInterests.equals('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_BuildingAdditionalInterests_AddNewPerson'), 
        [('AdditionalInterestType') : AdditionalInterestType, ('Building_AdditionalInterestAddress1') : Building_AdditionalInterestAddress1
            , ('Building_AdditionalInterestCity') : Building_AdditionalInterestCity, ('Building_AdditionalInterestZipCode') : Building_AdditionalInterestZipCode
            , ('Building_AdditionalInterestAddressType') : Building_AdditionalInterestAddressType], FailureHandling.STOP_ON_FAILURE)
}

if (CP_ClassCode.equals('0512') || CP_ClassCode.equals('512')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_AdditionalCoverages'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_AddCov_LossOrDamageToCustomersAuto_Dropdown_Type'), 
        Building_LossOrDamageToCustomersAuto_Type, false)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_AddCov_LossOrDamageToCustomersAuto_TextBox_Limit'), 
        Building_AddCov_LossOrDamageToCustomersAuto_Limit)
}

if (!(NewBuilding_CauseOfLoss.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Dropdown_CauseOfLoss'), NewBuilding_CauseOfLoss, 
        false)
}

WebUI.waitForPageLoad(60)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Risks']), 
    60)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Risks']), 
    60)

WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TitleName', [('TitleName') : 'Risks']), 
    60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

WebUI.takeFullPageScreenshot()

