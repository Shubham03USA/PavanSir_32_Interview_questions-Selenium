package My_Package_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		
		// how to navigate back forward and refresh?
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Amazone Open 1st time...");

		driver.get("https://www.snapdeal.com/");
		System.out.println("Snapdeal opening 1st time...");
		driver.navigate().back();// amazon
		System.out.println("Again Amzon open 2nd time...");
		
		driver.navigate().forward();//snapDeal
		System.out.println("Again Snapdeal open 2nd time...");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().refresh(); //reload page
		System.out.println("Again Snapdeal open 3rd time...");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Closing the driver ...");
		driver.close();

	}

}
