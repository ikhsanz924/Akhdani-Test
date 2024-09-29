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
import java.text.SimpleDateFormat

Date today = new Date()
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss")
String formattedDate = sdf.format(today)

WebUI.openBrowser(GlobalVariable.BASE_URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_sign_up'))

WebUI.setText(findTestObject('Object Repository/Common/Sign Up/input_username'), "test"+formattedDate)

WebUI.setText(findTestObject('Object Repository/Common/Sign Up/input_password'), "test")

WebUI.click(findTestObject('Object Repository/Common/Sign Up/button_sign_up'))

WebUI.click(findTestObject('Object Repository/Common/Sign Up/button_close'))

WebUI.click(findTestObject('Object Repository/Common/Home Page/nav_login'))

WebUI.setText(findTestObject('Object Repository/Common/Login/input_username'), "test"+formattedDate)

WebUI.setText(findTestObject('Object Repository/Common/Login/input_password'), "test")

WebUI.click(findTestObject('Object Repository/Common/Login/button_log_in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Common/Home Page/nav_name_user'), 0)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Common/Home Page/nav_name_user')), "Welcome test"+formattedDate, false)

WebUI.closeBrowser()
