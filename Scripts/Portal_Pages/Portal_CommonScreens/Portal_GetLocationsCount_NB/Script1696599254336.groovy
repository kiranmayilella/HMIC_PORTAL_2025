import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> loc_TotalRowsData = driver.findElements(By.xpath("//div[contains(@class,'InputList_cardHeader')]"))

int loc_Count = loc_TotalRowsData.size()

String loc_Count_NB = Integer.toString(loc_Count)

return loc_Count_NB