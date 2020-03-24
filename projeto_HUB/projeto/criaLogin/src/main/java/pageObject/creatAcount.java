package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class creatAcount extends Base{
	
			
	public creatAcount(WebDriver driver) {
		super(driver);
		
	}
	By registrarLink    = By.id("menuUser");
	By criarConta       = By.xpath("//a[@class='create-new-account ng-scope']");
	By userName	        = By.name("usernameRegisterPage");
	By emailUser		= By.name("emailRegisterPage");	
	By passwordUser		= By.name("passwordRegisterPage");	
	By confirmaPassword	= By.name("confirm_passwordRegisterPage");	
	By primeiroNome		= By.name("first_nameRegisterPage");
	By ultimoNome		= By.name("last_nameRegisterPage");
	By foneUser			= By.name("phone_numberRegisterPage");
	By selecionaPais	= By.name("countryListboxRegisterPage");
	By digitaCidade		= By.name("cityRegisterPage");
	By digitaEndereco	= By.name("addressRegisterPage");
	By digitaEstado		= By.name("state_/_province_/_regionRegisterPage");
	By digitaCep		= By.name("postal_codeRegisterPage");
	By aceitaTermos		= By.name("i_agre");
	By registraCadastro	= By.id("register_btnundefined");
	By erroCadastro		= By.className("center block smollMargin invalid");

}
