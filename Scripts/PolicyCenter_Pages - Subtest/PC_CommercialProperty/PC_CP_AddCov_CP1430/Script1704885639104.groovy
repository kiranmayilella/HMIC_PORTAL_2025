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

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_EachTreeLimit'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_EachTreeLimit'), 
    EachTreeLimit_CP1430)

WebUI.waitForPageLoad(40)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_EachShrubLimit'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_EachShrubLimit'), 
    EachShrubLimit_CP1430)

WebUI.waitForPageLoad(40)

WebUI.clearText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_EachPlantLimit'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_EachPlantLimit'), 
    EachPlantLimit_CP1430)

WebUI.waitForPageLoad(40)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Textbox_AllItemsTotalLimit'), 
    AllItemsTotalLimit_CP1430)

WebUI.waitForPageLoad(40)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Builing_Addcov_CP1430_Dropdown_CauseofLoss'), 
    CauseOfLoss_CP1430, false)

WebUI.waitForPageLoad(40)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1430_DropDown_VehicleExclusionApplies'), 
    VehicleExclusionApplies_CP1430, false)

WebUI.waitForPageLoad(40)

