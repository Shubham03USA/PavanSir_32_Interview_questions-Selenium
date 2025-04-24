package Headless_Mode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Headless_Mode {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		
		driver = new ChromeDriver(opt);
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		System.out.println("Browser run Headless mode successfuly ...");
		driver.close();
		
		

	}

}
