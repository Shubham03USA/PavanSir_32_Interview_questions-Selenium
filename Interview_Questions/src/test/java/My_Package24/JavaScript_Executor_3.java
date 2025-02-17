package My_Package24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitie_Package_For_JavaScript_Executor.JavaScript_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_3 {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// perform Click action
		
		WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));	
		JavaScript_Util.clickElementByJs(register, driver);

		Thread.sleep(3000);
		driver.close();

	}

}
