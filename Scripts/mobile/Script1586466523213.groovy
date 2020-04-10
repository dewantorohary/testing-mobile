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

Mobile.startApplication('C:\\Users\\SETO\\Katalon Studio\\Testingmobileapps\\androidapp\\APIDemos.apk', true)

Mobile.pressBack()

Mobile.tap(findTestObject('android.widget.TextView0 - My Home Credit Indonesia'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - DAFTAR'), 0)

Mobile.scrollToText('(021) 29539600')

Mobile.tap(findTestObject('android.widget.TextView0 - Saya Setuju'), 0)

Mobile.tap(findTestObject('android.widget.Spinner0 - 10'), 0)

Mobile.scrollToText('30')

Mobile.tap(findTestObject('android.widget.CheckedTextView0 - 30'), 0)

Mobile.tap(findTestObject('android.widget.Spinner0 - April'), 0)

Mobile.tap(findTestObject('android.widget.CheckedTextView0 - Agustus'), 0)

Mobile.tap(findTestObject('android.widget.Spinner0 - 2020'), 0)

Mobile.scrollToText('1992')

Mobile.tap(findTestObject('android.widget.CheckedTextView0 - 1992'), 0)

Mobile.setText(findTestObject('android.widget.EditText0'), '8972648131', 0)

Mobile.setEncryptedText(findTestObject('android.widget.EditText0 (1)'), 'XCmGU2TIFGk=', 0)

Mobile.setEncryptedText(findTestObject('android.widget.EditText0 (2)'), 'XCmGU2TIFGk=', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Lanjutkan'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Lanjutkan (1)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 (3)'), '7', 0)

Mobile.setText(findTestObject('android.widget.EditText0 (4)'), '2', 0)

Mobile.setText(findTestObject('android.widget.EditText0 (5)'), '5', 0)

Mobile.setText(findTestObject('android.widget.EditText0 (6)'), '9', 0)

Mobile.setText(findTestObject('android.widget.EditText0 (7)'), '0', 0)

Mobile.setText(findTestObject('android.widget.EditText0 (8)'), '7', 0)

Mobile.tap(findTestObject('android.widget.Button0 - Daftar'), 0)

Mobile.closeApplication()

