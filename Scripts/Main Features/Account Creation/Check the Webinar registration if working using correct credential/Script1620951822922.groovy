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

Random rnd = new Random()

randomNumber = (0 + rnd.nextInt(9999))

WebUI.openBrowser(GlobalVariable.coatingsURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Account Creation/Webinar Registration/span_Selection Resources'))

WebUI.click(findTestObject('Object Repository/test/a_Webinars and Videos'))

WebUI.click(findTestObject('Account Creation/Webinar Registration/span_Webinar option'))

WebUI.click(findTestObject('Object Repository/test/strong_REGISTER (free)'))

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_First name_webinar'), 'test')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__Lname_webinar'), 'test')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__email_webinar'), ('qa.castelis.test' + String.valueOf(
        randomNumber)) + '@yopmail.com')

'Input valid password'
WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__password_webinar'), GlobalVariable.password)

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__PhoneNumber_webinar'), '12345678')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__jobtitle_webinar'), 'qa')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, 'S'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__company_webinar'), 'Castelis')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input__city_webinar'), 'Paris')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, 'Ph'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.TAB, 'D'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/test/span_Next'))

WebUI.click(findTestObject('Account Creation/Webinar Registration/div_I agree to share my details with suppliers of the sponsored content and to be contacted by them'))

WebUI.verifyElementVisible(findTestObject('Account Creation/Selector Registration/div_Please confirm your email              _9e762d'))

WebUI.closeBrowser()

