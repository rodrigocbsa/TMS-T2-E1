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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/pizzaWeb2.0/site/index.php')

WebUI.click(findTestObject('Object Repository/CDT10/Page_PizzaWeb/a_Entrar'))

WebUI.callTestCase(findTestCase('CDT02 - login simple'), [('usuario') : 'admin', ('senha') : 'admin'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT10/Page_PizzaWeb/a_Gerenciar'))

WebUI.click(findTestObject('Object Repository/CDT10/Page_/a_Cadastro de Categorias de Pratos'))

WebUI.setText(findTestObject('Object Repository/CDT10/Page_/input_Nome da Categoria_nomeCategoria'), 'Massas')

WebUI.click(findTestObject('Object Repository/CDT10/Page_/input_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/CDT10/Page_/div_Cadastrado com Sucesso'), 'Cadastrado com Sucesso!')

WebUI.click(findTestObject('Object Repository/CDT10/Page_/button_OK'))

WebUI.closeBrowser()
