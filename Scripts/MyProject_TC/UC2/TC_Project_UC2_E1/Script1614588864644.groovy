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

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/a__loginbtn btn'))

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Email (4)'), 'cyberlab24244@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input_ _Password (4)'), 'Gdm7Rxw13fk=')

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button_ (4)'))

WebUI.verifyTextPresent('เข้าสู่ระบบ', false)

WebUI.closeBrowser()

