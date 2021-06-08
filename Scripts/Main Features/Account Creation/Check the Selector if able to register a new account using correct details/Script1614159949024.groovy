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

Random rnd = new Random()

randomNumber = (0 + rnd.nextInt(9999))

WebUI.openBrowser(GlobalVariable.coatingsURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Account Creation/Selector Registration/a_Ingredients selector'))

WebUI.click(findTestObject('Account Creation/Selector Registration/strong_LUMIFLON LF200F'))

WebUI.click(findTestObject('Account Creation/Selector Registration/a_READ MORE_Lumiflon'))

WebUI.switchToFrame(findTestObject('Account Creation/Selector Registration/iframe_selection'), 3)

WebUI.click(findTestObject('Account Creation/Selector Registration/span_REGISTER (free)'))

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_First Name_firstname'), 'QA')

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Last Name_lastname'), 'Test')

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Professional_email'), ('qa.castelis.test' + String.valueOf(
        randomNumber)) + '@yopmail.com')

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Password_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Company_company'), 'Castelis')

WebUI.selectOptionByLabel(findTestObject('Account Creation/Selector Registration/select_Afghanistan                         _1506ee'), 
    'Philippines', true)

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_City_city'), 'Manila')

WebUI.selectOptionByIndex(findTestObject('Account Creation/Selector Registration/select_Additives, Ingredients, Raw Material_00aab6'), 
    19, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Account Creation/Selector Registration/select_RD - Basic Research                 _12afba'), 
    13, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Job Title_jobtitle'), 'QA')

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Phone Number_countryCode'), '+ 632')

WebUI.setText(findTestObject('Account Creation/Selector Registration/input_Phone Number_PhoneNumber'), '9123456789')

WebUI.click(findTestObject('Account Creation/Selector Registration/span_SEND'))

WebUI.click(findTestObject('Account Creation/Selector Registration/div_OK, I want to continue'))

WebUI.verifyElementVisible(findTestObject('Account Creation/Selector Registration/div_Please confirm your email              _9e762d'))

WebUI.closeBrowser()

