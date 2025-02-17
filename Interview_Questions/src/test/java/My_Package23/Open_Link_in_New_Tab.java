package My_Package23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Link_in_New_Tab {

	public static void main(String[] args) throws Throwable 
	{
		// Q. How to open a link in new tab?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//key we use here 
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).sendKeys(tab);

		Thread.sleep(3000);
		
		driver.close();

	}

}
