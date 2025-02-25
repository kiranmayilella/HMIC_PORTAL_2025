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

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_Verify_CoverageName'), 
    'CP 99 20 Contributing Insurance')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_PercentOfContributingInsurance'), '0.35')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_TotalBuildingLimit'), '75000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_YourBusinessPersonalProperty_TotalLimit'), 
    '45000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_TotalPersoanlPertyOf_OthersLimit'), 
    '30000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_TotalBusinessIncomeLimit'), 
    '25000')

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_Verify_ListofScheduled'), 
    'List of Scheduled')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_Schedule_AdditionalCoverage'), 
    '015')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_CP_CP9920_Schedule_TotalLimit'), '4500')

