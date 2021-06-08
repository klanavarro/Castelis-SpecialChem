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

'Open the browser and navigate the URL'
WebUI.openBrowser(GlobalVariable.adhesiveURL)

WebUI.maximizeWindow()

'Wait for the load to page'
WebUI.waitForPageLoad(5)

'Enter text in search field then submit'
WebUI.sendKeys(findTestObject('Search/Site Search/input_Keyword search_keyword'), Keys.chord('special', Keys.ENTER))

'Verify the element if visible in the page'
WebUI.verifyElementPresent(findTestObject('Search/Site Search/div_529_MatchProductSearch'), 5)

'Verify message after search in the page'
WebUI.verifyTextPresent('529 products match your search', false)

'Close the browser'
WebUI.closeBrowser()

