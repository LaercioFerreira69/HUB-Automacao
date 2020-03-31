package br.com.rsi.hub3.TDD.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.util.List;

public class Base_PO{
	
	private WebDriver driver;
	
	public Base_PO(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver chromeDriverConexao() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/#/");
		return driver;
	}
	public WebElement findElement(By locator){
		return driver.findElement(locator);
	}
	public List<WebElement> findElements(By locator){
		return (List<WebElement>) driver.findElements(locator);
	}
	public String getText(WebElement element) {
		return element.getText();		
	}
	public String getText(By locator) {
		return driver.findElement(locator).getText();		
	}
	public void type(String inputText, By locator){
		driver.findElement(locator).sendKeys(inputText);
	}
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public void site(String url) {
		driver.get(url);
	}
	}


	
