import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQues_CheckBox_TypeOfOperations_Hotel'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQues_CheckBox_TypeOfOperations_Hotel'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_NumberOfRooms'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_NumberOfRooms'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_Averageroomchange'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_Averageroomchange'), 
    '5000', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_AverageOccupancyRate'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_AverageOccupancyRate'), 
    '600', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_NumberofStories'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_NumberofStories'), 
    '5', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_TotalAnnualSales'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_TotalAnnualSales'), 
    '1000', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQues_CheckBox_RoomRentalBy_Hour'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQues_CheckBox_RiskHave_MeetingRooms'), 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQues_TextBox_MaxRoomCapacity'), '10', 
    FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_ManagingCurrentLocation'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_ManagingCurrentLocation'), 
    '5', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_Sprinklerednopercentageiisnot'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_Sprinklerednopercentageiisnot'), 
    '10', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_DescribeArea'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_Textbox_DescribeArea'), 
    '200', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_CheckBox_TypesOfSmokeDetectors_Hardwired'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesSecurity_CheckBox_RoomAccess_InteriorCorridor'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesSwimmingPool_CheckBox_PoolMaintenance_HotelOrMotel'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Checkbox_PoolManagementcompany'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesSwimmingPool_CheckBox_LifeguardsProvided_HotelOrMotel'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_TextBox_Babysittingservices'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_CheckBox_DescribeanyCHeckedAmenities'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_HotelQuesFireProtection_CheckBox_DescribeanyCHeckedAmenities'), 
    'Text', FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10, FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

