import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.testdata.*
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
import com.kms.katalon.core.testobject.ConditionType
import org.eclipse.persistence.jpa.jpql.Assert as Assert
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.testng.Assert as Keys

def PhoneOptions = ['Mobile','Work','Home']

Random random =  new Random()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_Contacts'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_Link_Edit'))

def SelectPhoneOption = PhoneOptions[random.nextInt(PhoneOptions.size())]

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_Dropdown_PrimaryPhone'), SelectPhoneOption, 
    true)

WebUI.takeFullPageScreenshot()

switch(SelectPhoneOption) {
	case 'Mobile':
	WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_TextBox_MobilePhone'), findTestData('IMC/Contact/contact').getValue(
		4, 2))
	break
	
	case 'Home':
	WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_TextBox_HomePhone'), findTestData('IMC/Contact/contact').getValue(
		3, 2))
	break
	
	case 'Work':
	WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Contacts_TextBox_WorkPhone'), findTestData('IMC/Contact/contact').getValue(
		2, 2))
	break
	
}



WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Tab_Roles'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Button_AddRole'))

TestData exceldata1 = TestDataFactory.findTestData('IMC/Contact/contact');
String Role01 = exceldata1.getValue(6, 2)
//String dynamicXpath = "//tr[td[contains(@id, 'Name_Cell')]//div[text()='" + productName + "']]//td[contains(@id, 'Select')]//div[text()='Select']"
String role01xpath="//div[@id='EditAccountContactPopup-ContactDetailScreen-AccountContactCV-ContactRolesDV-ContactRolesLV_tb-AddRoleButton-0-RoleType']/div/div[contains(text(),'"+Role01+"')]"
System.out.println("Role01Xpath-" +role01xpath )
TestObject dynamicTestObjectrole01 = new TestObject('Role01Object')
dynamicTestObjectrole01.addProperty('xpath',ConditionType.EQUALS,role01xpath)
WebUI.click(dynamicTestObjectrole01)

//div[@id='EditAccountContactPopup-ContactDetailScreen-AccountContactCV-ContactRolesDV-ContactRolesLV-1-ContactRole']/div/div[contains(text(),'Accounting Contact')]
//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Roles_TypeList_AccountingContact'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Button_AddRole'))

String Role02 = exceldata1.getValue(7, 2)
//Inspection Contact')]
//div[contains(@id, 'EditAccountContactPopup-ContactDetailScreen-AccountContactCV-ContactRolesDV-ContactRolesLV_tb-AddRoleButton')]/div/div[contains(text(),'Inspection Contact')]
String role02xpath="//div[contains(@id,'EditAccountContactPopup-ContactDetailScreen-AccountContactCV-ContactRolesDV-ContactRolesLV_tb-AddRoleButton-9-RoleType')]/div/div[contains(text(),'"+Role02+"')]"
TestObject dynamicTestObjectrole02 = new TestObject('Role02Object')
dynamicTestObjectrole02.addProperty('xpath',ConditionType.EQUALS,role02xpath)
WebUI.click(dynamicTestObjectrole02)

////div[@id='EditAccountContactPopup-ContactDetailScreen-AccountContactCV-ContactRolesDV-ContactRolesLV-2-ContactRole']/div/div[contains(text(),'Inspection Contact')]

//WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Roles_TypeList_InspectionContact'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Contacts_Button_Update'))

WebUI.waitForPageLoad(30)

//String TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Account File Contacts')

WebUI.takeFullPageScreenshot()

