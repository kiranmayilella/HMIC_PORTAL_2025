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

if (!(RiskType.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Dropdown_RiskType'), RiskType, 
        false)
}

if (!(LimitedProductWithdrawalCoverage.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_Dropdown_LimitedProductWithdrawalCoverage'), 
        LimitedProductWithdrawalCoverage, false)
}

if (!(AcceptCertifiedActsofTerrorismCoverage.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_Dropdown_AcceptCertifiedActsofTerrorismCoverage'), 
        AcceptCertifiedActsofTerrorismCoverage, false)
}

if (!(Limits_EachOccurrenceLimit.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_Dropdown_EachOccurrenceLimit'), Limits_EachOccurrenceLimit, 
        false)
}

if (!(ProdCoAggregateLimit.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_Dropdown_ProductsOrCompletedOperationsAggregateLimit'), 
        ProdCoAggregateLimit, false)
}

if (!(AggregateLimit.equals(''))) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_OCP_Dropdown_AggregateLimit'), AggregateLimit, 
        false)
}

if (Subline.equals('Owners and Contractors')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GL_ProjectOwner_ButtonDropdown_Add'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_AddNewPerson'))

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_NewPerson_ExistingAddress_NewOwner_OR_Officer'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

