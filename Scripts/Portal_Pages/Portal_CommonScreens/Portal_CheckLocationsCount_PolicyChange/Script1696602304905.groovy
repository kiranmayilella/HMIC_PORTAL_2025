import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> loc_TotalRowsData = driver.findElements(By.xpath("//div[contains(@class,'InputList_cardHeader')]"))

int loc_Count = loc_TotalRowsData.size()

String loc_Count_PC = Integer.toString(loc_Count)

boolean flag = false

if (loc_Count_PC.equals(locCount_NB)) {
	
	flag = true

	WebUI.comment('Location details matches in Policy change transaction')
}

Assert.assertTrue(flag, 'Location details matches in Policy change transaction')