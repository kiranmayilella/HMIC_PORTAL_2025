import org.testng.Assert

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

boolean isFormAvailable = ""

String totFormsList = TotalFormsList

if(ExpFormEditionDate.equals("") || ExpFormDescription.equals("")) {
	
	isFormAvailable = totFormsList.contains(ExpFormNumber)
	
	Assert.assertTrue(isFormAvailable, "Form " + ExpFormNumber + " found")
	
	WebUI.comment('Form ' + ExpFormNumber + ' found')
} else {

	isFormAvailable = totFormsList.contains(ExpFormNumber + "\n" + ExpFormEditionDate + "\n" + ExpFormDescription)
	
	Assert.assertTrue(isFormAvailable, "Form " + ExpFormNumber + "," + ExpFormEditionDate + "," + ExpFormDescription + " found")
	
	WebUI.comment('Form ' + ExpFormNumber + ',' + ExpFormEditionDate + ',' + ExpFormDescription + ' found')
}
