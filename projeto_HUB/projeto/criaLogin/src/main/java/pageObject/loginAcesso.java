package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class loginAcesso {
	public loginAcesso (WebDriver driver) {
		//super(driver);
	}
	public loginAcesso logar(String userEmail, String userPassword) {
		realizaLogin(userEmail, userPassword);
		return new loginAcesso(getDriver());
	}
	private WebDriver getDriver() {
		return null;
	}
	private void realizaLogin(String userEmail, String userPassword) {
		getDriver().findElement(By.name("emailRegisterPage")).sendKeys(userEmail);
		getDriver().findElement(By.name("passwordRegisterPage")).sendKeys(userPassword);
		
	}
}