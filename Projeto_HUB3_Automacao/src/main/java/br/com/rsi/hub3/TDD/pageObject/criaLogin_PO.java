package br.com.rsi.hub3.TDD.pageObject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class criaLogin_PO extends Base_PO{
			
		
	
//	By registrarUser    = By.id("menuUser");
	By acessarConta     = By.id("menuUserLink");
//	By acessarConta		=By.xpath("//a[@id='menuUserLink']");	
//	By criarConta       = By.className("create-new-account ng-scope]");
//	By userName	        = By.name("usernameRegisterPage");
	By criarConta		=By.xpath("//a[contains(.,'CREATE NEW ACCOUNT')]");
	By userName		  	=By.xpath("//input[@name='usernameRegisterPage']");
	By emailUser		= By.name("emailRegisterPage");	
	By passwordUser		= By.name("passwordRegisterPage");	
	By confirmaPassword	= By.name("confirm_passwordRegisterPage");	
	By primeiroNome		= By.name("first_nameRegisterPage");
	By ultimoNome		= By.name("last_nameRegisterPage");
	By foneUser			= By.name("phone_numberRegisterPage");
	By selecionaPais	= By.name("countryListboxRegisterPage");
	By digitaCidade		= By.name("cityRegisterPage");
	By digitaEndereco	= By.name("addressRegisterPage");
	By digitaEstado		= By.name("state_/_province_/_regionRegisterPage");
	By digitaCep		= By.name("postal_codeRegisterPage");
//	By aceitaTermos		= By.name("i_agre");
	By aceitaTermos		= By.xpath("//input[@name='i_agree']");
	By registraCadastro	= By.id("register_btnundefined");
	By erroCadastro		= By.className("center block smollMargin invalid"); 	
	
		
	public criaLogin_PO(WebDriver driver) {
		super(driver);
	}
	public void registraUser() throws Exception{
		
			ewait(acessarConta); //ewait é o metodo de espera wait;
			click(acessarConta);
//			Thread.sleep(5000);
			Thread.sleep(5000);
//			ewait(criarConta);
			click(criarConta);
			type("Laercio_Test2.0",userName);		
			type("laercio@Test.com",emailUser);	
			type("Teste@123",passwordUser);
			type("Teste@123",confirmaPassword);
			type("Laercio", primeiroNome);
			type("123", ultimoNome);
			type("970701234",foneUser);
			click(selecionaPais);
//			ewait(selecionaPais);
			type("Brazil", selecionaPais);
			type("Osasco", digitaCidade);
			type("Rua Sem Numero, s/n", digitaEndereco);
			type("São Paulo", digitaEstado);
			type("00000-666", digitaCep);
//			ewait(aceitaTermos);
			click(aceitaTermos);
			click(registraCadastro);
			
			assertTrue(driver.findElement(registraCadastro).isDisplayed());
			
			
			
				
			
			
	}
	public void registraUserNegativo () throws InterruptedException{
		Thread.sleep(5000);
//		click(registrarUser);
		Thread.sleep(5000);
		click(criarConta );
		Thread.sleep(3000);
		type("Laercio_maisde15caracteres",userName);		
		type("laercio@Test.com",emailUser);	
		type("Teste@123",passwordUser);
		type("Teste@123",confirmaPassword);
		type("Laercio", primeiroNome);
		type("123", ultimoNome);
		type("970701234",foneUser);
		click(selecionaPais);
		Thread.sleep(2000);
		type("Brazil", selecionaPais);
		type("Osasco", digitaCidade);
		type("Rua Sem Numero, s/n", digitaEndereco);
		type("São Paulo", digitaEstado);
		type("00000-666", digitaCep);
		Thread.sleep(2000);
		click(aceitaTermos);
		click(registraCadastro);
	
		
	}
}

		
		
	

