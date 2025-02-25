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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_CheckBox_EmployeeTheftNameOrPositionSchedule'))

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_Dropdown_ScheduleType_'), 
    'Name Schedule', false)

WebUI.waitForElementClickable(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_ItemNumber'), 
    5)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_ItemNumber'), 
    '25')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_TextBox_Limit (Per Employee)'), 
    '2500')

WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_Deductible(Per Emp)'), 
    '500', false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_NumberOfEmployees'), 
    '200')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Crime_CommercialFidelity_EmployeeTheftNameOrPositionSchedule_TextArea_NamesofCoveredEmployees'), 
    'James Honey Ruther')

