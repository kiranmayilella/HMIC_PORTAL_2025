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

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleDropdown_TypeOfDependentProperty'), 
    'Contributing Location', false)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleDropdown_SecondaryContributingLoc'), 
    'No', false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextarea_DescriptionOfOccupancy'), 'test')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1508OrCP1509_ScheduleDropdown_NatureOfDependency'), 
    NatureOfDependency, false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextBox_Name'), CP1509CoverageName)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509OrCP1508_ScheduleTextBox_Address'), CP1509coverageAddress)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleDropdown_Construction'), CP1509coverageConstruction, 
    false)

boolean coverageLimit = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextBox_Limit'), 
    0, FailureHandling.OPTIONAL)

if (coverageLimit.equals(true)) {
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextBox_Limit'), '25000')
}

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextBox_DependentPropertyBasicGroup1TimeElementRate'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextBox_DependentPropertyBasicGroup2TimeElementRate'), 
    '2')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP1509_ScheduleTextBox_DependentPropertyEarthquakeTimeElementRate'), 
    '12')