import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_LOB', [(LOB) : LOB]), LOB)

//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Button_CalenderButton'))
//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_CalenderButton_Today'))
Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String receivedDate = format.format(d)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_TextBox_ReceivedDate'), receiveddate)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_TextBox_YearBusinessStarted'), 
    YearBusinessStarted)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_TextArea_DescriptionOfBusinessAndOperations'), 
    'Business')

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Dropdown_LegalEntity'), 
    LegalEntity, false)

if (LOB.equals('Commercial Inland Marine')) {
    WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Dropdown_TypeOfOperation'), 
        'Commercial', true)
}

if (Subline.equals('Owners and Contractors')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_RadioButton_SupportingPolicies'))

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_SupportingPolicies_Button_Add'))

    WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_SupportingPolicies_Dropdown_PolicyType'), 
        'GL - General Liability', true)

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_SupportingPolicies_TextBox_PolicyNumber'), 
        'A000257837')
}

WebUI.takeFullPageScreenshot()

