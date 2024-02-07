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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    '8902526748')

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

WebUI.setEncryptedText(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'RfES2L809yyT69vCWLoDzQ==')

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.setText(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'mouse')

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon.com  mouse/span_E-YOOSO Wireless Mouse, Computer Mouse_f02128'))

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon.com E-YOOSO Wireless Mouse, Com_27e330/input_Add a gift receipt for easy returns_s_f305a6'))

WebUI.click(findTestObject('Object Repository/AmazonPages_OR/Amazon_AddtoWishlist_OR/Page_Amazon.com E-YOOSO Wireless Mouse, Com_27e330/a_View Your List'))

WebUI.closeBrowser()

