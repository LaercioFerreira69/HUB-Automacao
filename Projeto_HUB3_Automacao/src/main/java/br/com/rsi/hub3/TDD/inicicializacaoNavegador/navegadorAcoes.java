package br.com.rsi.hub3.TDD.inicicializacaoNavegador;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.org.apache.bcel.internal.classfile.Constant;
import com.sun.org.apache.bcel.internal.classfile.ConstantClass;
import com.sun.org.apache.bcel.internal.classfile.ConstantString;

public class navegadorAcoes{
	private static WebDriver driver;
	
	static Constant url = new Constant("advantageonlineshopping.com/#/");
			
	public static WebDriver iniciaNavegador() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver = String (url);
			driver.manage().window().maximize();
			driver.manage().time;outs().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		return driver;
	}

	private static WebDriver String(Constant url2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void finalizaNavegador() {
		if (driver != null) {
			driver.quit();
					}
		driver = null;
	}
}
