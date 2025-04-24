package My_package11;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable
	{
		// Handling multiple window browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// getWindowHandle() ==> return window id => String
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='OrangeHRM, Inc']")));
		ele.click();
		 
		//getwindowHanldes() ==> return multiple window id => list in String

		Set<String> ids = driver.getWindowHandles(); // return multiple ids
		Iterator<String> id = ids.iterator();
		 
		String childId = id.next();
		System.out.println("Child id = " + childId);

		String parentId = id.next();
		System.out.println("Parent id = " + parentId);

		// how to use Ids for switching purpose

		driver.switchTo().window(parentId);
		System.out.println("Parent window title = "+driver.getTitle());
		 	
		driver.switchTo().window(childId);
		System.out.println("Child window title = " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
