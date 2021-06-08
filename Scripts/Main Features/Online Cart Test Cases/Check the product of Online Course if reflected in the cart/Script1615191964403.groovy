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

WebUI.openBrowser('https://cosmetics.uat.specialchem.com/online-courses')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Online Cart/a_Add To Cart2'))

WebUI.click(findTestObject('Online Cart/a_Proceed to checkout'))

WebUI.setText(findTestObject('Online Cart/input_Enter your email_ctl06content_0bodyco_ef079d'), GlobalVariable.username0)

WebUI.setText(findTestObject('Online Cart/input_Password_ctl06content_0bodycontent_1t_3cd69d'), GlobalVariable.password)

WebUI.click(findTestObject('Online Cart/a_Submit'))

WebUI.setText(findTestObject('Online Cart/input_Address _ctl06content_0bodycontent_1t_3151fb'), 'Manila')

WebUI.setText(findTestObject('Online Cart/input_Zip Code _ctl06content_0bodycontent_1_114da0'), '123')

WebUI.click(findTestObject('Online Cart/a_Proceed to checkout (1)'))

WebUI.verifyElementVisible(findTestObject('Online Cart/div_Verify Product in Cart'))

WebUI.closeBrowser()

