package My_Package_6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_without_SelectTag 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// drop down without select type 
     	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// drop down = 1
		//WebElement value =
				driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
		//value.click();
		
		List<WebElement> value_list = driver.findElements(By.xpath("//div[@class=' css-26l3qy-menu']//div[@id='react-select-2-option-2']"));
		System.out.println("List of values = "+value_list.size());
		
		selectMultipleDrp(value_list, "A root option");

		Thread.sleep(3000);

		// drop down = 2
		
		//WebElement one = 
				driver.findElement(By.xpath("//div[@id='selectOne']")).click();
		//one.click();
		
		List<WebElement> one_list = driver.findElements(By.xpath("//div[@class=' css-1s9izoc']//div"));
		System.out.println("List of Option = "+one_list.size());
		
		selectMultipleDrp(one_list, "Prof.");
		
		Thread.sleep(3000);
		driver.close();

	}
	
	// creating generic method for multiple drop down selection
	public static void selectMultipleDrp(List<WebElement>options, String value)
	{
		for (WebElement lst : options) 
		{
			if(lst.getText().equalsIgnoreCase("value"))
			{
				lst.click();
				break;
			}
			
		}
	}

}
