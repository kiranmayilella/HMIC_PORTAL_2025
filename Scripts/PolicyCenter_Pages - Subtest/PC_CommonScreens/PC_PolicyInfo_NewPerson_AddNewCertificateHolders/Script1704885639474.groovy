import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_CertificateHolders_Button_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_AddNewPerson'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Certificate Holder')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'CertificateHolder_FirstName')

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + 
    RandomStringUtils.randomAlphabetic(5))

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), CertificateHolder_ZipCode)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_ZIPCode'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_Address1'), CertificateHolder_Address1)

WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

WebUI.waitForPageLoad(30)

if (!(CertificateHolder_City.equals(''))) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), CertificateHolder_City)

    WebUI.sendKeys(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_City'), Keys.chord(Keys.TAB))

    WebUI.waitForPageLoad(30)
}

if (!(CertificateHolder_State.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_State'), CertificateHolder_State, 
        false)
}

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_AddressType'), CertificateHolder_AddressType, 
    true)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewCertificateHolder_Button_OK'))