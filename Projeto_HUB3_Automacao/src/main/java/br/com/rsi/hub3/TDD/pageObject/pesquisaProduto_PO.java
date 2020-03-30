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
	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement fecharPesquisa;

	@FindBy(how = How.ID, using = "img")
	private WebElement digitaPesquisa;
	
	@FindBy(how = How.XPATH, using = "//label[contains(@class,'noProducts roboto-bold')]//span[@class='ng-binding']")
	private WebElement semResultados;
	
	@FindBy(how = How.ID, using = "searchResultLabel")
	private WebElement encontraResultados;

	

//	public boolean validadaProdutoInexistente() {
//		WebElement resultadoDaPesquisa = semResultados;
//		return resultadoDaPesquisa.isDisplayed();
//	}

//	   public boolean validaProdutoExistente() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		return wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(encontraResultados())))
//				.isDisplayed();
//	}

//	private String encontraResultados() {
//		return null;
//	}
//	public void click(By locator) {
//		driver.findElement(locator).click();
//}
}
