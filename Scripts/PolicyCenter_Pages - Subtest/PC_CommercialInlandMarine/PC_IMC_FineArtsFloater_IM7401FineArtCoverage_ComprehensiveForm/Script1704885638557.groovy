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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtFloater_Checkbox_IM7401FineArtCoverage _ComprehensiveForm'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FIneArtFloater_7401_Dropdown_CoveredFineArts'), 
    IM7401_CoveredFineArts, true)
if (CoveredFineArts.contains('Schedule on File'))
{
	WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtFloater_IM7401_ScheduleonFile_SpecialPerilsLoad'),
		ScheduleOnFile_SpecialPerilsLoad)
}
if (CoveredFineArts.contains('Scheduled Fine Arts'))
{
WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_AddExistingLocation'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtFloater_IM7401_TextBox_Description'), IM7401_Description)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtFloater_IM7401_Textbox_Limit'), IM7401_Limit)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_FineArtFloater_IM7401_Textbox_SpecialPerilsLoad'), 
    IM7401_SpecialPerilsLoad)

}

