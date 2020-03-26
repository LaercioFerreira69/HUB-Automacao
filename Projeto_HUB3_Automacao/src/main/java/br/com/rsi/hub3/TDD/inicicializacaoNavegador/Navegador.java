package br.com.rsi.hub3.TDD.inicicializacaoNavegador;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {
	
	public void iniciaNavegador(ChromeDriver driver) {

	System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	String url = "https://www.advantageonlineshopping.com/#/";
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	public void findElement(By locator) {
		
	 
		
	}
}