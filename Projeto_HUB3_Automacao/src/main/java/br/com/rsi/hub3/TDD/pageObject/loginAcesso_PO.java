package br.com.rsi.hub3.TDD.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class loginAcesso_PO {
	public loginAcesso_PO (WebDriver driver) {
		//super(driver);
	}
	public loginAcesso_PO logar(String userEmail, String userPassword) {
		realizaLogin(userEmail, userPassword);
		return new loginAcesso_PO(getDriver());
	}
	private WebDriver getDriver() {
		return null;
	}
	private void realizaLogin(String userEmail, String userPassword) {
		getDriver().findElement(By.name("emailRegisterPage")).sendKeys(userEmail);
		getDriver().findElement(By.name("passwordRegisterPage")).sendKeys(userPassword);
		
	}
}