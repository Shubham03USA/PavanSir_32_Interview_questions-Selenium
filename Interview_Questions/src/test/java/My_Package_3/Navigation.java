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

		driver.get("https://www.snapdeal.com/");
		driver.navigate().back();// amazon
		
		driver.navigate().forward();//snapDeal
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().refresh(); //reload page
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
