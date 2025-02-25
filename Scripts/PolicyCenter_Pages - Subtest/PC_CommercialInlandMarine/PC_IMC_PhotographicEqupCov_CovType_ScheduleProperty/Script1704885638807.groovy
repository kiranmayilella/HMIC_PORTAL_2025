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

    WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_DropDown_CoverageType'), 
        'MICoverageTypeSchdPropty', true)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_DropDown_PropertyType'), 
        'PEProptyTypeMotionPicPrdcr', true)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_ScheduleCoverage_TextBox_Description'), 
        'test')

    WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_ScheduleCoverage_DropDown_OwnLease'), 
        'Owned', true)

    WebUI.selectOptionByValue(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_ScheduleCoverage_DropDown_NewUsed'), 
        'New', true)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_ScheduleCoverage_TextBox_Limit'), 
        '300000')


