package Multiple_TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_data_Testing 
{
	//Multiple test data for single scenario using Test NG
	
	WebDriver driver;
	@DataProvider(name = "set1")
	public Object[][]method1()
	{
		Object data1[][] = new Object[2][2];
		data1[0][0] = "standard_user"; //useName

		data1[0][1] = "secret_sauce"; //Password
		
		data1[1][0] = "locked_out_user";
		data1[1][1] = "secret_sauce";
		
		return data1;		
	}
	
	@Test (dataProvider ="set1")
	public void data(String input, String password) throws Throwable
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='user-name']"));
		Thread.sleep(2000);
		//email.sendKeys(input + Keys.ENTER);
		email.sendKeys(input);
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(2000);
		//pswd.sendKeys(password +Keys.ENTER);
		pswd.sendKeys(password);
				
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		
		driver.close();		
	}
}
