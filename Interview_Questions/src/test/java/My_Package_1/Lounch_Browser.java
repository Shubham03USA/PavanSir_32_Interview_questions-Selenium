package My_Package_1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lounch_Browser {
	
	public static ChromeDriver driver;

	public static void main(String[] args) throws Throwable 
	{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://webapp.qedgetech.com/login.php");
			driver.manage().window().maximize();
			
			//How to capture Title of the web page
			System.out.println("Title of the web page = "+driver.getTitle());
			
			//How to capture Current URL of web page
			System.out.println("URL of the web page = "+driver.getCurrentUrl());
			
			//How to capture Page Source
			System.out.println("Page Source = "+driver.getPageSource());
			
			Thread.sleep(3000);
			driver.close();

	}

}
