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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP0450_RadioButton_ExcludeVandalism_Yes'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP0450_RadioButton_ExcludeSprinklerLeakage_Yes'))

Date d = new Date()

SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

String currentDate = format.format(d)

Calendar c = Calendar.getInstance()

c.setTime(d)

c.add(Calendar.DAY_OF_MONTH, 1)

Date currentDatePlus = c.getTime()

PermitPeriodFrom = format.format(currentDatePlus)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP0450_TextBox_PermitPeriodFrom'), PermitPeriodFrom)

PermitPeriodTo = PermitPeriodFrom

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CP0450_TextBox_PermitPeriodTo'), PermitPeriodTo)
