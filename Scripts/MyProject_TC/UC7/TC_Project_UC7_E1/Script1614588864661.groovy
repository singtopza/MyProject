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

WebUI.navigateToUrl('http://www.kunkaibookshop.lnw.mn/')

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/span__navbar-toggler-icon (1)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/a_ (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__FirstName (4)'), 'x')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__LastName (4)'), 'x')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Email (9)'), '')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Subject'), 'x')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/textarea__Message'), 'x')

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/input__btnsubmit'))

WebUI.verifyTextPresent('ติดต่อเรา', false)

WebUI.closeBrowser()
