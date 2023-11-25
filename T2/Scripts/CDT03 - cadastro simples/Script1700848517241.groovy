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

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Nome_nomeCadastro'), nome)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_E-mail_emailCadastro'), email)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_DDD_dddTelCadastro'), ddd)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Telefone_telCadastro'), telefone)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Usurio_loginCadastro'), usuario)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Senha_senhaCadastro'), senha)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Repetir a senha_form-control'), repetir_senha)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_RuaAv_ruaCadastro'), rua)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Nmero_numeroCadastro'), numero)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Bairro_bairroCadastro'), bairro)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Complemento_complementoCadastro'), complemento)

WebUI.setText(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/input_Cidade_cidadeCadastro'), cidade)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDT03 - CDT04 - CDT05/Page_/select_ALAPAMBACEDFESGOMAMTMSMGPAPBPRPEPIRR_4d941d'), 
    uf, true)

