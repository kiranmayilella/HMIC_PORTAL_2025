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

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username, ('PC_Password') : PC_Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_CreateAccount'), [('Address1') : Address1, ('City') : City
        , ('AddressType') : AddressType, ('AgencyName') : AgencyName, ('ProducerCode') : ProducerCode, ('ZipCode') : Zipcode
        , ('State') : State, ('TCName') : TCName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_UpdateContactRolesForSubmission'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_InitiateSubmission'), [('State') : State, ('LOB') : LOB
        , ('TCName') : TCName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_PolicyInfo'), [('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

if (!(AddAdditionalNamedInsureds.equals('')) && AddAdditionalNamedInsureds.equals('Yes')) {
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_PolicyInfo_AdditionalNamedInsureds_Button_Add'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_TypeList_AddNewPerson'))

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_NewPerson_ExistingAddress_NewAdditionalNamedInsured'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(40)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Line Selection')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialPackage/PC_CPP_LineSelection'), [('UnselectLineType_Crime') : UnselectLineType_Crime
        , ('UnselectLineType_IMC') : UnselectLineType_IMC, ('LineSelection_RiskType') : LineSelection_RiskType, ('UnselectLineType_GeneralLiability') : UnselectLineType_GeneralLiability
        , ('UnselectLineType_CommercialProperty') : UnselectLineType_CommercialProperty], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Title_Label_SublineSelection'), 
    'Subline Selection')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_GeneralLiability/PC_SublineSelection'), [('State') : State, ('Subline') : Subline], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'General Liability')

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_GL_LeftPanel_StateSpecificInformation'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State-Specific Information')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_GeneralLiability/PC_GL_Locations'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Exposures')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_GeneralLiability/PC_Exposures'), [('Subline') : Subline, ('ClassCode') : ClassCode], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Exposures')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Modifiers')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Property')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_CP_Locations'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State-Specific Information')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Blankets')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risks')

WebUI.takeFullPageScreenshot()

if (State.equals('Illinois')) {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_Risks_AddBuilding'), [('CP_ClassCode') : CP_ClassCode
            , ('NewBuilding_StructureMineSubsidence_StructureType') : NewBuilding_StructureMineSubsidence_StructureType, ('NewBuilding_StructureMineSubsidence_Limit') : NewBuilding_StructureMineSubsidence_Limit
            , ('Building_AddAdditionalInterests') : Building_AddAdditionalInterests, ('AdditionalInterestType') : AdditionalInterestType], 
        FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialProperty/PC_Risks_AddBuilding'), [('CP_ClassCode') : CP_ClassCode
            , ('Building_AddAdditionalInterests') : Building_AddAdditionalInterests, ('AdditionalInterestType') : AdditionalInterestType], 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Modifiers')

WebUI.takeFullPageScreenshot()

if (UnselectLineType_IMC.equals('No')) {
    WebUI.comment('Move on to IMC section enter the Mandatory details')

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_LeftPanel_CommercialInlandMarine'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Commercial Inland Marine')

    WebUI.takeFullPageScreenshot()

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Add_CoveragePartSelection'), [('CoveragePartSelectionOption') : CoveragePartSelectionOption], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_CovPart_BuildersRisk'), [('BuildersRiskCoverage') : BuildersRiskCoverage
            , ('BuildersRisk_AddAdditionalInterests') : BuildersRisk_AddAdditionalInterests, ('BuildersRisk_AdditionalInterestType') : BuildersRisk_AdditionalInterestType], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_CPP_IMC_LeftPanel_Locations'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Locations')

    WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommercialInlandMarine/PC_IMC_Locations'), [('ClassCode') : ClassCode], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'State Specific Information')

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Modifiers')

    WebUI.takeFullPageScreenshot()
}

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Modifiers')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Supplemental')

WebUI.takeFullPageScreenshot()

WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Supplemental'), [('LOB') : LOB, ('LineSelection_RiskType') : LineSelection_RiskType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Policy Review')

WebUI.takeFullPageScreenshot()

return LOB

