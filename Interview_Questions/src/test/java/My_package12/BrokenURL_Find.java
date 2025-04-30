package My_package12;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenURL_Find 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.in/");
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    //Find out number of links present in page
	    
	    System.out.println("Total number of links : "+links.size());
	    
	    int brokenlinks = 0;
	    
	    // collecting all link in single variable
	    
	    for (WebElement ele : links) 
	    {
			String urls = ele.getAttribute("href");
			System.out.println("Actual Links name : "+urls);
			
			//checking url isEmpty or null
			
			if(urls == null || urls.isEmpty())
			{
				System.out.println("Urls are Empty or Null...");
				continue;
			}
			else
			{
				System.out.println("Urls are not null and Not Empty...");
			}
			
			try
			{

				URL ur = new URL(urls);
				 HttpsURLConnection httpcon = (HttpsURLConnection) ur.openConnection();
				 httpcon.connect();
				 
				 if(httpcon.getResponseCode()>=400)
				 {
					System.out.println( httpcon.getResponseCode()+"- Link is Broken - "+urls); 
					brokenlinks++;
				 }
				 else
				 {
					 System.out.println( httpcon.getResponseCode()+"- Link is valid - "+urls); 
				 }
				
			} 
			catch (Exception e) 
			{

				e.printStackTrace();
			}
			
		}
	    
	    System.out.println("Number of Links broken : "+brokenlinks);
	    
	    Thread.sleep(3000);
	    driver.quit();
	    
	}
			
}
