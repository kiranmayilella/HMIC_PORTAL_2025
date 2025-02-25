import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_BuildersRisk_CheckBox_IM7054'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_TextBox_BuildersRiskCatastropheLimit'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_TextBox_DelayInCompletionCatastropheLimit'), 
    '1000')

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_JobDescription'), 
    'Job1')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleDropdown_ContructionType'), 
    'Frame', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_RehabilitationOrRenovationProjectDescription'), 
    'Project1')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_BuildingMaterialLimit'), 
    '25000')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_BasicLoad'), 
    '0.07')

//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleCalenderButton_JobCommencement'))

//WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))

//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleCalenderButton_JobCompletion'))

//WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String jobCommencementDate = format.format(d)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_BuildersRisk_IM7054_ScheduleTextBox_JobCommencement'), jobCommencementDate)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_BuildersRisk_IM7054_ScheduleTextBox_JobCompletion'), jobCommencementDate)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_ContractAmount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_OwnerSuppliedPropertyAmount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IM7054_ScheduleTextBox_JobsiteSecurityDescription'), 
    'Security')

