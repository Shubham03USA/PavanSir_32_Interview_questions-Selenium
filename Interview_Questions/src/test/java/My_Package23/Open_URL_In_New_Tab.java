package My_Package23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_URL_In_New_Tab {

	public static void main(String[] args) throws Throwable 
	{
		// Q. How to open a URL in new tab?

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB); // use tab for new tab
		
		driver.get("https://jqueryui.com/tooltip/"); 
				
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
