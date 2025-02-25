package myPack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

public class Portal_ULP_Utility {

	@Keyword
	def getCoverageInfo(String coverageName) {

		WebDriver driver = DriverFactory.getWebDriver()

		List<Integer> cellText = new ArrayList()

		int premium

		List<WebElement> rows_data = driver.findElements(By.xpath("//td[contains(text(),'"+coverageName+"')]/following-sibling::td"))

		for(int i = 0; i< rows_data.size(); i++) {

			String data = rows_data.get(i).getText().replace('$', '')

			//println(data+"....................")

			if(data.isEmpty()) {
				continue

			}
			else {
				premium = Integer.parseInt(data)
			}

			//println(premium+".....................")

			if(premium != null) {

				//println("Data available in the " +coverageName+ " is..............." + data)

				cellText.add(premium)
			}
		}

		return cellText
	}

	@Keyword
	def checkResidencePremium(List<Integer> residenceData) {

		int totalNum = residenceData.get(0)
		int actualPremium = residenceData.get(1)
		println(actualPremium+"...................................")
		println(totalNum+".................................")
		int baseRate = 16
		int expectedPremium = (totalNum - 1)*baseRate
		println(expectedPremium+"***************************")

		if(actualPremium == expectedPremium) {
			println("Portal generated premium which is: "+ actualPremium +"matches with expected premium: "+expectedPremium )
			return true;
		}
		else {
			println("Portal generated premium which is: "+ actualPremium +" does not match with expected premium: "+expectedPremium )
			return false;
		}
	}

	@Keyword
	def checkAutoPremium(List<Integer> autosData) {

		int totalNum = autosData.get(0)
		int actualPremium = autosData.get(1)
		println(actualPremium+"...................................")
		println(totalNum+".................................")
		int baseRate = 33
		int expectedPremium = (totalNum - 2)*baseRate
		println(expectedPremium+"***************************")

		if(actualPremium == expectedPremium) {
			println("Portal generated premium which is: "+ actualPremium +"matches with expected premium: "+expectedPremium )
			return true;
		}
		else {
			println("Portal generated premium which is: "+ actualPremium +" does not match with expected premium: "+expectedPremium )
			return false;
		}
	}

	@Keyword
	def checkOHCountyPremium(List<Integer> countyData, String countyName) {

		int actualPremium = countyData.get(0)
		int expectedPremium
		println(actualPremium+"...................................")
		if(countyName == 'All Other Counties') {
			expectedPremium = 170
		}
		else if(countyName == 'Ashtabula') {
			expectedPremium = 192
		}
		else if(countyName == 'Cuyahoga') {
			expectedPremium = 192
		}
		else if(countyName == 'Franklin') {
			expectedPremium = 192
		}
		else if(countyName == 'Hamilton') {
			expectedPremium = 192
		}
		else if(countyName == 'Lucas') {
			expectedPremium = 192
		}
		else if(countyName == 'Mahoning') {
			expectedPremium = 192
		}
		else if(countyName == 'Montgomery') {
			expectedPremium = 192
		}
		else if(countyName == 'Summit') {
			expectedPremium = 192
		}
		else if(countyName == 'Trumbull') {
			expectedPremium = 192
		}
		else {
			println("please select a valid county")
		}

		if(actualPremium == expectedPremium) {
			println("Portal generated premium which is: "+ actualPremium +"matches with expected premium: "+expectedPremium )
			return true;
		}
		else {
			println("Portal generated premium which is: "+ actualPremium +" does not match with expected premium: "+expectedPremium )
			return false;
		}

	}

	@Keyword
	def checkAntiqueAutoPremium(List<Integer> antiqueData) {

		int totalNum = antiqueData.get(0)
		int actualPremium = antiqueData.get(1)
		println(actualPremium+"...................................")
		println(totalNum+".................................")
		int baseRate = 16
		int base = 27
		int expectedPremium
		if(totalNum == 1) {
			expectedPremium = base
		}
		else {
			expectedPremium = (totalNum-1)*baseRate + base
		}
		println(expectedPremium+"***************************")
		if(actualPremium == expectedPremium) {
			println("Portal generated premium which is: "+ actualPremium +"matches with expected premium: "+expectedPremium )
			return true;
		}
		else {
			println("Portal generated premium which is: "+ actualPremium +" does not match with expected premium: "+expectedPremium )
			return false;
		}
	}
}
