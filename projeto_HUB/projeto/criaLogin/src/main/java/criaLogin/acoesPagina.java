package criaLogin;




import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

import acoesPagina.Navegador;
  
public class acoesPagina {
	
	private WebDriver driver;

		//@Before
//		public void setUp() throws Exception{
//		System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.advantageonlineshopping.com/#/");
//		}
		
		@Test
	public void criandoLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.findElement(By.id("menuUser")).click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait esperaElemento = new WebDriverWait(driver, 10);
		esperaElemento.until(ExpectedConditions.titleContains("Username"));
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Laercio_Test");
		driver.findElement(By.name("emailRegisterPage")).sendKeys("laercio.santos@rsinet.com.ar");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Testando@123");
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Testando@123");
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Laercio");
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Ferreira");
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("11970707070");
		Thread.sleep(10000);
		Select combobox = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		Thread.sleep(6000);
		combobox.selectByVisibleText("Brazil");
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Osasco");
		driver.findElement(By.name("addressRegisterPage")).sendKeys("Rua sem numero");
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("São Paulo");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("00000666");
		driver.findElement(By.name("i_agree")).click();
		driver.findElement(By.id("register_btnundefined")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("center block smollMargin invalid"));
		Assert.assertEquals("center block smollMargin invalid",driver.getTitle());
		System.out.println(driver);
			
			}

		
	
	@Test
	public void loginAcesso() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.name("username")).sendKeys("Laercio_Test");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Testando@123");
		driver.findElement(By.id("sign_in_btnundefined")).click();
		
	}
	@Test
	public void procuraLupa() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.advantageonlineshopping.com/#/");
	driver.manage().window().maximize();
	driver.findElement(By.id("menuSearch")).click();
	driver.findElement(By.id("autoComplete")).sendKeys("headphones");
	
}
	@Test
	public void consultaTela() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:/Users/laercio.santos/eclipse-workspace/criaLogin/src/main/resources/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.advantageonlineshopping.com/#/");
	driver.manage().window().maximize();
	driver.findElement(By.id("headphonesImg")).click();
		
	
}
}

