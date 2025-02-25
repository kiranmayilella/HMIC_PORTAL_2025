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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_TransportationCoverage_CheckBox'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_PartLevelInfo_Checkbox_CommonCarrier'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_DescribedProperty'), 'test')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_Textbox_catastropheLimit'), '5000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_CommonCarrierAnnualValueShippedSales'), 
    '20000')

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_CommonCarrierAnnualValueShippedSales'), 
    Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_CommonCarrierLimit'), '10000')

WebUI.waitForPageLoad(10)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_CommonCarrierLimit'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_CommonCarrierLoad'), '0.05')

WebUI.comment('Adding Schedule')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7250_Schedule_Limit'), '20000')

