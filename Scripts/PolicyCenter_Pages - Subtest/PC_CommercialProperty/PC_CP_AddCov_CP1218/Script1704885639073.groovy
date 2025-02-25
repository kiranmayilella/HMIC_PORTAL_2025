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

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_Dropdown_ApplicableClause'), 
    'C', false)

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_TextBox_DescriptionOfProperty'), 
    DescriptionOfProperty)

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_TextBox_Name'), CP_1218_Name)

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_TextBox_Address'), CP_1218_Address)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_Checkbox_LossPayable'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_Checkbox_LendersLossPayable'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_Checkbox_ContractOfSale'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_Risks_Building_AddCov_CP1218_Checkbox_BuildingOwnerProvision'))

WebUI.waitForPageLoad(30)

