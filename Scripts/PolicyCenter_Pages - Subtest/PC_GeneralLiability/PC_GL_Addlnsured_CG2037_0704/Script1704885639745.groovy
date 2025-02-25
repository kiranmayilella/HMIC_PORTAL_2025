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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Add'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_AddNewPerson'))

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_NewPerson_AddNewAdditionalInsured'), [('NewAdditionalInsured_Type') : ''
        , ('AdditionalInsured_FirstName') : '', ('AdditionalInsured_LastName') : '', ('AdditionalInsured_ZipCode') : '', ('AdditionalInsured_Address1') : ''
        , ('AdditionalInsured_City') : '', ('AdditionalInsured_AddressType') : '', ('State') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Addlnsured_GL2037_0704_Premium'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Addlnsured_GL2037_0704_Premium'), '4500')

