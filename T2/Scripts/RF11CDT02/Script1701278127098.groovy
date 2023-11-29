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

WebUI.click(findTestObject('Object Repository/CDT12 - CDT13/Page_PizzaWeb/a_Entrar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('LOGIN_DEFAULT'), [('usuario') : 'admin', ('senha') : 'admin'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT12 - CDT13/Page_PizzaWeb/a_Gerenciar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT12 - CDT13/Page_/a_Cadastro de pizzas com dois sabores'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT12 - CDT13/Page_/select_Papillon                 California _9c9891'), 
    '2', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT12 - CDT13/Page_/input_adicionarpedido'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Chocolate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String chocolate = WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Chocolate'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Calabresa'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String calabresa = WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Calabresa'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Mdia'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String tamanho = WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Mdia'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_R 15'), 0, FailureHandling.CONTINUE_ON_FAILURE)

String reais = WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_R 15'), 'value', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Deletar'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CDT12 - CDT13/Page_/a_Deletar'), FailureHandling.CONTINUE_ON_FAILURE)

if ((((chocolate != WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Chocolate'), 'value')) && 
(calabresa != WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Calabresa'), 'value'))) && (tamanho != 
WebUI.getAttribute(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Mdia'), 'value'))) && (reais != WebUI.getAttribute(
    findTestObject('Object Repository/CDT12 - CDT13/Page_/td_R 15'), 'value'))) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Chocolate'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Calabresa'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Mdia'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_R 15'), 1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_Deletar'), 1, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.verifyElementNotPresent(findTestObject('Object Repository/CDT12 - CDT13/Page_/td_R 15'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

