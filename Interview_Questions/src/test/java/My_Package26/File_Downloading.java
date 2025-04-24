package My_Package26;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Downloading {

	public static void main(String[] args) throws Throwable 
	{
		// Q. How to download file using Selenium webDriver?
		
		// download in specific location
		
		String location = System.getProperty("user.dir")+"\\Downloads\\";
		
		//For chrome
		
		HashMap<String, String> preferences = new HashMap<String, String>();
		preferences.put("download.default_directory",location);
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("prefs",preferences);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://filesamples.com/formats/jpg");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/a[1]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();  
		

	}

}
