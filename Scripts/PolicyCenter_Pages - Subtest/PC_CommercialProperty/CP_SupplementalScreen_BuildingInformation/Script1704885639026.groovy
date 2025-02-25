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

WebUI.comment('SupplementalScreen Building Information Details')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_BuildingInformation_Button_Calender'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_BuildingInfo_TextBox_PurchasePrice'), '6500')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_BuildingInfo_TextBox_ForRentalProprietiesIndicateTheAnnualRentalIncome'), 
    '8000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_BuildingInfo_TextBox_ApproximateCostOfSubsequentReplacements'), 
    '4800')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_BuildingInfo_TextBox_ApproximateReplacement'), 
    '3500')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_BuildingInfo_TextBox_ApproximateFairMarket(ExclusiveOfLand)'), 
    '2500')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CheckBox_IndicateTheValueUsedToDetermineTheAmountOfInsurance_PurchasePrice'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_CheckBox_HowWasTheInsuranceValueDetermined_ProfessionalAppraiser'))

