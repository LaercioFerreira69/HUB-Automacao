package br.com.rsi.hub3.TDD.pageObject;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.joda.time.Seconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginAcesso_PO extends Base_PO{
	
	By acessarConta     = By.id("menuUserLink");
	By digitaUser		= By.name("username");
	By digitaPassword	= By.name("password");
	By confirmaLogin	= By.id("sign_in_btnundefined");
	By validaLogin		= By.className("hi-user containMiniTitle ng-binding");
	
	public void logarPage() throws InterruptedException {
		ewait(acessarConta);
		click(acessarConta);
		type("Laercio_Test",digitaUser);
		type("Testando@123",digitaPassword);
		ewait(confirmaLogin);
		click(confirmaLogin);		
		
//			assertEquals("Advantage Shopping", ());
		
		}
		
	public void logarPageNegativo() throws Exception {
		ewait(acessarConta);
		click(acessarConta);
		type("Laercio_Negativo",digitaUser);//Mais de 15 caracteres, que é o maximo permitido!
		type("Testando@123",digitaPassword);
		ewait(confirmaLogin);
		click(confirmaLogin);
		
		}
			
	
	public loginAcesso_PO(WebDriver driver) {
		super(driver);		
}
}