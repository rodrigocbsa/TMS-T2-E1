import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://localhost/pizzaWeb2.0/site/index.php')

WebUI.click(findTestObject('Object Repository/CDT01 - CDT02/Page_PizzaWeb/a_Entrar'))

//WebUI.setText(findTestObject('Object Repository/CDT01 - CDT02/Page_Login/input_Entrar_login'), 'marco')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/CDT01 - CDT02/Page_Login/input_Entrar_senha'), 'D3DFnBrUPGw=')
//
//WebUI.click(findTestObject('Object Repository/CDT01 - CDT02/Page_Login/button_Login'))

WebUI.callTestCase(findTestCase('CDT02 - login cliente - login simple'), [('usuario') : 'marco', ('senha') : 'senhaInvalida'], FailureHandling.STOP_ON_FAILURE)


WebUI.verifyElementText(findTestObject('CDT01 - CDT02/Page_/div_msg_Usurio_ou_senha_invalidos'), 'Usuário ou senha inválidos.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT01 - CDT02/Page_/button_OK'))

WebUI.callTestCase(findTestCase('CDT02 - login cliente - login simple'), [('usuario') : 'marco', ('senha') : 'marco'], FailureHandling.STOP_ON_FAILURE)

//WebUI.setText(findTestObject('Object Repository/CDT01 - CDT02/Page_Login/input_Entrar_login'), 'marco')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/CDT01 - CDT02/Page_Login/input_Entrar_senha'), 'ieTQUubc1mI=')
//
//WebUI.click(findTestObject('Object Repository/CDT01 - CDT02/Page_Login/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/CDT01 - CDT02/Page_PizzaWeb/a_Ol, Usuario'), 'Olá, Marco!')

WebUI.closeBrowser()

