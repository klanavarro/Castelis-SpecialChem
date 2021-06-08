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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://coatings.uat.specialchem.com/')

WebUI.click(findTestObject('Object Repository/test/a_Webinars and Videos'))

WebUI.click(findTestObject('Object Repository/test/p_Improving your formulations and savings w_e3155b'))

WebUI.click(findTestObject('Object Repository/test/strong_REGISTER (free)'))

WebUI.setText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_87dccc'), 'qa')

WebUI.setText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_20e04c'), 'test')

WebUI.setText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_ac05f3'), 'test@castelis.com')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_d4562e'), '4nvbrPglk7k=')

WebUI.setText(findTestObject('Object Repository/test/input__PhoneNumber'), '12345678')

WebUI.setText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_2303db'), 'qa')

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_RD - Basic ResearchRD - Design  Engi_882edc'), '{FAAC5C94-96DD-4217-9516-837C489A4997}', 
    true)

WebUI.setText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_48c68d'), 'asdfa')

WebUI.setText(findTestObject('Object Repository/test/input__ctl06content_1bodycontent_1twoleftco_426b24'), 'afas')

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_AfghanistanAland IslandsAlbaniaAlger_e0c357'), '{C42797E7-D337-49FB-B72D-C9172D8DB332}', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_AfghanistanAland IslandsAlbaniaAlger_e0c357'), '{21D85047-947A-48CD-A92D-E25637EA81B1}', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_Additives, Ingredients, Raw Material_dafc0c'), '{4FCE3CDF-5BFE-49CB-AF5D-0E2B6FBF8D07}', 
    true)

WebUI.click(findTestObject('Object Repository/test/a_Next'))

WebUI.click(findTestObject('Object Repository/test/span_Next'))

WebUI.click(findTestObject('Object Repository/test/strong_I agree to share my details with sup_a9b2b0'))

