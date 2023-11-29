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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://localhost/pizzaWeb2.0/site/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT14 - CDT15/Page_PizzaWeb/a_Entrar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOGIN_DEFAULT'), [('usuario') : 'admin', ('senha') : 'admin'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT14 - CDT15/Page_PizzaWeb/a_Gerenciar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://localhost/pizzaWeb2.0/site/administrador.php', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT14 - CDT15/Page_/a_Gerenciar Restaurantes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT14 - CDT15/Page_/input_editar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT14 - CDT15/Page_/input_cidade'), 'Nova Friburgo', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CDT14 - CDT15/Page_/input_confirmarcadastro'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CDT14 - CDT15/Page_/div_Dados alterados com sucesso'), 'Dados alterados com sucesso!', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT14 - CDT15/Page_/button_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CDT14 - CDT15/Page_/td_localizacao'), 'Rua General Osório - no.10 - Centro - Nova Friburgo - RJ', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

