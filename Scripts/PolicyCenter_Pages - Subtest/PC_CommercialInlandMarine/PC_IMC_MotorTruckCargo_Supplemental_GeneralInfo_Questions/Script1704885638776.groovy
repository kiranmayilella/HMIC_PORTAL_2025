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

WebUI.comment('MotorTruckCargo_Supplemental_GeneralInfo_Questions')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_IsThereAVehicleMaintenanceProgramInOperation_Explanation'), 
    'maintainance program reason')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_DoesApplicantObtainMvrVerificationForDrivers_Explanation'), 
    'MVR verification details')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_DoesApplicantHaveADriverRecruitingMethod'), 
    'Driver Recruitment type')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_DoDriversReceiveRegularPhysicals'), 
    'Regular Physical details')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_AreVehiclesEquippedWithTheftAlarms'), 
    'Theft Alarm')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_DoTerminalsHaveSecuritySystems'), 
    'Security system details')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_IsTheApplicantAnOwnerOperator'), 
    'Owner operator details')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Supplemental_GeneralInfoMotorTruckCargo_Textbox_DoesTheApplicantHireOwnerOperators'), 
    'Hire owner details')

