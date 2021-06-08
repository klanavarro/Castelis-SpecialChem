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

WebUI.mouseOver(findTestObject('Account Creation/Online Intro Registration/span_News  Feeds'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/a_Open Innovation Requests'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Learn more'))

WebUI.verifyElementVisible(findTestObject('Account Creation/Online Intro Registration/div_Login                     Email address_658160'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_REGISTER (free)'))

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_5d163d'), 
    'QA')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_c36dd8'), 
    'Test')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_d0c488'), 
    ('qa.castelis.test' + String.valueOf(randomNumber)) + '@yopmail.com')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__countryCode'), '+ 632')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__PhoneNumber'), '9123456789')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_085b88'), 
    'QA')

WebUI.click(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/Job Department span_Select an option'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_54bfe8'), 
    'Castelis')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_da6d87'), 
    'Manila')

WebUI.selectOptionByLabel(findTestObject('Account Creation/Online Intro Registration/select_AfghanistanAland IslandsAlbaniaAlger_e0c357'), 
    'Philippines', true)

WebUI.selectOptionByIndex(findTestObject('Account Creation/Online Intro Registration/select_Additives, Ingredients, Raw Material_dafc0c'), 
    19, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Next'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Send'))

WebUI.verifyElementVisible(findTestObject('Account Creation/div_Request online error message'))

WebUI.closeBrowser()

