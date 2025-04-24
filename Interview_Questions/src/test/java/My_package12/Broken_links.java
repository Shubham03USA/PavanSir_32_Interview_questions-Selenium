package My_package12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_links {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenlinks = 0;
		
		for (WebElement ele : links) 
		{
			String url = ele.getAttribute("href");// getAttribute is now deprecated
			
			if(url == null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			URL li = new URL(url);			
			try 
			{
				HttpURLConnection httpcon = (HttpURLConnection) li.openConnection(); 
				httpcon.connect();
				
				if(httpcon.getResponseCode() >= 400)
				{
					System.out.println(httpcon.getResponseCode()+"  is "+"Broken links = "+url);
					brokenlinks++;
				}
				else
				{
					System.out.println(httpcon.getResponseCode()+" is "+"Is valid links = "+url);
				}				
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}		
		}		
		System.out.println("Number of Broken links = "+brokenlinks);
		Thread.sleep(3000);
		driver.close();
	}
}
