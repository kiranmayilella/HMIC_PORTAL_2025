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

WebUI.click(findTestObject('Portal/Portal_Loc_btn_AddLocation'))

WebUI.click(findTestObject('Portal/Portal_Loc_radiobtn_NonSpecLoc'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Loc_TextBox_NonSpec_LocDesc'), 'Non Specific Location')

WebUI.click(findTestObject('Portal/Portal_Loc_TypeList_Dropdwn_NonSpecLocState'))

WebUI.click(findTestObject('Portal/Portal_Loc_Select_NonSpecLoc_Iowa'))

WebUI.click(findTestObject('Portal/Portal_PolicyChange_Loc_TypeList_AddNewState'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Portal/Portal_PolicyChange_Loc_Select_AddNewState_Yes'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

WebUI.click(findTestObject('Portal/Portal_Loc_NonSpecific_TextBox_WorkClassification'))

WebUI.click(findTestObject('Portal/Portal_Loc_WorkClassification_NonSpecLoc_Select_0005_IN'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '5000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

WebUI.click(findTestObject('Portal/Portal_Loc_btn_StandardizeAddress'), FailureHandling.OPTIONAL)

