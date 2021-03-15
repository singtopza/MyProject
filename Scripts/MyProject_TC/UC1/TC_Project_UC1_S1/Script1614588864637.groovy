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

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/a__regbtn btn'))

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Phone (1)'), '0611230387')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kunkai Book Shop/select_ () (1)'), 'ชาย', true)

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__FirstName (1)'), 'หอย')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__LastName (1)'), 'หลอด')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Email (6)'), 'x@e4')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Password (1)'), 'FdO0uRdxX7w=')

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/center_ A-Z a-z 0-9  5-30                  _0c42de (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Password (1)'), 'N/iJEg636yU=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input_ A-Z a-z 0-9  5-30 _CPassword (1)'), 
    'N/iJEg636yU=')

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/input__acceptreg (1)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button_ (6)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button__1 (2)'))

WebUI.verifyTextPresent('เข้าสู่ระบบ', false)

WebUI.closeBrowser()

