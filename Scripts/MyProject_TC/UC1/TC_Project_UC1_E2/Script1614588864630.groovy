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

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Phone (3)'), '0611230387')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__FirstName (3)'), 'x')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__LastName (3)'), 'x')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Email (8)'), 'singtopza@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Password (3)'), 'N/iJEg636yU=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input_ A-Z a-z 0-9  5-30 _CPassword (3)'), 
    'N/iJEg636yU=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kunkai Book Shop/select_ () (3)'), 'ชาย', true)

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/input__acceptreg (3)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button_ (8)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button__1 (4)'))

WebUI.verifyTextPresent('สมัครสมาชิก', false)

WebUI.closeBrowser()

