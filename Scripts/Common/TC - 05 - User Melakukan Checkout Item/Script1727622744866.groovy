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

WebUI.callTestCase(findTestCase('Common/TC - 02 - User Login Kedalam Website Dengan User Yang Valid'), [:], FailureHandling.STOP_ON_FAILURE)


for (int i = 1; i < 3; i++) {
	WebUI.click(findTestObject('Object Repository/Common/Store/card_product', [('no') : i]))
	WebUI.click(findTestObject('Object Repository/Common/Store/button_add_to_cart'))
	WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_home'))
}

WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_cat_laptops'))

for (int i = 1; i < 3; i++) {
	WebUI.click(findTestObject('Object Repository/Common/Store/card_product', [('no') : i]))
	WebUI.click(findTestObject('Object Repository/Common/Store/button_add_to_cart'))
	WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_home'))
	WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_cat_laptops'))
}

WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_cat_monitors'))

for (int i = 1; i < 3; i++) {
	WebUI.click(findTestObject('Object Repository/Common/Store/card_product', [('no') : i]))
	WebUI.click(findTestObject('Object Repository/Common/Store/button_add_to_cart'))
	WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_home'))
	WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_cat_monitors'))
}

WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_cart'))

WebUI.click(findTestObject('Object Repository/Common/Store/button_place_order'))

WebUI.setText(findTestObject('Object Repository/Common/Store/input_name'), GlobalVariable.NAME)

WebUI.setText(findTestObject('Object Repository/Common/Store/input_country'), GlobalVariable.COUNTRY)

WebUI.setText(findTestObject('Object Repository/Common/Store/input_city'), GlobalVariable.CITY)

WebUI.setText(findTestObject('Object Repository/Common/Store/input_card'), GlobalVariable.CARD)

WebUI.setText(findTestObject('Object Repository/Common/Store/input_month'), GlobalVariable.MONTH)

WebUI.setText(findTestObject('Object Repository/Common/Store/input_year'), GlobalVariable.YEAR)

WebUI.click(findTestObject('Object Repository/Common/Store/button_purchase'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Store/label_thank_you_for_your_purchase'), 1)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Common/Store/label_thank_you_for_your_purchase')), "Thank you for your purchase!", false)

WebUI.click(findTestObject('Object Repository/Common/Store/button_ok'))

WebUI.closeBrowser()