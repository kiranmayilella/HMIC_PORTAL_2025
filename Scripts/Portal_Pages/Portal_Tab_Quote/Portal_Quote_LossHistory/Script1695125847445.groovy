import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.mouseOver(findTestObject('Portal/Portal_AddInfo_CheckBox_LossHistory'))

WebUI.click(findTestObject('Portal/Portal_AddInfo_CheckBox_LossHistory'))

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

currentDateAndTime = format.format(d)

GlobalVariable.currentDateAndTime = currentDateAndTime

WebUI.setText(findTestObject('Portal/Portal_AddInfo_LossHistory_TextBox_DateOfLoss'), GlobalVariable.currentDateAndTime)

WebUI.click(findTestObject('Portal/Portal_AddInfo_LossHistory_TextBox_Description'))

WebUI.setText(findTestObject('Portal/Portal_AddInfo_LossHistory_TextBox_Description'), 'Loss')

WebUI.click(findTestObject('Portal/Portal_AddInfo_LossHistory_TextBox_OpenReserve'))

WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'))

