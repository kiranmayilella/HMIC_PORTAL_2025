import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_TransactionBound_Link_ViewYourPolicy'))

WebUI.waitForPageLoad(20)

boolean flag1 = false

if (WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title')).contains('Policy Summary')) {
    flag1 = true
}

Assert.assertTrue(flag1, 'Policy Summary screen is visible')

boolean flag2 = false

if (WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicySummary_Label_PolicyStatus')).contains('In Force')) {
    flag2 = true
}

Assert.assertTrue(flag2, 'Policy status is In Force as cancellation is scheduled')