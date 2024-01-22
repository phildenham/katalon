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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://visisoft.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_EPOS  Online Ticketing System For Visi_99e627/a_Contact'))

WebUI.setText(findTestObject('Object Repository/Page_Contact Visisoft  Visitor Attraction Software/input_namesfirst_name'), 
    'Test Company')

WebUI.setText(findTestObject('Object Repository/Page_Contact Visisoft  Visitor Attraction Software/input_input_text'), 'Test Company')

WebUI.setText(findTestObject('Object Repository/Page_Contact Visisoft  Visitor Attraction Software/textarea_description'), 
    'Test Company')

WebUI.setText(findTestObject('Object Repository/Page_Contact Visisoft  Visitor Attraction Software/input_email'), 'test@test.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact Visisoft  Visitor Attraction Software/input_phone'), '01724400300')

WebUI.click(findTestObject('Object Repository/Page_Contact Visisoft  Visitor Attraction Software/button_Get In Touch'))

