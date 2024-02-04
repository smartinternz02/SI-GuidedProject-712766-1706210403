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

WebUI.openBrowser('https://www.amazon.com')

WebUI.maximizeWindow()

WebUI.selectOptionByLabel(findTestObject('Buttons_OR/AmazonSearchFieldValidate_OR/Page_Amazon.com. Spend less. Smile more/category'), 
    'Books', false)

WebUI.setText(findTestObject('Buttons_OR/AmazonSearchFieldValidate_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'da vinci code')

WebUI.click(findTestObject('Buttons_OR/AmazonSearchFieldValidate_OR/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.click(findTestObject('Buttons_OR/AmazonSearchFieldValidate_OR/Page_Amazon.com  da vinci code/span_Mystery, Thriller  Suspense'))

notchecked = WebUI.verifyElementNotChecked(findTestObject('Buttons_OR/AmazonSearchFieldValidate_OR/Page_Amazon.com  da vinci code/i_Action-packed_a-icon a-icon-checkbox'), 
    10)

if (notchecked == true) {
    WebUI.check(findTestObject('Buttons_OR/AmazonSearchFieldValidate_OR/Page_Amazon.com  da vinci code/i_Action-packed_a-icon a-icon-checkbox'))
}

WebUI.closeBrowser()

