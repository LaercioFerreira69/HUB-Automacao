package br.com.rsi.hub3.TDD.testes.automacao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsi.hub3.TDD.pageObject.consultaClickHome_PO;

public class consultaClickHome_Test {
	private WebDriver driver;
	consultaClickHome_PO consultaClickHome;

	@Before
	public void setUp() throws Exception {
		consultaClickHome = new consultaClickHome_PO(driver);
	driver = consultaClickHome.chromeDriverConexao();
		
	}
	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}
	@Test
	public void test() throws InterruptedException {
		consultaClickHome.clicaItemNaTela();
	}
}
