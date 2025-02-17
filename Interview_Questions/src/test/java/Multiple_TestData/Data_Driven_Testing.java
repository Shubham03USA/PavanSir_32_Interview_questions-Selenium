package Multiple_TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven_Testing 
{
	
	@DataProvider(name = "testData")
	
	public Object[][] crateTest()
	{
		return new Object[][]
		{ { "standard_user", "secret_sauce" }, { "standard_user2", "secret_sauce" } };
	}
	
	
	
	@Test (dataProvider = "testData")
	public void testLogin(String username, String password) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
