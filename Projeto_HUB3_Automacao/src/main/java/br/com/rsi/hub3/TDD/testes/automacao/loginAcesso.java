package br.com.rsi.hub3.TDD.testes.automacao;




import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 
public class loginAcesso {
	
	
	@Test
	public void loginAcesso() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.name("username")).sendKeys("Laercio_Test");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Testando@123");
		driver.findElement(By.id("sign_in_btnundefined")).click();
		
	}
}