package My_Package27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {

	public static void main(String[] args) throws Throwable 
	{
		// Uploading file through webdriver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		
		// using sendKey ==> {type = file} in html then only senfKey work
		
		String file = "D:\\PavanSir_32_Interview_questions\\Interview_Questions\\Uploads\\abstract class vs interface.pdf";

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(file);

		Thread.sleep(3000);

		WebElement Sbtn = driver.findElement(By.xpath("//button[@id='fileSubmit']"));
		Sbtn.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.close();

	}

}
