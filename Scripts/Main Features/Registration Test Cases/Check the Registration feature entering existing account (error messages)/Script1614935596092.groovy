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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.coatingsURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/a_Login  Register'))

WebUI.click(findTestObject('Registration/span_REGISTER'))

WebUI.setText(findTestObject('Registration/input_Professional_Email'), GlobalVariable.username0)

WebUI.setText(findTestObject('Registration/input_Choose a password_Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Registration/input_First Name _FirstName'), 'QA')

WebUI.setText(findTestObject('Registration/input_Last Name _LastName'), 'Test')

WebUI.setText(findTestObject('Registration/input_Company _Company'), 'Castelis')

WebUI.selectOptionByIndex(findTestObject('Registration/select_Company Activity'), 19)

WebUI.selectOptionByIndex(findTestObject('Registration/select_Job Department'), 13)

WebUI.selectOptionByLabel(findTestObject('Registration/select_Country'), 'Philippines', false)

WebUI.setText(findTestObject('Registration/input_City _City'), 'Manila')

WebUI.click(findTestObject('Registration/span_Register your Account'))

WebUI.verifyElementVisible(findTestObject('Registration/div_Email Address Already Registered error'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

