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

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_DomesticWaterWellDrillingPercentage'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_CommercialOrIndustrialWellDrillingPercentage'), 
    '10', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_OilAndGasDrilling'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_OilAndGasDrilling'), 
    '10', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_PumpInstallationRepairOrServicePercentage'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(30, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_PumpInstallationRepairOrServicePercentage'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_MunicipalPercentage'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_OtherPercentage'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextArea_ExplainBelowCommercialOrIndustrial'), 
    'Commercial', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_WhatTypeOfWorkDoYouSubcontract'), 
    'contractor', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_WhatPercentOfTotalJobCost'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_OnceYouhitWaterHowDoYouDetermine'), 
    'quality', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_WhatIsTheAvgNumOfYrsExp_DrillersAndPumpInstallers'), 
    '2', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextBox_WhatIStheAvgNumOfYrsExp_OtherFieldEmp'), 
    '10', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextArea_HowDoYouLimitPublicAccess'), 
    'private', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_DoYouHaveAFormalWrittenSafetyProgram_RadioButton_Yes'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_DoYouHaveAFormalWrittenSafetyProgram_CheckBox_SafetyCommittee'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_WaterWellDrillingContrctrsSupplQues_TextArea_WhatIsYourProcedureForIdentifyingTheLoc'), 
    'underground', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(15, FailureHandling.OPTIONAL)

