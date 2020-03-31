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
	
	
	public static WebDriver iniciaNavegador() {
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			return driver;
	}

	public static void finalizaNavegador() {
		if (driver != null) {
			driver.quit();
					}
		driver = null;
	}
}
