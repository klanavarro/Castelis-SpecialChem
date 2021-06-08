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

WebUI.openBrowser('https://omnexus.uat.specialchem.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Search/new/input_Property search_search-property-input w100'))

WebUI.switchToFrame(findTestObject('Lead Generation/iframe_Contact_Request'), 3)

WebUI.setText(findTestObject('Object Repository/Search/new/input_Quick Search_bw0 w100 pa7 a-quick-search'), 'dens')

WebUI.click(findTestObject('Object Repository/Search/new/div_Density'))

WebUI.click(findTestObject('Search/new/strong_Search'))

WebUI.click(findTestObject('Search/new/btn_Edit Search'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Search/new/select_gcm                                 _d53042'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Search/new/div_Property search_row  mb10'))

WebUI.clearText(findTestObject('Search/new/input_Property search_w100 prop-max'))

WebUI.setText(findTestObject('Object Repository/Search/new/input_Property search_w100 prop-max'), '100')

WebUI.click(findTestObject('Object Repository/Search/new/span_APPLY'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search/new/div_27                        products matc_473415'))

WebUI.click(findTestObject('Search/new/btn_Edit Search'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Search/new/select_gcm                                 _d53042'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Search/new/span_APPLY'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Search/new/div_214                        products mat_c6b238'))

WebUI.closeBrowser()

