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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Random rnd = new Random()

randomNumber = (0 + rnd.nextInt(9999))

'Navigate to URL'
WebUI.openBrowser(GlobalVariable.adhesiveURL)

'Maximize browser'
WebUI.maximizeWindow()

'Click [Subscribe to Newsletter] button'
WebUI.click(findTestObject('Subscribe Unsubscribe/a_Subscribe to Newsletters'))

'Click [Register] button'
WebUI.click(findTestObject('Account Creation/span_REGISTER'))

'Input valid Professional e-mail'
WebUI.setText(findTestObject('Account Creation/Newsletter registration/input_Professional_ctl06content_1bodyconten_876c3a'), 
    ('qa.castelis.test' + String.valueOf(randomNumber)) + '@yopmail.com')

'Input valid password'
WebUI.setText(findTestObject('Account Creation/Newsletter registration/input_Choose a password _ctl06content_1body_c5f3e5'), 
    GlobalVariable.password)

'Input First Name'
WebUI.setText(findTestObject('Account Creation/Newsletter registration/input_First Name _ctl06content_1bodycontent_69f15e'), 
    'QA')

'Input Last Name'
WebUI.setText(findTestObject('Account Creation/Newsletter registration/input_Last Name _ctl06content_1bodycontent__70951b'), 
    'Test')

'Input Company'
WebUI.setText(findTestObject('Account Creation/Newsletter registration/input_Company _ctl06content_1bodycontent_2t_76e8ad'), 
    'Castelis')

'Input City'
WebUI.setText(findTestObject('Account Creation/Newsletter registration/input_City _ctl06content_1bodycontent_2twol_8ccd98'), 
    'Manila')

'Select Country from the dropdown box'
WebUI.selectOptionByLabel(findTestObject('Account Creation/Newsletter registration/select_AfghanistanAland IslandsAlbaniaAlger_e0c357'), 
    'Philippines', true)

'Select Company Activity from the dropdown box'
WebUI.selectOptionByIndex(findTestObject('Account Creation/Newsletter Registration/select_Additives, Ingredients, Raw Material_dafc0c'), 
    19, FailureHandling.STOP_ON_FAILURE)

'Select Job Department from the dropdown box'
WebUI.selectOptionByIndex(findTestObject('Account Creation/Newsletter Registration/select_RD - Basic ResearchRD - Design  Engi_882edc'), 
    13, FailureHandling.STOP_ON_FAILURE)

'Click [Confirm Subscription to Newsletters] button'
WebUI.click(findTestObject('Account Creation/Newsletter registration/span_Confirm Subscription to Newsletters'))

WebUI.verifyElementVisible(findTestObject('Account Creation/div_Please confirm your email              _9e762d'))

WebUI.closeBrowser()

