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

WebUI.openBrowser(GlobalVariable.BASE_URL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/title_product_store'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_home'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_contact'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_about_us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_cart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_login'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_sign_up'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_cat_phones'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_cat_laptops'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_cat_monitors'), 0)

WebUI.closeBrowser()
