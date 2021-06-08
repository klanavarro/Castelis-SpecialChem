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

WebUI.openBrowser('https://coatings.uat.specialchem.com/tech-library/brochure/natural-silicate-high-performance-biocides-with-adins-protection')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Lead Generation/Tech Document/div_Download'))

WebUI.switchToFrame(findTestObject('Lead Generation/iframe_Contact_Request'), 2)

WebUI.click(findTestObject('Lead Generation/span_REGISTER (free)'))

WebUI.click(findTestObject('Lead Generation/Document TDS/span_NEXT'))

WebUI.verifyElementVisible(findTestObject('Lead Generation/Document TDS/div_Error message'))

