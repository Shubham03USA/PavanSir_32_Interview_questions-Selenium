package My_Package_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable
	{
		// Drop Down => we can select dropDown option in 3 methods in different ways
		// 1) SelectByVisible() 2)SelectByIndex()  3)SelectbyValue()
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		Select s = new Select(dropDown);
		
		//s.selectByVisibleText("Aruba");	
		//s.selectByValue("GRC"); // greece
		//s.selectByIndex(15); // Azerbaijan and always starts with 0 index
		
		//===> select option without using select class methods
		
		  List<WebElement> alloptn = s.getOptions();

			for (WebElement options : alloptn) 
			{
				System.out.println("All options :"+options.getText());
				if (options.getText().equals("Cyprus")) 
				{
					options.click();
					System.out.println("Option is selected ");
					break;
				}
			}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
