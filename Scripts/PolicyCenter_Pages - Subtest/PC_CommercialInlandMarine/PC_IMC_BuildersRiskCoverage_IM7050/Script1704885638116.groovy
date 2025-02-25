import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_BuildersRisk_CheckBox_IM7050'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7050_TextBox_BuildersRiskCatastropheLimit'), 
    '14500')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_BuildersRisk_IM7050_TextBox_DelayInCompletionCatastropheLimit'), 
    '500')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleTextBox_JobDescription'), 
    'Job1')

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleDropdown_ConstructionType'), 
    'Frame', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleTextBox_Limit'), 
    '24000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleTextBox_BasicLoad'), 
    '0.07')

Date d = new Date();

SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy")

currentDateAndTime = format.format(d)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7050_ScheduleTextBox_JobCommencement'), currentDateAndTime)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7050_ScheduleTextBox_JobCompletion'), currentDateAndTime)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleTextBox_ContractAmount'), 
    '2300')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleTextBox_OwnerSuppliedPropertyAmount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_IM7050_ScheduleTextBox_JobSecurityDescription'), 
    'Jobsite Security1')

