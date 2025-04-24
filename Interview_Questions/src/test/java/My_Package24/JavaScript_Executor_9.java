package My_Package24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitie_Package_For_JavaScript_Executor.JavaScript_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_9 {

	public static void main(String[] args) throws Throwable 
	{
		// flash
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Flash_logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

		JavaScript_Util.flash(Flash_logo, driver); //("arguments[0].style.backgroundColor = '" + color + "'" ,element);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
