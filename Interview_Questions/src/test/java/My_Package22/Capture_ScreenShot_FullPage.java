package My_Package22;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_ScreenShot_FullPage {

	public static void main(String[] args) throws Throwable 
	{
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://demo.nopcommerce.com/");
	     driver.manage().window().maximize();
	     
	     Thread.sleep(3000);
     
	     TakesScreenshot ts = (TakesScreenshot)driver;
	     
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     File trg = new File("./ScreenShots/HomePage1.png");
	     
	     FileUtils.copyFile(src, trg);
	     
	     Thread.sleep(3000);
	     driver.close();

	}

}
