package My_Package18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		String year = "2025";
		String month = "May";
		String date = "17";
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		while(true)
		{
			String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			System.out.println("====> "+month_year);
			
			String arr[] = month_year.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	
		}
		
		// Date Selection
		
		List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		
		for (WebElement ele : all_dates) 
		{
			String dt = ele.getText();
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}	
		}	
		Thread.sleep(3000);
		driver.close();
	}

}
