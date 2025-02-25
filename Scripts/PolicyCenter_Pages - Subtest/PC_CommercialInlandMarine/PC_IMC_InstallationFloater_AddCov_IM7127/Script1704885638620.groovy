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

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_ConstructionTrailers'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_ConstructionTrailersLimit'), 
    IM7127_ConstructionTrailersLimit)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_ContinuingRentalOrLeasePayments'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_ContinuingRentalOrLeasePaymentsLimit'), 
    '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_EquipmentAndToolsLeasedOrRented'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_EquipmentAndToolsLeasedOrRentedToOthersLimit'), 
    '200')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_EquipmentHauling'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_EquipmentHaulingLimit'), 
    '200')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_SparePartsFuelAndLubricants'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_SparePartsFuelAndLubricantsLimit'), 
    '200')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_WaterborneContractorsEquipmentAndTools'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_WaterborneContractorsEquipmentAndToolsLimit'), 
    '200')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_WaterborneProperty'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_WaterbornePropertyLimit'), 
    '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_Dropdown_RewardForRecoveryOfStolenProperty'), 
    'Yes', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_InstallationFloater_IM7127_TextBox_RewardForRecoveryOfStolenPropertyLimit'), 
    '100')

