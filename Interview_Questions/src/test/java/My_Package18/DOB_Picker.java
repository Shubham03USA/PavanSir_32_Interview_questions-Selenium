package My_Package18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DOB_Picker {

	public static void main(String[] args) throws Throwable 
	{
		// DOB picker from calendar
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		//month selection
		
	    WebElement months = driver.findElement(By.xpath("//select[@title='Change the month']"));
		
		Select mn_drp = new Select(months);
		mn_drp.selectByVisibleText("June");
		System.out.println("Month is selected = June");
		
		
		Thread.sleep(5000);
		
		//year selections
		
		 WebElement years = driver.findElement(By.xpath("//select[@title='Change the year']"));
		
		 Select yr_drp = new Select(years);
		 yr_drp.selectByVisibleText("2017");
		 System.out.println("year is selected = 2017");

			Thread.sleep(5000);
		
		// date selection
		
		String dt = "5";
		
		List<WebElement> all_date = driver.findElements(By.xpath("//div[@class='datepick']//table//tr//td"));
		
		for (WebElement ele : all_date) 
		{
			String date = ele.getText();
			
			if(date.equals(dt))
			{
				ele.click();
				System.out.println("Date is selected = 5");
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}
	
}
