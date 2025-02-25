import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Policy Info')

String lob = LOB

boolean flag = false

if (lob.contains(WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_LOB')))) {
    flag = true

    Assert.assertTrue(flag)
} else {
    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_LOB', [(LOB) : LOB]), LOB)

    Assert.assertTrue(flag)
}

//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Button_CalenderButton'))
//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_CalenderButton_Today'))
Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String receivedDate = format.format(d)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_TextBox_ReceivedDate'), receivedDate)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_TextBox_SSN'), '' + RandomStringUtils.randomNumeric(
        9))

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_TextBox_FEIN'), '' + RandomStringUtils.randomNumeric(
        9))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

WebUI.waitForPageLoad(10)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Dropdown_LegalEntity'), 
    LegalEntity, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_Dropdown_TypeOfOperation'), 
    PolicyInfo_TypeOfOperation, true)

WebUI.takeFullPageScreenshot()

