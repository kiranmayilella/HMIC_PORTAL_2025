import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Renewal Bound')

GlobalVariable.SubmissionStatus = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_TransactionNameAndStatus'))

GlobalVariable.PolicyNumber = WebUI.getText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_PolicyNumber'))

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_SubmissionBound_Link_ViewYourPolicy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_PolicySummary_Label_PolicyNumberLabel'), 
    0)

WebUI.takeFullPageScreenshot()
