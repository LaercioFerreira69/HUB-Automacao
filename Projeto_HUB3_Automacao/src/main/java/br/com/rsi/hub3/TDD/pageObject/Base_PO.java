package br.com.rsi.hub3.TDD.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.tools.javac.util.List;

public class Base_PO{
	private WebDriver driver;
	
	public Base_PO(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver chromeDriverConexao() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
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
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;			
		}
	}
	public void site(String url) {
		driver.get(url);
	}
	}
	
