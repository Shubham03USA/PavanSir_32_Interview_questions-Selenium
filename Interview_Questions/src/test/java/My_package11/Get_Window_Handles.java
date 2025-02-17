package My_package11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Window_Handles 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//open multiple tabs
		
		String original_Window = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter'] ")).click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		
		//switching to new window
		for(String handle:AllWindows)
		{
			if(!handle.equals(original_Window))
			{
				driver.switchTo().window(handle);
				System.out.println("Switch to new window/tab");
				break;
			}
		}
		System.out.println("New window title : "+ driver.getTitle());
		
		//switch to original window
		
		driver.switchTo().window(original_Window);
		
		Thread.sleep(3000);
		
		System.out.println("Switch back to original window ...");
			
		driver.quit();
		
	}

}
