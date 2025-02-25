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
import org.eclipse.persistence.jpa.jpql.Assert as Assert
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Keys

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Contacts'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_Link_Edit'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_Dropdown_PrimaryPhone'), 'Mobile', 
    true)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_TextBox_MobilePhone'), '201-555-0123')

not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_TextBox_OfficePhone'), '201-555-0123')

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Tab_Roles'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Button_AddRole'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Roles_TypeList_AccountingContact'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Button_AddRole'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Roles_TypeList_InspectionContact'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Button_Update'))

WebUI.waitForPageLoad(30)

//String TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Account File Contacts')

WebUI.takeFullPageScreenshot()

