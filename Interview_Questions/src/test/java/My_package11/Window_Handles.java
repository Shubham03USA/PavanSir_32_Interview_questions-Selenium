package My_package11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable
	{
		// Handling multiple window browser
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// getWindowHandle() ==> return window id => String
		
//		String window_id = driver.getWindowHandle();
//		System.out.println("Window id => "+window_id);
		
		driver.findElement(By.xpath("//a[contains(.,'OrangeHRM, Inc')]")).click();
		//getwindowHanldes() ==> return multiple window id => list in String
		
		Set<String> ids = driver.getWindowHandles(); //return multiple ids 
		
		 Iterator<String> id = ids.iterator();
		 
		 String childId = id.next();
		 String parentId = id.next();
		 
		 System.out.println("Child id = "+childId);  //Child id = 47AB1D7AD8FF4FCF56C730AB90E2E147
		                                             
		 System.out.println("Parent id = "+parentId); //Parent id = AFFCDE344D80F6F0F559A772D84AC7EC
		
		 // how to use Ids for switching purpose
		
		 driver.switchTo().window(parentId);
		 System.out.println("Parent window title = "+driver.getTitle());
		 
		 driver.switchTo().window(childId);
		 System.out.println("Child window title = "+driver.getTitle());
		 
		Thread.sleep(3000);
		driver.quit();

	}

}
