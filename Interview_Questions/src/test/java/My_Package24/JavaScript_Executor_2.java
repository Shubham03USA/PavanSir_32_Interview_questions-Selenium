package My_Package24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitie_Package_For_JavaScript_Executor.JavaScript_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_2 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Capturing title 
		
		String title = JavaScript_Util.getTitleByJs(driver); //js.executeScript("return document.title;").toString();
		System.out.println("Title of the page ==> "+title);

		Thread.sleep(3000);
		driver.close();
		
	}
	

}
