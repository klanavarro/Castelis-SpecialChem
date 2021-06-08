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

WebUI.openBrowser(GlobalVariable.polymerAdditives)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Login/a_Login  Register'))

WebUI.click(findTestObject('Object Repository/Forget Password/a_Forgot password'))

WebUI.setText(findTestObject('Object Repository/Forget Password/input_Your Email_ctl06content_1bodycontent__b805cb'), GlobalVariable.username0)

WebUI.click(findTestObject('Object Repository/Forget Password/span_Send'))

WebUI.verifyElementVisible(findTestObject('Forget Password/span_A link to reset your password has been sent to your email account'))

WebUI.openBrowser(GlobalVariable.forgetPasswordPolymerAdditivesURL)

WebUI.setText(findTestObject('Forget Password/input_Your new Password_ctl06content_1bodycontent_1twoleftcol_1txtNewPassword'), 
    GlobalVariable.password)

WebUI.setText(findTestObject('Forget Password/input_Repeat password_ctl06content_1bodycontent_1twoleftcol_1txtVerifNewPassword'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Forget Password/a_Send_2'))

WebUI.verifyElementVisible(findTestObject('Forget Password/span_Your password has been changed successfully'))

WebUI.closeBrowser()

