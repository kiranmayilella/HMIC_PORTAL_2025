import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String TotalFormsList = ''

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Forms')

boolean eleFormsPageNumber = false

eleFormsPageNumber = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/Forms_Pages'), 5, FailureHandling.OPTIONAL)

if (eleFormsPageNumber.equals(true)) {
    Forms_NoOfPages = '1'

    Forms_NoOfPages = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/Forms_Pages'), FailureHandling.STOP_ON_FAILURE)

    Forms_Table_Page1 = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Table'), FailureHandling.STOP_ON_FAILURE)

    TotalFormsList = Forms_Table_Page1

    if (Integer.parseInt(Forms_NoOfPages) > Integer.parseInt('1')) {
        //Click 'PC_Forms_Button_FormsRightArrow'
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Button_FormsRightArrow'))
    }
    
    Forms_Table_Page2 = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Table'))

    TotalFormsList = (Forms_Table_Page1 + Forms_Table_Page2)

    Forms_Table_Page2 = 'NA'

    if (Integer.parseInt(Forms_NoOfPages) > Integer.parseInt('2')) {
        //Click 'PC_Forms_Button_FormsRightArrow'
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Button_FormsRightArrow'))
    }
    
    Forms_Table_Page3 = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Table'))

    TotalFormsList = (TotalFormsList + Forms_Table_Page3)

    Forms_Table_Page3 = 'NA'

    if (Integer.parseInt(Forms_NoOfPages) > Integer.parseInt('3')) {
        //Click 'PC_Forms_Button_FormsRightArrow'
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Button_FormsRightArrow'))
    }
    
    Forms_Table_Page4 = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Table'))

    TotalFormsList = (TotalFormsList + Forms_Table_Page4)

    Forms_Table_Page4 = 'NA'

    if (Integer.parseInt(Forms_NoOfPages) > Integer.parseInt('4')) {
        //Click 'PC_Forms_Button_FormsRightArrow'
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Button_FormsRightArrow'))
    }
    
    Forms_Table_Page5 = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Table'))

    TotalFormsList = (TotalFormsList + Forms_Table_Page5)

    Forms_Table_Page5 = 'NA'
} else {
    Forms_Table_Page1 = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Forms_Table'), FailureHandling.STOP_ON_FAILURE)

    TotalFormsList = Forms_Table_Page1
}

return TotalFormsList