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

WebUI.click(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_PizzaWeb/a_Cadastre-se'), FailureHandling.CONTINUE_ON_FAILURE)

//RF2CDT01 - Realização de cadastro com campos obrigatórios faltantes
WebUI.callTestCase(findTestCase('CDT03 - cadastro simples'), [('nome') : 'teste', ('email') : '', ('ddd') : '11'
	, ('telefone') : '222222222', ('usuario') : '', ('senha') : 'teste', ('repetir_senha') : 'teste', ('rua') : 'rua '
	, ('numero') : '200', ('bairro') : 'bairro', ('complemento') : 'complemento', ('cidade') : 'Rio de Janeiro', ('uf') : 'MG'],
FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/button_Cadastrar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cadastro', false, FailureHandling.CONTINUE_ON_FAILURE)

//RF2CDT03 - Realização de cadastro com nome de usuário reservado
WebUI.callTestCase(findTestCase('CDT03 - cadastro simples'), [('nome') : 'teste', ('email') : 'email@email.com', ('ddd') : '11'
	, ('telefone') : '222222222', ('usuario') : 'admin', ('senha') : 'teste', ('repetir_senha') : 'teste', ('rua') : 'rua '
	, ('numero') : '200', ('bairro') : 'bairro', ('complemento') : 'complemento', ('cidade') : 'Rio de Janeiro', ('uf') : 'MG'],
FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/button_Cadastrar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Nome de usuário reservado!', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/button_OK'), FailureHandling.CONTINUE_ON_FAILURE)

//RF2CDT02 - Realização de cadastro com senhas não coincidentes
WebUI.callTestCase(findTestCase('CDT03 - cadastro simples'), [('nome') : 'teste', ('email') : 'teste@gmail.com', ('ddd') : '11'
	, ('telefone') : '222222222', ('usuario') : 'teste', ('senha') : 'teste', ('repetir_senha') : 'diferente', ('rua') : 'rua '
	, ('numero') : '200', ('bairro') : 'bairro', ('complemento') : 'complemento', ('cidade') : 'Rio de Janeiro', ('uf') : 'MG'],
FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/button_Cadastrar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cadastro', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)
