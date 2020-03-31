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
	
	@FindBy
	By digitaPesquisa   = By.id("autoComplete");
//	By abrePesquisa     = By.id("menuSearch");
//	By abrePesquisa     = By.xpath("//div[@id='search']//a//*[local-name()='svg']");
	By abrePesquisa		= By.cssSelector("#menuSearch");
	By lupaPesquisaDigitado = By.id("menuSearch");
	By semResultados    = By.xpath("//label[contains(@class,'noProducts roboto-bold')]//span[@class='ng-binding']");
	By encontraResultados = By.id("searchResultLabel");
	By clicaProduto     = By.id("15");
	
	public void pesquisarProdutoPelaLupa() throws InterruptedException {
		Thread.sleep(10000);
		click(abrePesquisa);
		Thread.sleep(3000);
		type("headphones",digitaPesquisa);
		click(lupaPesquisaDigitado);
		Thread.sleep(3000);
		click(clicaProduto);
		
		
		
	}
}