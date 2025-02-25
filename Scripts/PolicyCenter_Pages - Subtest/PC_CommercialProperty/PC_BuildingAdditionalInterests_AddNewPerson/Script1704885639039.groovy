import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling

WebUI.scrollToElement(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_ButtonOptions_Add'), 10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_ButtonOptions_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_AddNewPerson'))

not_run: WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Additional Interest - Building')

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP_DropDown_NewAdditionalInterestBuilding_InterestType'), 
    AdditionalInterestType, false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'AdditionalInterest_FirstName')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        3))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), Building_AdditionalInterestAddress1)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'))

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Building_AdditionalInterestCity)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Keys.chord(Keys.TAB))

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Building_AdditionalInterestZipCode)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Icon_AddressAutoFill'))

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'))

WebUI.waitForPageLoad(20)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'), Building_AdditionalInterestAddressType, 
    false)

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalInsured_Button_OK'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Building', FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_Dropdown_AdditionalInterestType'), 
    AdditionalInterestType, false)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AddBuilding_TextBox_AdditionalInterestItemDescription'), 
    'Item1')

