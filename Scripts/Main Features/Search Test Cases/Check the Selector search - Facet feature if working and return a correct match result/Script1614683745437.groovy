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

WebUI.openBrowser(GlobalVariable.cosmeticsURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Search/Selector - Facet/a_Ingredients (47739  found)'))

WebUI.switchToFrame(findTestObject('Lead Generation/iframe_Contact_Request'), 3)

WebUI.setText(findTestObject('Search/Selector - Facet/input_Quick Search_bw0 w100 pa7 a-quick-search'), 'dis')

WebUI.click(findTestObject('Search/Selector - Facet/div_Dispersants'))

WebUI.verifyElementVisible(findTestObject('Search/Selector - Facet/div_1 003                        products m_d87b6b'))

WebUI.closeBrowser()

