import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Supplemental')

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_CheckBox_SafetyManual'))

WebUI.takeFullPageScreenshot()

if (LOB.equals('General Liability') || LOB.equals('Commercial Package')) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextArea_SafetyAndSecurity'), 
        'Safety Manual Test')

    WebUI.takeFullPageScreenshot()
}

if (ClassCode.equals('92102')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_GeneralLiability/PC_GL_Supplemental_92102DrillingWater'), [:], 
        FailureHandling.STOP_ON_FAILURE)
}

if (LineSelection_RiskType.equals('Select Manufacturers Program') || LineSelection_RiskType.equals('Select Metalists I Program')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialPackage/PC_CPP_Supplemental_SelectManufacturersProgramQuestions'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (LineSelection_RiskType.equals('Select Hotel Program')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialPackage/PC_CPP_Supplemental_HotelQuestions'), [:], 
        FailureHandling.STOP_ON_FAILURE)
}

if (LineSelection_RiskType.equals('Church Program')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialPackage/PC_CPP_Supplemental_ChurchProgramQues'), [:], 
        FailureHandling.STOP_ON_FAILURE)
}

if (LineSelection_RiskType.equals('Condominium Association')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialPackage/PC_CPP_Supplemental_CondominiumAssociation'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (CoveragePartSelectionOption.equals('Motor Truck Cargo')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_MotorTruckCargo_Supplemental_GeneralInfo_Questions'), 
        [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_TextArea_AdditionalRemarks'), 'Remarks')
}

if (CoveragePartSelectionOption.equals('Transit')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Transit_Supplemental_GeneralInfo_Questions'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

if (AddCov.equals('CON6060')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialPackage/PC_CPP_Supplemental_AddCov_CON6060'), [:], 
        FailureHandling.STOP_ON_FAILURE)
}

if (LOB.equals('Commercial Property') || LOB.equals('Commercial Package')) {
    if (UnselectLineType_CommercialProperty.equals('Yes')) {
        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_Tab_CommercialProperty'), FailureHandling.OPTIONAL)

        WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_CP_CheckBox_PurchasePrice'), 
            30)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_CP_CheckBox_PurchasePrice'), FailureHandling.OPTIONAL)

        WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_CP_CheckBox_InsuranceDeterminedProfessionalAppraiser'), 
            30)

        WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_CP_CheckBox_InsuranceDeterminedProfessionalAppraiser'), 
            FailureHandling.OPTIONAL)

        WebUI.waitForElementPresent(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_Supplemental_CP_CheckBox_InsuranceDeterminedProfessionalAppraiser'), 
            30)
    }
}

if (UnselectLineType_Crime.equals('No')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Tab_CommercialCrime'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ClassificationOfEmpOrLoc_NumberOf_TextBox_AccountantsAndAssts'), 
        '10')

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_Money'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_Money'), 
        '1000')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_ChecksOfDeposit'), 
        '100')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_ChecksOfAccountsPayable'), 
        '10')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_PayrollChecks'), 
        '10000')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_Moneyovernight'), 
        '1000')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MoneySecurity_Inside_TextBox_Securities(InBankOrSafeDeposit)'), 
        '100000')

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlAndAuditProcedures_AuditIsPerformedBy_CheckBox_CPA'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlAndAuditProcedures_AuditIsPerformedBy_CheckBox_CPA'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlAndAuditProcedures_TextArea_NameAndAddressOfPersonOrFirmPerformingAudit'), 
        'name1')

    Date d = new Date()

    SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

    String ctrlAuditDate = format.format(d)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlsAndAuditProcedures_TextBox_DateOfCompletionOfLastAuditOfCashAndAccounts'), 
        ctrlAuditDate)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlsAndAuditProcedures_TextBox_DateOfCompletionOfLastAuditOfInventory'), 
        ctrlAuditDate)

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlsAndAuditProceduresBankingOrOther_TextBox_LargestSingleAmountThatCanBeTrasferred'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_ControlsAndAuditProceduresBankingOrOther_TextBox_LargestSingleAmountThatCanBeTrasferred'), 
        '10000')

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Property_TextArea_DescriptionOfPropMerchandiseStock'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Property_TextArea_DescriptionOfPropMerchandiseStock'), 
        'property1')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_Property_TextBox_MaximumValue'), '100000')

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MessengerProtection_TextBox_NumberOfMessengers'))

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MessengerProtection_TextBox_NumberOfMessengers'), 
        '10')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MessengerProtection_TextBox_NumberOfGuardsPerMessenger'), 
        '1')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Supplemental_MessengerProtection_TextBox_NumberOfArmoredVehicles'), 
        '10')
}