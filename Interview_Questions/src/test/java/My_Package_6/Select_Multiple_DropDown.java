package My_Package_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Multiple_DropDown 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// selecting values for multiple dropDown
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement cars = driver.findElement(By.id("cars"));
		selectOption(cars , "Audi");
		System.out.println("Audi car is selected...");
		Thread.sleep(2000);
		
		WebElement style = driver.findElement(By.id("oldSelectMenu"));
	    selectOption(style, "Yellow");
	    System.out.println("Yellow color is selected...");
		Thread.sleep(2000);
		
		driver.close();

	}
	
	// This is generic method we created for drop down
	
	public static void selectOption(WebElement ele, String value)
	{
		Select drp = new Select(ele);
		List<WebElement> alloptions = drp.getOptions();
		
		for (WebElement opt : alloptions) 
		{
			if(opt.getText().equals(value))
			{
				opt.click();
				break;
			}
						
		}
	}

}
