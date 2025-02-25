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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_Checkbox_IM7251OwnersCargoCoverage'))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7251OwnersCargoCoverage_Textarea_DescribedProperty'), 
    'Test')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit_IM7251OwnersCargoCoverage_Textbox_CommodityClassificationFactor'), 
    '1.1')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit__IM7251OwnersCargoCoverage_Textbox_CatastropheLimit'), 
    '35000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit__IM7251OwnersCargoCoverage_Textbox_OwnedVehicleAnnualValueShippedSales'), 
    '50000')

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit__IM7251OwnersCargoCoverage_Textbox_OwnedVehicleLimit'), 
    Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit__IM7251OwnersCargoCoverage_Textbox_OwnedVehicleLimit'), 
    '50000')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit__IM7251OwnersCargoCoverage_Textbox_NumberofVehicles(Power Units)'), 
    '1')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_Transit__IM7251OwnersCargoCoverage_Textbox_Limit'), 
    '50000')

