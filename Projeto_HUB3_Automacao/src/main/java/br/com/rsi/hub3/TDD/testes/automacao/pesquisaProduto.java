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
import br.com.rsi.hub3.TDD.pageObject.Base_PO;
import br.com.rsi.hub3.TDD.pageObject.pesquisaProduto_PO;

 
public class pesquisaProduto extends pesquisaProduto_PO {

	
	public WebDriver chromeDriverConexao() {
		return null;
		
	}
	
	
	public void click() {
		driver.findElement("img").click();
	}
	
		
	
	}


