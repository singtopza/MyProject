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

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Phone (2)'), '0611123333')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__FirstName (2)'), 'xx')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__LastName (2)'), 'xx')

WebUI.setText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Email (7)'), 'x@x')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input__Password (2)'), 'F6+qwVGE4bg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kunkai Book Shop/input_ A-Z a-z 0-9  5-30 _CPassword (2)'), 
    'F6+qwVGE4bg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kunkai Book Shop/select_ () (2)'), 'ชาย', true)

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button_ (7)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button__1 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/button__1_2 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Kunkai Book Shop/td_'))

WebUI.verifyTextPresent('จำเป็นต้องยอมรับนโยบายและข้อตกลง ก่อนทำการสมัครสมาชิก', false)

WebUI.closeBrowser()

