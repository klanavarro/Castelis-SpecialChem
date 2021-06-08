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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.adhesiveURL)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Subscribe Unsubscribe/a_Subscribe to Newsletters'), 3)

WebUI.click(findTestObject('Subscribe Unsubscribe/a_Subscribe to Newsletters'))

currentURL = WebUI.getUrl()

WebUI.verifyMatch(currentURL, 'https://adhesives.uat.specialchem.com/newsletterssubscription', false)

WebUI.setText(findTestObject('Login/input_Your email_txtUsernamelogin'), GlobalVariable.username0)

WebUI.setText(findTestObject('Login/input_Password_txtPasswordlogin'), GlobalVariable.password)

WebUI.click(findTestObject('Login/span_LOGIN'))

WebUI.verifyElementVisible(findTestObject('Subscribe Unsubscribe/div_Your Account  Professional Email  Your Business Card'))

WebUI.click(findTestObject('Subscribe Unsubscribe/label_Solutions (Monthly)'))

WebUI.click(findTestObject('Subscribe Unsubscribe/span_Confirm Subscription to Newsletters'))

WebUI.verifyElementVisible(findTestObject('Subscribe Unsubscribe/p_Already Subscribed'))

WebUI.closeBrowser()

