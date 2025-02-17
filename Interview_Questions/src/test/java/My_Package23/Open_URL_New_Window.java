package My_Package23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_URL_New_Window {

	public static void main(String[] args) throws Throwable 
	{
		 //Q. How to open a URL in new window?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); // use window for new window
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();


	}

}
