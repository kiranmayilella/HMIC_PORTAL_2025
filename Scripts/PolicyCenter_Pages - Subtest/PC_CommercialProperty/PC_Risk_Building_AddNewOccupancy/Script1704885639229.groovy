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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Risks_Link_NewAddedBuilding', [('BuildingNumber') : BuildingNumber]))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Button_Occupancy'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Occupancy And Personal Property')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_NewBuilding_Occupancy_DropDown_Coverage'), 
    Occupancy_Coverage, false)

WebUI.waitForPageLoad(30)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_NewBuilding_Occupancy_DropDown_SprinklerSystem'), 
    Occupancy_SprinklerSystem, false)

WebUI.waitForPageLoad(30)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_NewBuilding_Occupancy_DropDown_OccupancyCategory'), 
    Occupancy_OccupancyCategory, false)

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_NewBuilding_Occupancy__TextBox_SquareFootage'), Occupancy_SquareFootage)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

