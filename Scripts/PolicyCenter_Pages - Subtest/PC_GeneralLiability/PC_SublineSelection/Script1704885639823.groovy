import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Subline Selection')

WebUI.takeFullPageScreenshot()

//for parameterizing the web test object - PC_SublineSelection_CheckBox_Subline
myTestObject = new TestObject('customObject')

List<TestObjectProperty> properties = new ArrayList<TestObjectProperty>()

properties.add(new TestObjectProperty('xpath', ConditionType.EQUALS, "//div[text()='${Subline}']/../../../../..//input[@type='checkbox']"))

//Set the object
myTestObject.setProperties(properties)

WebUI.click(myTestObject)

properties.clear()

WebUI.takeFullPageScreenshot()

//for parameterizing the web test object - PC_SublineSelection_Link_NoneSelected
properties.add(new TestObjectProperty('xpath', ConditionType.EQUALS, "//div[text()='${Subline}']/../../../../..//div[contains(@id,'Jurisdictions')]"))

//Set the object
myTestObject.setProperties(properties)

WebUI.click(myTestObject)

properties.clear()

WebUI.takeFullPageScreenshot()

//for parameterizing the web test object - PC_SublineSelection_CheckBox_State
properties.add(new TestObjectProperty('xpath', ConditionType.EQUALS, "//div[text()='${State}']/../../../../..//input[@type='checkbox']"))

//Set the object
myTestObject.setProperties(properties)

WebUI.click(myTestObject)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_SublineSelection_Button_OK'))

WebUI.waitForPageLoad(60)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'General Liability')

WebUI.takeFullPageScreenshot()