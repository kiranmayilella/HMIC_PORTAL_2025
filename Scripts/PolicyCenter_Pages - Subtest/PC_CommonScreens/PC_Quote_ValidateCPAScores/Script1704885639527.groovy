import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Quote_Tab_CPA'))

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Quote_Label_CPA_DecileScore'))

CPA_DecileScore = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Quote_Label_CPA_DecileScore'))

Assert.assertTrue(Integer.parseInt(CPA_DecileScore) > Integer.parseInt('0'))

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Quote_Label_CPA_CentileScore'))

CPA_CentileScore = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Quote_Label_CPA_CentileScore'))

Assert.assertTrue(Integer.parseInt(CPA_CentileScore) > Integer.parseInt('0'))

WebUI.comment('CPA Scores are visible in UI')

