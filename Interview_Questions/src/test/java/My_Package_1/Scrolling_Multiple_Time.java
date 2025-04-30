package My_Package_1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_Multiple_Time 
{
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		
		// scrolling down by 6 time with slowly 
		for(int i=0; i<=5; i++)
		{
			js.executeScript("window.scrollBy(0,50)");
			Thread.sleep(2000);
		}
		// scrolling up by 6 time with slowly 
		for(int i=0; i<=5; i++)
		{
			js.executeScript(("window.scrollBy(0,-50)"));
			Thread.sleep(2000);
		}

	}

}
