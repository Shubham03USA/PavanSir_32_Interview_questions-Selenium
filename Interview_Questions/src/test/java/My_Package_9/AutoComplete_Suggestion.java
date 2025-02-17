package My_Package_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete_Suggestion 
{

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
		WebElement p = driver.findElement(By.id(""));
		p.sendKeys("Test");
		
		List<WebElement> listbox = driver.findElements(By.xpath(""));
		System.out.println("List = "+ listbox.size()); 
		
//		String text;
//		
//		do
//		{
//			
//		}
//		while()
		
		Thread.sleep(3000);
		driver.close();

	}

}
