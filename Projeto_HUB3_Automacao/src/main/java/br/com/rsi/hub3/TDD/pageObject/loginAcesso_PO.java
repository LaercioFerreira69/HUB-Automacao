package br.com.rsi.hub3.TDD.pageObject;

import java.util.concurrent.TimeUnit;

import org.joda.time.Seconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class loginAcesso_PO extends Base_PO{
	
	By acessarConta     = By.id("menuUserLink");
	By digitaUser		= By.name("username");
	By digitaPassword	= By.name("password");
	By confirmaLogin	= By.id("sign_in_btnundefined");
	By validaLogin		= By.className("hi-user containMiniTitle ng-binding");
	
//	public void Webdriver wait() {
//		FluentWait wait = new FluentWait<T>(T);
//	}

	public void logarPage() throws InterruptedException {
		Thread.sleep(5000);
		click(acessarConta);
		type("Laercio_Test",digitaUser);
		Thread.sleep(2000);
		type("Testando@123",digitaPassword);
		click(confirmaLogin);
		
		}
		
	public void logarPageNegativo() throws Exception {
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click(acessarConta);
		type("Laercio_Negativo",digitaUser);//Mais de 15 caracteres, que é o maximo permitido!
		Thread.sleep(2000);
		type("Testando@123",digitaPassword);
		click(confirmaLogin);
		
		}
		
		
	
	public loginAcesso_PO(WebDriver driver) {
		super(driver);		
}
}