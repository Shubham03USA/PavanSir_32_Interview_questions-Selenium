package User_Input_lounch_Browser;

import java.awt.Point;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser 
{
 
	public static void main(String[] args) 
	{
	
		System.out.println("Enter the browser name : ");
		
		Scanner sc = new Scanner(System.in);
		String browser = sc.nextLine();
		WebDriver driver = null;
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
		else
		{
			System.out.println("Enter wrong brower name...");
		}
		
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		
		//boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
//		if(logo == true)
//		{
//			System.out.println("logo is present...");
//		}
//		else
//		{
//			System.out.println("Logo is not present...");
//		}
		
		//System.out.println("Class : "+driver.getClass());
		
		driver.manage().deleteAllCookies();
		
		// Dimension 
		//Dimension d = new Dimension(500, 500);
		//driver.manage().window().setSize(d);
		
		// print radio button
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		 List<WebElement> radioElements = driver.findElements(By.id("sex")); //(By.xpath("//span[@id='u_0_d_QQ']//span//label"));
		
		 System.out.println("Number of Radio Buttons :"+ radioElements.size());
		 
//		 for(int i=1; i<=3; i++)
//		 {
//			 
//			 String buttons = driver.findElement(By.xpath("//span[@id='u_0_d_QQ']//span["+i+"]//label")).getText();
//			 System.out.println("Button are present :"+buttons);
//		 }
		 
		 
			for (WebElement ele : radioElements) 
			{
				String buttons =ele.getText(); //ele.getAttribute("value"); //ele.getText();

				System.out.println("Button are present : " + buttons);
			}
		 
		driver.quit();
		

	}

}
