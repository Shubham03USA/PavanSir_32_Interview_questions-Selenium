package My_Package_7;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_DropDown 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// How to handle bootstrap dropDown
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		// This will block all notifications
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        prefs.put("profile.default_content_setting_values.geolocation", 2);
        prefs.put("profile.default_content_setting_values.media_stream_mic", 2);
        prefs.put("profile.default_content_setting_values.media_stream_camera", 2);
        
		option.setExperimentalOption("prefs", prefs);       
		option.addArguments("--start-maximized"); // page maximize
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(option);
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		// product type
		WebElement product_type = driver.findElement(By.xpath("//div[@class='drp1']"));//("//div[@class='drp1']//div[@class='dropdown']"));
		product_type.click();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='drp1']//li"));   //("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("List of Options in Product type = "+ options.size());
		
		selectDrp(options, "Accounts");
		
		//Method ==>1
		/*
		for (WebElement prd_type : options) 
		{
			if(prd_type.getText().equalsIgnoreCase("Accounts"))
			{
				prd_type.click();
				break;
			}
		}
		*/
		
		Thread.sleep(2000);
		
		// product
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		WebElement products = driver.findElement(By.xpath("//div[@class='drp2']"));  //("//div[@class='drp2']//div[@class='dropdown']"));
		wait.until(ExpectedConditions.elementToBeClickable(products));
		products.click();
		
		List<WebElement> product_list = driver.findElements(By.xpath("//div[@class='drp2']//li"));//("//ul[@class='dropdown2 dropdown-menu']//li")); 
		System.out.println("Product list = "+product_list.size());
		
		selectDrp(product_list, "Salary Accounts");
		
		/*
		for (WebElement prd_list : product_list) 
		{
			if(prd_list.getText().equalsIgnoreCase("Salary Accounts"))
			{
				prd_list.click();
				break;
			}			
		}
       */
	
		Thread.sleep(2000);
		driver.close();
	}

	
	// suppose there will more drop down so we need to create one generic method
	//Method ==> 2 
	public static void selectDrp(List<WebElement> ele, String value)
	{
		for (WebElement prd_list : ele) 
		{
			if(prd_list.getText().equalsIgnoreCase(value))
			{
				prd_list.click();
				break;
			}			
		}
	}
	
}
