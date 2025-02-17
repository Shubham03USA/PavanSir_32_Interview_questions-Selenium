package My_Package24;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilitie_Package_For_JavaScript_Executor.JavaScript_Util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_1 {

	public static void main(String[] args) throws Throwable 
	{
		/*
		 *                    ========> JAVASCRIPT EXECUTOR <============
		 *                    
		 *  Using javaScriptExecutor we can perform multiple web actions on webElements like
		 *  flashing specific web element, Drawing boarder and taking screenshot, perform click 
		 *  action on links, buttons, images, getting title of the page, generating alert, refreshing
		 *  page, Scrolling the page up and down, zooming the page in and out. 
		 * 
		 *  ====> for reusable method we create one Utilities package for all methods <========== 	
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// drawing border 
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScript_Util.drawBorder(logo, driver);
		
		//taking screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShots/JS_ScreeShot.png");
		FileUtils.copyFile(src, trg);
				
		Thread.sleep(3000);
		driver.close();

	}

}
