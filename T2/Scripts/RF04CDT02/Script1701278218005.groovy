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

WebUI.navigateToUrl('http://localhost/pizzaWeb2.0/site/index.php', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT08 - CDT09/Page_PizzaWeb/a_Entrar (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOGIN_DEFAULT'), [('usuario') : 'admin', ('senha') : 'admin'], FailureHandling.CONTINUE_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/CDT08 - CDT09/Page_PizzaWeb/a_Gerenciar (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT08 - CDT09/Page_/a_Cadastro de Restaurantes (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Nome_nomeCadastro'), 'novo', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_RuaAv_ruaCadastro (1)'), 'rua', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Nmero_numeroCadastro (1)'), '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Complemento_complementoCadastro (1)'), 'com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Bairro_bairroCadastro (1)'), 'bairro', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Cidade_cidadeCadastro (1)'), 'Minas Gerais', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT08 - CDT09/Page_/select_ALAPAMBACEDFESGOMAMTMSMGPAPBPRPEPIRR_4d941d (1)'), 
    'AL', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT08 - CDT09/Page_/select_ALAPAMBACEDFESGOMAMTMSMGPAPBPRPEPIRR_4d941d (1)'), 
    'MG', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Telefone_dddTelCadastro (1)'), '00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Telefone_telCadastro (1)'), '22222222', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Horrio de Funcionamento_horaInicio (1)'), '12:00:00', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_Horrio de Funcionamento_horaFim (1)'), '22:00:00', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT08 - CDT09/Page_/select_SegundaTeraQuartaQuintaSextaSbadoDomingo (1)'), 
    '1', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT08 - CDT09/Page_/select_SegundaTeraQuartaQuintaSextaSbadoDomingo (1)'), 
    '2', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT08 - CDT09/Page_/select_SegundaTeraQuartaQuintaSextaSbadoDomingo_1'), 
    '7', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT08 - CDT09/Page_/input_submit (1)'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT08 - CDT09/Page_/a_Gerenciar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT08 - CDT09/Page_/a_Gerenciar Restaurantes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('novo', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

