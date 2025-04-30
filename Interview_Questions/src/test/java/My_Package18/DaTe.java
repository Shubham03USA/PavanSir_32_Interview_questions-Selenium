package My_Package18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DaTe 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		String month = "June";
		String year = "2023";
		String date = "3";
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
				
		while(true)
		{
			String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			//System.out.println("---->"+month_year);
					
			String arr[] = month_year.split(" ");
			String mahina = arr[0];
			String varsh = arr[1];
			
			if(mahina.equalsIgnoreCase(month) && varsh.equals(year))
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		// date
		List<WebElement> total_date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

		System.out.println("Date is taken...");
		for (WebElement tarik : total_date) 
		{
			String d = tarik.getText();
			
			if(d.equals(date))
			{
				tarik.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
