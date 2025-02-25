import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Quote_Tab_CPA'))

CPARecommendedScore = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_WC_QuoteScreen_Get_CPA_RecommendedScore'))

String data = CPARecommendedScore

WebUI.comment('CPA Recommended Score is ' + data)

double cpaScore = Double.parseDouble(data)

boolean flag = false

if (cpaScore < 1.00) {
flag = true 
	}

Assert.assertTrue(flag, 'CPA Recommended Score is less than 1.00')

	
	