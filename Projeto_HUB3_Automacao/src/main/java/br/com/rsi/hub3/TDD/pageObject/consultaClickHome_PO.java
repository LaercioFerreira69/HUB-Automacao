package br.com.rsi.hub3.TDD.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsi.hub3.TDD.pageObject.Base_PO;
import com.sun.org.apache.bcel.internal.classfile.Constant;

public class consultaClickHome_PO extends Base_PO{

	By itemTelaInicial   = By.xpath("//div[@id='headphonesImg']");
	By itemTelaItens     = By.id("15");
	By nomeProduto       = By.className("roboto-regular screen768 ng-binding");
	
	
	public void clicaItemNaTela() throws InterruptedException {	
		Thread.sleep(5000);
		click(itemTelaInicial);
		Thread.sleep(5000);
		click(itemTelaItens);
		
		
	}
	public consultaClickHome_PO(WebDriver driver) {
		super(driver);
}
}