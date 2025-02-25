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

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_GL_Leftpanel_Modifiers'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

if (State.equals('Indiana')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
        '-5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
        '-5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
        '-10', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_Equipment-TypeConditionCare'), 
        '-10', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_PeculiaritiesOfClassification'), 
        '-10', false)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_Equipment-TypeConditionCare'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_PeculiaritiesOfClassification'), 
        'Justification done')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
            '-13', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
            '-11', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
            '-8', false)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
            'Justification done')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'), 
        5, FailureHandling.OPTIONAL)

    if (cppIMCLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
} else if (State.equals('Michigan')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
        '-5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
        '-5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
        '-10', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_Equipment-TypeConditionCare'), 
        '-10', false)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_Equipment-TypeConditionCare'), 
        'Justification done')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
            '-13', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
            '-11', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
            '-8', false)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
            'Justification done')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'), 
        5, FailureHandling.OPTIONAL)

    if (cppIMCLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
} else if (State.equals('Illinois')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
        '-5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
        '-5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
        '-10', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_Equipment-TypeConditionCare'), 
        '-10', false)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_Equipment-TypeConditionCare'), 
        'Justification done')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
            '-13', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
            '-11', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
            '-8', false)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
            'Justification done')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'), 
        5, FailureHandling.OPTIONAL)

    if (cppIMCLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

        WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 60)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 60)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
} else if (State.equals('Iowa')) {
    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
        '5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
        '5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
        '5', false)

    WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_Equipment-TypeConditionCare'), 
        '5', false)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
        'Justification done')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_Equipment-TypeConditionCare'), 
        'Justification done')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureInsidePremises'), 
            '5', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_ExposureOutsidePremises'), 
            '5', false)

        WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_Dropdown_CreditDebit_CareConditionAndType'), 
            '7', false)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureInsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_ExposureOutsidePremises'), 
            'Justification done')

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_Category_TextBox_Justification_CareConditionType'), 
            'Justification done')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'), 
        5, FailureHandling.OPTIONAL)

    if (cppIMCLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
} else if (State.equals('Ohio')) {
    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 50)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'), 
        5, FailureHandling.OPTIONAL)

    if (cppIMCLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
} else if (State.equals('Wisconsin')) {
    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 50)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'), 
        5, FailureHandling.OPTIONAL)

    if (cppIMCLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
} else {
    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 50)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

    WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')

    boolean cppCPLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'), 
        5, FailureHandling.OPTIONAL)

    if (cppCPLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CP_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppCRLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_Crime'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRLeftpanel.equals(true)) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Leftpanel_Modifiers'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'), 
            50)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
    }
    
    boolean cppCRCommercialFidelity = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Modifiers_CommercialFidelity_Checkbox_Override'), 
        5, FailureHandling.OPTIONAL)

    if (cppCRCommercialFidelity.equals(true)) {
        WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Modifiers_CommercialFidelity_Checkbox_Override'))

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Modifiers_CommercialFidelity_Checkbox_Override'))

        WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Modifiers_CommercialFidelity_TextArea_Comments'), 
            40)

        WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_CR_Modifiers_CommercialFidelity_TextArea_Comments'), 
            'comments')
    }
	
	boolean cppIMCLeftpanel = WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'),
		5, FailureHandling.OPTIONAL)

	if (cppIMCLeftpanel.equals(true)) {
		WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_Leftpanel_Modifiers'))

		WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'),
			50)

		WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_GLModifiers_CheckBox_Override'))

		WebUI.verifyElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 40)

		WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Modifiers_TextArea_Comments'), 'comments')
	}
}

WebUI.takeFullPageScreenshot()

