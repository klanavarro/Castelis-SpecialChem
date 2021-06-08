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

'Navigate to URL'
WebUI.openBrowser(GlobalVariable.coatingsURL)

'Maximize browser window'
WebUI.maximizeWindow()

'Hover moust to News & Feeds Menu tab'
WebUI.mouseOver(findTestObject('Account Creation/Online Intro Registration/span_News  Feeds'))

WebUI.click(findTestObject('Object Repository/Account Creation/Online Intro Registration/a_Open Innovation Requests'))

WebUI.click(findTestObject('Object Repository/Account Creation/Online Intro Registration/span_Learn more'))

WebUI.verifyElementVisible(findTestObject('Account Creation/Online Intro Registration/div_Login                     Email address_658160'))

WebUI.click(findTestObject('Object Repository/Account Creation/Online Intro Registration/span_REGISTER (free)'))

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_1b3d98'), 
    'Test Fname')

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_70c37a'), 
    'Test LName')

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_16a72e'), 
    ('qa.castelis.test' + String.valueOf(randomNumber)) + '@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__countryCode'), '+ 326')

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__PhoneNumber'), '9123456789')

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_2fff3c'), 
    'QA', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Account Creation/Online Intro Registration/span_Next'), 0)

WebUI.click(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/span_Select an option_JobDept'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Account Creation/Online Intro Registration/li_RD - Product Development  Formulation'), 
    3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Account Creation/Online Intro Registration/li_RD - Product Development  Formulation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_0787a5'), 
    'Castelis')

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input__ctl06content_1bodycontent_1twoleftco_292489'), 
    'Manila')

WebUI.click(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/span_Select an option _country'))

WebUI.setText(findTestObject('Object Repository/Account Creation/Online Intro Registration/input'), 'ph')

WebUI.click(findTestObject('Object Repository/Account Creation/Online Intro Registration/li_Philippines'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/span_Select an option_activity'))

WebUI.click(findTestObject('Object Repository/Account Creation/Online Intro Registration/li_Adhesives  Sealants Formulation'))

WebUI.click(findTestObject('Object Repository/Account Creation/Online Intro Registration/span_Step 2 - Please answer some questions'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Next'))

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/input_Title of Your Proposal'), 
    'test')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/textarea__genDesc'), 
    'test')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/input__uniqueness'), 
    'test')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/input__maturity'), 
    'test')

WebUI.setText(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/textarea__relationship'), 
    'test')

WebUI.click(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/span_Select an option_hear'))

WebUI.waitForElementPresent(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/li_LinkedIn'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Account Creation/Online Intro Registration/Page_Antifingerprint Technology to Improve Appearance of Consumer Goods/li_LinkedIn'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_Send'))

WebUI.verifyElementVisible(findTestObject('Account Creation/div_Please confirm your email              _9e762d'))

WebUI.closeBrowser()

