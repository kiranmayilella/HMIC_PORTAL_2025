import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification')

WebUI.comment('Prequalification statement should be displayed.')

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

currentDateAndTime = format.format(d)

GlobalVariable.currentDateAndTime = currentDateAndTime

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

if(PrequalAgree.equals("Disagree")) {
	WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Disagree'))
} else {
	WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Agree'))
}


