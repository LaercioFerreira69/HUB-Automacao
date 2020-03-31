package br.com.rsi.hub3.TDD.testes.automacao;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.rsi.hub3.TDD.pageObject.*;
import br.com.rsi.hub3.TDD.pageObject.pesquisaProduto_PO;

public class pesquisaProduto_Test{
	
	private WebDriver driver;
	pesquisaProduto_PO pesquisaProduto; 

	@Before
	public void setUp() throws Exception {
		pesquisaProduto = new pesquisaProduto_PO(driver);
		driver = pesquisaProduto.chromeDriverConexao();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception{
		pesquisaProduto.pesquisarProdutoPelaLupa();
	}

}
