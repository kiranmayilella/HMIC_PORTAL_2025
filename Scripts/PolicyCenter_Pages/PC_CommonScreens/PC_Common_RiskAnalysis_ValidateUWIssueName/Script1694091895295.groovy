import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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