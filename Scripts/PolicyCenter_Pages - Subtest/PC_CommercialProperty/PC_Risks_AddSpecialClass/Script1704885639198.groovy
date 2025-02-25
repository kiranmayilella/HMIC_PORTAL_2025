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

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Risks_Link_Location'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Button_SpecialClass'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_SpecialClass_DropDown_ClassDescription'), 
    ClassDescription, false)

WebUI.waitForPageLoad(30)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_WindstormOrHailDeductible'), 
    WindstormorHailDeductible, false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_SpecialClass_TestBox_Limit'), Coverages_SpecialClassLimit)

if (!(NewSpecialClass_EQStructureDescription.equals(''))) {
    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_EQStructureDescription'), 
        Keys.chord(Keys.TAB), FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_EQStructureDescription'), 
        NewSpecialClass_EQStructureDescription, false)

    WebUI.waitForPageLoad(60)
}

if (!(NewSpecialClass_EQConstructionClass.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_EQConstructionClass'), 
        NewSpecialClass_EQConstructionClass, false)
}

if (!(NewSpecialClass_Valuation.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_NewSpecialclass_Dropdown_Valuation'), 
        NewSpecialClass_Valuation, false)
}

if (!(NewSpecialClass_EarthquakeCauseofLossCoverage.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_EarthquakeCauseofLossCoverage'), 
        NewSpecialClass_EarthquakeCauseofLossCoverage, false)
}

if (!(Building_IncludeInBlanketIDOtherthanEQ.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Blanket_DropDown_IncludedinBlanketOtherthanEQ'), 
        Building_IncludeInBlanketIDOtherthanEQ, false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewBuilding_Blanket_DropDown_BlanketIDNumberOtherthanEQ'), 
        Building_BlanketIDNumber, false, FailureHandling.OPTIONAL)
}

boolean eqConinsurance = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_EarthquakeCoinsurance'),
	0, FailureHandling.OPTIONAL)

if (eqConinsurance.equals(true)) {
	WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Dropdown_EarthquakeCoinsurance'),
		'50%', false)
}

if (!(NewSpecialClass_EQDeductible.equals(''))) {
	WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_Coverages_Dropdown_EQDeductible'),
		NewSpecialClass_EQDeductible, false)
}

if (!(NewSpecialClass_FullItemValue.equals(''))) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewSpecialClass_TextBox_FullItemValue'), NewSpecialClass_FullItemValue)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

