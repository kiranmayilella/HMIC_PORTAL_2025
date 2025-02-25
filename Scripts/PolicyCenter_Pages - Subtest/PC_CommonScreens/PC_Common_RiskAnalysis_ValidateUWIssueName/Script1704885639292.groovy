import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'))

if (TitleName.contains('Issues')) {
    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Issues_Button_Details'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

    String uwIssueName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Link_UWIssueName', 
            [('UWIssueName') : UWIssueName]), FailureHandling.STOP_ON_FAILURE)

    boolean flag = false

    if (uwIssueName.contains(UWIssueName)) {
        flag = true

        WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Link_UWIssueName', [('UWIssueName') : UWIssueName]), 
            FailureHandling.STOP_ON_FAILURE)
    }
    
    Assert.assertTrue(flag, ('UW Issue ' + UWIssueName) + 'is displayed successfully')
} else {
	WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))
	
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))

    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Tab_UWIssues'), 30)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Tab_UWIssues'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

    String uwIssueName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Link_UWIssueName', 
            [('UWIssueName') : UWIssueName]), FailureHandling.STOP_ON_FAILURE)

    boolean flag = false

    if (uwIssueName.contains(UWIssueName)) {
        flag = true

        WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_RiskAnalysis_Link_UWIssueName', [('UWIssueName') : UWIssueName]), 
            FailureHandling.STOP_ON_FAILURE)
    }
    
    Assert.assertTrue(flag, ('UW Issue ' + UWIssueName) + 'is displayed successfully')
}

WebUI.takeFullPageScreenshot()

WebUI.comment(('UW Issue - ' + UWIssueName) + ' is triggered successfully in Risk Analysis screen')

