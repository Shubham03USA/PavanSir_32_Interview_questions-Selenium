package My_Package24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitie_Package_For_JavaScript_Executor.JavaScript_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_8 {

	public static void main(String[] args) throws Throwable 
	{
		// Zooming page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		JavaScript_Util.ZoomingPageByJs(driver); 
		//for zoom out =>("document.body.style.zoom = '150%'");
		//for zoom in =>("document.body.style.zoom = '50%'");
		//for normal page  =>("document.body.style.zoom = '100%'");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
