package My_Package22;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Perticular_Section_Screenshot
{

	public static void main(String[] args) throws Throwable 
	{
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://demo.nopcommerce.com/");
	     driver.manage().window().maximize();
	     
	     WebElement specific = driver.findElement(By.xpath("//div[@class='footer-upper']"));
	     
	     File src = specific.getScreenshotAs(OutputType.FILE);
	     File trg = new File("./ScreenShots/S_Section1.png");
	     
	     FileUtils.copyFile(src, trg);    
	    
	     Thread.sleep(3000);
	     driver.close();
	}
}
