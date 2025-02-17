package My_Package17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_WebTable {

	public static void main(String[] args) throws Throwable 
	{
		// handling dynamic web table with pagination
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
