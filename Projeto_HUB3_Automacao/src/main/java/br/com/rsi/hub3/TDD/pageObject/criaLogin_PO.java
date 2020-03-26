package br.com.rsi.hub3.TDD.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class criaLogin_PO extends Base_PO{
	
			
	public criaLogin_PO(WebDriver driver) {
		super(driver);
		
	}
	By registrarUser    = By.id("menuUser");
	By criarConta       = By.xpath("//a[@class='create-new-account ng-scope']");
	By userName	        = By.name("usernameRegisterPage");
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
	By aceitaTermos		= By.name("i_agre");
	By registraCadastro	= By.id("register_btnundefined");
	By erroCadastro		= By.className("center block smollMargin invalid"); 
	
	public void criaLogin(WebDriver driver) {
		//super(driver);
	}
	public void registraUser() throws InterruptedException{
		click(registrarUser);
		Thread.sleep(2000);
		if(isDisplayed(criarConta )) {
			type("Laercio_Test2",userName);		
			type("laercio@Test.com",emailUser);	
			type("teste@123",passwordUser);
			type("teste@123",confirmaPassword);
			type("Laercio", primeiroNome);
			type("123", ultimoNome);
			type("970701234",foneUser);
			click(selecionaPais);
			Thread.sleep(10000);
			type("Brazil", selecionaPais);
			type(Keys.ENTER);
	}
	//public String registered
	{
		//Select combobox = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		//Thread.sleep(6000);
		//combobox.selectByVisibleText("Brazil");
	}
	}
	private void type(Keys enter) {
		
	}
}
