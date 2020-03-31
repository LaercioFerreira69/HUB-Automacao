package br.com.rsi.hub3.TDD.testes.automacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import br.com.rsi.hub3.TDD.pageObject.loginAcesso_PO;
import br.com.rsi.hub3.TDD.pageObject.criaLogin_PO;

public class criaLoginNegativo_Test {
	private WebDriver driver;
	criaLogin_PO criaLoginNegativo;

	@Before
	public void setUp() throws Exception {
		criaLoginNegativo = new criaLogin_PO(driver);
		driver = criaLoginNegativo.chromeDriverConexao();
		
	}
	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		criaLoginNegativo.registraUserNegativo();
	}
}
