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

'Navigate to URL'
WebUI.openBrowser(GlobalVariable.coatingsURL)

'Maximize browser window'
WebUI.maximizeWindow()

'Hover moust to News & Feeds Menu tab'
WebUI.mouseOver(findTestObject('Account Creation/Online Intro Registration/span_News  Feeds'))

'Click Open Innovation Requests link'
WebUI.click(findTestObject('Account Creation/Online Intro Registration/a_Open Innovation Requests'))

'Click Learn more'
WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Learn more'))

WebUI.verifyElementVisible(findTestObject('Account Creation/Online Intro Registration/div_Login                     Email address_658160'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_REGISTER (free)'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Next'))

WebUI.verifyElementVisible(findTestObject('Account Creation/div_Request online error message'))

WebUI.closeBrowser()

