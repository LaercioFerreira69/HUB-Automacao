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

 
public class procuraLupa {
	
	
	@Test
	public void procuraLupa() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.advantageonlineshopping.com/#/");
	driver.manage().window().maximize();
	driver.findElement(By.id("menuSearch")).click();
	driver.findElement(By.id("autoComplete")).sendKeys("headphones");
	
	}

	
}


