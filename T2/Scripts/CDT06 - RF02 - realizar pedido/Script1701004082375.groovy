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

//Preparação para o teste
WebUI.openBrowser('http://localhost/pizzaWeb2.0/site/index.php', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/a_Entrar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDT02 - login simple'), [('usuario') : 'admin', ('senha') : 'admin'], FailureHandling.CONTINUE_ON_FAILURE)

//RF2CDT01 - Escolher pedido com remoção de item e verificação de valor correto
WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/a_California'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/input_Mdia_tamanhos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/input_Mdia_tamanhos_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/input_Mdia_tamanhos_1_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/input_R 4,00_enviar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/b_R 37,00'), 'R$ 37,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/a_Remover Item'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/td_Calabresa  Mdia'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/b_R 27,00'), 'R$ 27,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_PizzaWeb/a_Confirmar Pedido'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CDT06 - CDT07/Page_/input_finalizar_pedido'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_/input_R 0,00_btn btn-outline-success'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CDT06 - CDT07/Page_/h2_R 27,00'), 'R$ 27,00', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CDT06 - CDT07/Page_/input_CartoDinheiro na entrega_btn btn-success'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/CDT06 - CDT07/Page_/div_Pedido realizado com Sucesso'), 'Pedido realizado com Sucesso!', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT06 - CDT07/Page_/button_OK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

