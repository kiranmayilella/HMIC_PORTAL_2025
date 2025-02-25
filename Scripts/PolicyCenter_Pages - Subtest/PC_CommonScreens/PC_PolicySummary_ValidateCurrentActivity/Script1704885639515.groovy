import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String activitySubject = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicySummary_Link_ActivitySubjectName', 
        [('ActivitySubject') : ActivitySubject]))

boolean flag = false

if (activitySubject.contains(ActivitySubject)) {
    flag = true

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicySummary_Link_ActivitySubjectName', [('ActivitySubject') : ActivitySubject]))
}

Assert.assertTrue(flag, ActivitySubject + ' activity is displayed successfully')