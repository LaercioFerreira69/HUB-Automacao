package br.com.rsi.hub3.TDD.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginAcesso_PO extends Base_PO{
	
	By acessarConta     = By.id("menuUserLink");
	By digitaUser		= By.name("username");
	By digitaPassword	= By.name("password");
	By confirmaLogin	= By.id("sign_in_btnundefined");
	By validaLogin		= By.className("hi-user containMiniTitle ng-binding");

	
	
	public void logarPage() throws InterruptedException {
		Thread.sleep(5000);
		if(isDisplayed(acessarConta)) {;
		click(acessarConta);
		type("Laercio_Test",digitaUser);
		Thread.sleep(2000);
		type("Testando@123",digitaPassword);
		click(confirmaLogin);
		}else {
			System.out.println("Elemento não encontrado!");
		}
		}
//	public boolean validaAcesso() {
//		return isDisplayed(validaLogin);
//		
//	}
	
	public boolean isDisplayed(By locator) {
		return true;
	}

	public loginAcesso_PO (WebDriver driver) {
		super(driver);		
}
}