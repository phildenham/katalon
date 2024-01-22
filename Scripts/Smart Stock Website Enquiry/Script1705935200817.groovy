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

WebUI.navigateToUrl('https://www.kcsmartstock.co.uk/')

WebUI.setText(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/input_input_text'), 'Test Company')

WebUI.click(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/div_Accounts Integrated Stock Management Wi_c939f4'))

WebUI.setText(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/input_input_text_1'), 
    'Test Company')

WebUI.setText(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/input_email'), '')

WebUI.setText(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/textarea_message'), 'Test Company')

WebUI.setText(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/input_email'), 'test@test.com')

WebUI.setText(findTestObject('Object Repository/Page_KC Smart Stock  Connected Stock Contro_a1fe87/input_subject'), '01724400300')

WebUI.click(findTestObject('Object Repository/Page_1 new message/span_Send Your Enquiry'))
