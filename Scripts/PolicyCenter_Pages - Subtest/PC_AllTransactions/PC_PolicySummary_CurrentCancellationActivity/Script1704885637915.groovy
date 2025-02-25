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
import org.testng.Assert as Assert

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicySummary_ActivityLink_ReviewandapprovecancellationActivity'))

WebUI.waitForPageLoad(30)

String Cancellation_TransactionNumber = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNumber'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

'Activity subject is displayed as "Review and approve cancellation"'
WebUI.verifyElementVisible(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ActivityDetail_Label_Subject'), FailureHandling.STOP_ON_FAILURE)

boolean flag1 = false

if (WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ActivityDetail_Label_CancellationRelatedTo')).contains(
    'Cancellation')) {
    flag1 = true
}

Assert.assertTrue(flag1, 'PC_ActivityDetail_Label_CancellationRelatedTo contains Cancellation')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ActivityDetail_Button_Assign'))

WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AssignActivities_Dropdown_AssignmentSelectFromList'), 
    AssignmentSelectFromList, false)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_AssignActivities_Button_Assign'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ActivityDetail_Button_Edit'))

WebUI.doubleClick(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ActivityDetail_Label_AssignedTo'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_ActivityDetail_Button_Approve'))

