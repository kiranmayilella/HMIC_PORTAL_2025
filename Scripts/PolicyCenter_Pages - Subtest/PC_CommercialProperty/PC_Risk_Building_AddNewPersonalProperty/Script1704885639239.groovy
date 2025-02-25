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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Risks_Link_AddedOccupancy'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Button_PersonalProperty'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Occupancy And Personal Property')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_NewBuilding_PersonalProperty_DropDown_CoverageType'), 
    PersonalProperty_CoverageType, false)

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_NewBuilding_PersonalProperty_Textbox_Limit'), 
    PersonalProperty_Limit)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.waitForPageLoad(60, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

