package br.com.rsi.hub3.TDD.testes.automacao;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.rsi.hub3.TDD.pageObject.loginAcesso_PO;
import br.com.rsi.hub3.TDD.pageObject.*;


public class LoginNegativo_Test {
	
	private WebDriver driver;
	loginAcesso_PO loginAcessoNegativo;

		

	@Before
	public void setUp() throws Exception {
		loginAcessoNegativo = new loginAcesso_PO(driver);
		driver = loginAcessoNegativo.chromeDriverConexao();
	}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}

	@Test
	public void test() throws Exception {
		
		loginAcessoNegativo.logarPageNegativo();
//		loginAcessoNegativo.validaAcesso();		
//		assertEquals("Laercio_Test");
//		loginAcessoNegativo.isDisplayed(By.className("hi-user containMiniTitle ng-binding"));
//		return true;
}


		
	}

