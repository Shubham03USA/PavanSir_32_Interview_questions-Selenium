package ParallelAndCross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LounchQuit
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void Lounch(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (nameofbrowser.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if (nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Not valid any browser");
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();			
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
