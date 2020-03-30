package br.com.rsi.hub3.TDD.testes.automacao;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.rsi.hub3.TDD.pageObject.loginAcesso_PO;
import br.com.rsi.hub3.TDD.pageObject.*;


public class Login_Test {
	
	private WebDriver driver;
	loginAcesso_PO loginAcesso;

		

	@Before
	public void setUp() throws Exception {
		loginAcesso = new loginAcesso_PO(driver);
		driver = loginAcesso.chromeDriverConexao();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		loginAcesso.logarPage();
//		loginAcesso.validaAcesso();		
//		lassertEquals("Laercio_Test");
//		loginAcesso.isDisplayed(By.className("hi-user containMiniTitle ng-binding"));
//		return true;
}


		
	}

