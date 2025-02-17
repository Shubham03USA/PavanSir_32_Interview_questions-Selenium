package My_Package_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery_DropDown 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// JQuery drop down
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		WebElement multiSelection = driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		multiSelection.click();
		
		//MultiSelectionOption(driver, "choice 1");
		
		//MultiSelectionOption(driver, "choice 1","choice 2","choice 2 1");

		MultiSelectionOption(driver, "all");

		Thread.sleep(3000);
		driver.close();

	}
	
	public static void MultiSelectionOption( WebDriver driver, String...value)
	{
		
		List<WebElement> optList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println("List of Options = "+optList.size());
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for (WebElement item : optList) 
			{
				String text = item.getText();
				
				for (String val : value) 
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
					
				}
			}
		}
		else
		{
			try
			{
				for (WebElement item : optList) 
				{
					item.click();
				}
			}
			catch (Exception e) 
			{
				//System.out.println(e.getMessage());
			}
		}
			
		
	}

}
