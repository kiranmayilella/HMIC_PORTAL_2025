import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'New Additional Named Insured')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_FirstName'), 'AdditionalInsured_FirstName')

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        3))

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalNamedInsured_Button_SameAddressAs'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalNamedInsured_Button_SameAddressAs'))

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalNamedInsured_TypeList_PrimaryNamedInsured'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalNamedInsured_TypeList_ExistingAddress'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_NewAdditionalInsured_Button_OK'))

