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

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_CheckBox_CertificateHolder'))

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_CertHolder_FirstName'), 'ADAM')

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_CertHolder_LastName'), 'GILCHRIST')

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_input_CertHolder_Address'))

WebUI.setText(findTestObject('Portal/Portal_AdditionalInfo_input_CertHolder_Address'), '3105 Grand Ave')

WebUI.sendKeys(findTestObject('Portal/Portal_AdditionalInfo_input_CertHolder_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Portal/Portal_AdditionalInfo_Button_CertHolder_Save'))

WebUI.click(findTestObject('Portal/Portal_StandardizeAddress_Button_Continue'), FailureHandling.OPTIONAL)

