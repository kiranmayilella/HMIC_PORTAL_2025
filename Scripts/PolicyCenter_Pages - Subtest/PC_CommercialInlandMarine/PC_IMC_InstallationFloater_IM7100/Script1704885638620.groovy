import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_Select_IM 7100 Installation Floater Coverage'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_CatastropheLimit'), 
    '25000')

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_ScheduleedContractorsEquipmentCoinsurance'), 
    'BRCoinsurance70', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_Deductible'), 
    'Deductible1000', true)

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_InstallationReceipts'), 
    '10')

WebUI.selectOptionByLabel(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_PropertyCovered'), 
    IM7100_PropertyCovered, false)

WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_BasicLoad'))

WebUI.doubleClick(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_BasicLoad'))

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_BasicLoad'), 
    '0.09')

if (IM7100_PropertyCovered.equals('Blanket Coverage')) {
    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_JobsiteLimit'), 
        '15000')

    WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_JobDescription'), 
        'testing')
}

WebUI.setText(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_IMC_InstallationFloater_IM7100_LengthOfJob'), 
    '10')

if (IM7100_PropertyCovered.equals('Scheduled Location Coverage')) {
    WebUI.scrollToElement(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'), 10)

    WebUI.waitForPageLoad(10)

    WebUI.mouseOver(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'))

    WebUI.waitForPageLoad(10)

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_CovPart_LocAdd_Button_Add'))

    WebUI.waitForPageLoad(10)

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_ExistingLocation'))

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Link_ExistingLocation'))

    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_ExistingAddress'))

    WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Location Information')

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_StandardizeAddress'), 
        FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(10)

    WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_Select'), FailureHandling.OPTIONAL)

    WebUI.waitForPageLoad(10)

    TitleName = WebUI.getText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), FailureHandling.STOP_ON_FAILURE)

    if (TitleName.equals('Location Information')) {
        WebUI.click(findTestObject('Object Repository/PolicyCenter/PolicyCenterObjects/PC_Common_Button_OK'))
    }
    
    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleTextBox_JobDescription'), 'Description1')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleTextBox_Limit'), '25000')

    //WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleCalenderButton_JobCommencement'))
    //WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))
    WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_TextBox_JobCommencement'))

    Date d = new Date()

    SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy')

    String IM7100jobCommencementDate = format.format(d)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_TextBox_JobCommencement'), IM7100jobCommencementDate)

    //WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleCalenderButton_JobCompletion'))
    //WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_Today'))
    String IM7100jobCompletionDate = format.format(d)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_TextBox_JobCompletion'), IM7100jobCompletionDate)

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleTextBox_ContractAmount'), '200')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleTextBox_OnwerSuppliedPropAmount'), 
        '200')

    WebUI.setText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_IMC_IM7100_ScheduleTextBox_JobsiteSecurityDescription'), 
        'Security1')
}