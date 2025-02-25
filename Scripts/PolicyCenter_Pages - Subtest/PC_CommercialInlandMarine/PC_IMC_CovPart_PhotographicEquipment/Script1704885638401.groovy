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

if (AddIM1251.contains('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquipment_Checkbox_IM1251'))
}

if (CoverageType.contains('ScheduledProperty')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_PhotographicEqupCov_CovType_ScheduleProperty'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (CoverageType.contains('Blanket Property')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_PhotographicEquipment_Blanket_PropertyType_Coverage'), 
        [('PhotographicEquipment_CoverageType') : 'Blanket Property', ('PhotographicEquipment_Deductible') : '500', ('PhotographicEquipment_Blanket_BlanketLimit') : '300000'
            , ('PhotographicEquipment_PropertyType') : 'Motion Picture Producer'], FailureHandling.STOP_ON_FAILURE)
}

if (AddAdditionalInterest.contains('Yes')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_AdditionalInterests_AddNewPerson'), 
        [('InterestType') : 'Mortgagee', ('Address1') : '281 W. Lane Ave', ('ZipCode') : '43210', ('AddressType') : 'Billing'], 
        FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquip_AdditionalInterest_Textbox_InterestType'), 
        'Mortgagee', false)

    not_run: WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_PhotographicEquip_AdditionalInterest_Textbox_ItemDescription'), 
        'addditionalInterestTest')
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))

