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

Random rnd = new Random()

randomNumber = (0 + rnd.nextInt(9999))

WebUI.openBrowser('https://coatings.uat.specialchem.com/tech-library/brochure/natural-silicate-high-performance-biocides-with-adins-protection')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Lead Generation/Tech Document/div_Download'))

WebUI.switchToFrame(findTestObject('Lead Generation/iframe_Contact_Request'), 2)

WebUI.click(findTestObject('Lead Generation/span_REGISTER (free)'))

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_First Name_firstname'), 'QA')

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Last Name_lastname'), 'Test')

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Professional_email'), ('qa.castelis.test' + String.valueOf(
        randomNumber)) + '@yopmail.com')

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Password_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Company_company'), 'Castelis')

WebUI.selectOptionByLabel(findTestObject('Lead Generation/Document TDS/drop_Down_Country'), 'Philippines', false)

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_City_city'), 'Manila', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Lead Generation/Document TDS/drop_Down_Company Activity'), 19, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Lead Generation/Document TDS/drop_Down_Job Department'), 13, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Job Title_jobtitle'), 'QA')

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Phone Number_countryCode'), '+ 632')

WebUI.setText(findTestObject('Lead Generation/Document TDS/input_Phone Number_PhoneNumber'), '9123456789')

WebUI.click(findTestObject('Lead Generation/Document TDS/span_NEXT'))

WebUI.delay(3)

WebUI.click(findTestObject('Lead Generation/Document TDS/div_OK, I want to continue'))

WebUI.verifyElementVisible(findTestObject('Lead Generation/Original TDS/div_Please confirm your email'))

WebUI.closeBrowser()

