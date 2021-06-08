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

WebUI.openBrowser('http://cosmetics.uat.specialchem.com/product/i-dksh-aa2g-dksh')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Lead Generation/Sample a Request/a_SAMPLE A REQUEST'))

WebUI.switchToFrame(findTestObject('Lead Generation/iframe_Contact_Request'), 2)

WebUI.click(findTestObject('Lead Generation/span_REGISTER (free)'))

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_First Name'), 'QA')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_Last Name'), 'Test')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_Email'), ('qa.castelis.test' + String.valueOf(
        randomNumber)) + '@yopmail.com')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input_content_0form_Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input_Phone Number_countryCode'), '+ 632')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input_Phone Number_PhoneNumber'), '9123456789')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_Company'), 'Castelis')

WebUI.selectOptionByIndex(findTestObject('Lead Generation/Sample a Request/drop_Down_Company_Activity'), 19, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Lead Generation/Sample a Request/drop_Down_Job_Department'), 13, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_Delivery Address'), 'Manila')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_Delivery Zip Code'), '1111')

WebUI.setText(findTestObject('Lead Generation/Sample a Request/input__content_0form_Delivery City'), 'Manila')

WebUI.selectOptionByLabel(findTestObject('Lead Generation/Sample a Request/drop_Down_Delivery Country'), 'Philippines', 
    true)

WebUI.click(findTestObject('Lead Generation/Sample a Request/span_Next'))

WebUI.click(findTestObject('Lead Generation/Sample a Request/span_Next2'))

WebUI.verifyElementVisible(findTestObject('Lead Generation/Contact Supplier/div_Error message2'))

WebUI.closeBrowser()

