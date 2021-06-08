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

'Hover to News & Feed Menu Tab'
WebUI.mouseOver(findTestObject('Account Creation/Channel Registration/span_News  Feeds'))

'Click a channel'
WebUI.click(findTestObject('Account Creation/Channel Registration/img'))

'Click [Subscribe to this Channel] button'
WebUI.click(findTestObject('Account Creation/Channel Registration/span_Subscribe to this channel'))

'Click [Register] button'
WebUI.click(findTestObject('Account Creation/span_REGISTER'))

'Click [Submit] button'
WebUI.click(findTestObject('Account Creation/Channel Registration/span_Submit'))

'Verify that an error message will be displayed when no detailed entered'
WebUI.verifyElementVisible(findTestObject('Account Creation/div_Error message'))

'Close browser'
WebUI.closeBrowser()

