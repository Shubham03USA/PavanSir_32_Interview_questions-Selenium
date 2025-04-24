package My_Package24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitie_Package_For_JavaScript_Executor.JavaScript_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_7 {

	public static void main(String[] args) throws Throwable 
	{
		// Scrolling page up - down
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();

			Thread.sleep(3000);
			
			JavaScript_Util.scrollingUp(driver); //("window.scrollTo(0,-document.body.scrollHeight)");

			Thread.sleep(3000);
			
			JavaScript_Util.scrollingDown(driver); //("window.scrollTo(0,document.body.scrollHeight)");
			
			Thread.sleep(3000);
			driver.quit();
		

	}

}
