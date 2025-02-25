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

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TextArea_Describetheorganizationsoperations'), 
    'NA')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TextBox_Numberofyearsinbusiness'), 
    '5')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc1_CurrentYear'), 
    '10')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc1_PriorYear'), 
    '7')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc1_2ndPriorYear'), 
    '3')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc2_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc2_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc2_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc3_CurrentYear'), 
    '0')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc3_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeEmployees_TextBox_Loc3_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc1_CurrentYear'), 
    '2')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc1_PriorYear'), 
    '3')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc1_2ndPriorYear'), 
    '2')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc2_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc2_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc2_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc3_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc3_PriorYear'), 
    '0')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PartTimeEmployees_TextBox_Loc3_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc1_CurrentYear'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc1_PriorYear'), 
    '2')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc1_2ndPriorYear'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc2_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc2_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc2_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc3_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc3_PriorYear'), 
    '0')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TemporaryLeased Workers_TextBox_Loc3_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc1_CurrentYear'), 
    '2')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc1_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc1_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc2_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc2_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc2_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc3_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc3_PriorYear'), 
    '0')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_IndependentContractors_TextBox_Loc3_2ndpriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc1_CurrentYear'), 
    '15')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc1_PriorYear'), 
    '12')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc1_2ndPriorYear'), 
    '6')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc2_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc2_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc2_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc3_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc3_PriorYear'), 
    '0')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Totals_TextBox_Loc3_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Percentofworkforceunionmembers_TextBox_CurrentYearPercentage'), 
    '10')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Percentofworkforceunionmembers_TextBox_PriorYearPerc'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Percentofworkforceunionmembers_TextBox_2ndPriorYearPerc'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_OfEmployees_TextBox_30000orlessperyear'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_OfEmployees_TextBox_30001 - 100000per year'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_OfEmployees_TextBox_Over100000peryear'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PercOfTotal_TextBox_30000orlessperyear'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PercOfTotal_TextBox_30001 - 100000per year'), 
    '1')

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_PercOfTotal_TextBox_Over100000peryear'), 
    '1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeandPartTimeterminationslastthreeyears_TextBox_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeandPartTimeterminationslastthreeyears_TextBox_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeandPartTimeterminationslastthreeyears_TextBox_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeandPartTimeterminationslasteachofthelastthree years_TextBox_CurrentYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeandPartTimeterminationslasteachofthelastthree years_TextBox_PriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_FullTimeandPartTimeterminationslasteachofthelastthree years_TextBox_2ndPriorYear'), 
    '0')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TextArea_Reasonwhyo timeframetocomplete'), 
    'NA')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_TextArea_Specifythosethataredistributedseparately'), 
    'NA')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_EmploymentPracticesLiabilityInsurancelimit_CheckBox_50000'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_EPLI_Desireddeductibleperclaim_CheckBox_5000'))

WebUI.takeFullPageScreenshot()

