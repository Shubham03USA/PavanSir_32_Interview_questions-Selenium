package My_package12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//using link text or partial link text
		//driver.findElement(By.partialLinkText("Sellers")).click();
		
		// how to capture all the links
		
		List<WebElement> all_inks =  driver.findElements(By.tagName("a"));
		System.out.println("Number of links = "+ all_inks.size());
		
		for(int i=0;i<=all_inks.size();i++)
		{
			System.out.println(all_inks.get(i).getText());
			System.out.println(all_inks.get(i).getAttribute("href"));
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
