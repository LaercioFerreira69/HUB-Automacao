package br.com.rsi.hub3.TDD.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.classfile.Constant;

public class pesquisaProduto_PO extends Base_PO{

	public pesquisaProduto_PO(WebDriver driver) {
		super(driver);
	}
	
	
	By digitaPesquisa   = By.id("autoComplete");
//	By abrePesquisa     = By.xpath("//div[@id='search']//a//*[local-name()='svg']");
	By clicaLupa		= By.id("menuSearch");
	By lupaPesquisaDigitado = By.className("img");
	By semResultados    = By.xpath("//label[contains(@class,'noProducts roboto-bold')]//span[@class='ng-binding']");
	By encontraResultados = By.id("searchResultLabel");
	By clicaProduto     = By.id("15");
	
	public void pesquisarProdutoPelaLupa() throws InterruptedException {
		ewait(clicaLupa);
		click(clicaLupa);
		type("headphones",digitaPesquisa);
		ewait(clicaLupa);
		click(clicaLupa);
		ewait(clicaProduto);
		click(clicaProduto);	
	}
}