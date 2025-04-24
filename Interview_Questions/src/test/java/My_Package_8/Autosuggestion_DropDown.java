package My_Package_8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion_DropDown 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// AutoSuggestion DropDown
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("CR7");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mkHrUc']//li")));
		
		List<WebElement> listOpt = driver.findElements(By.xpath("//div[@class='mkHrUc']//li"));//("//ul[@role='listbox']//li"));
		System.out.println("List of options = "+listOpt.size());
		
		/*		
		// method ====> 1
		for(int i=1;i<=listOpt.size();i++)
		{
			System.out.println("====>"+listOpt.get(i).getText());
		}
		
		for(int i=1;i<=listOpt.size();i++)
		{
			String exp = "TestNG Tutorial w3schools";
			String act = listOpt.get(i).getText();
			if(exp.equals(act))
			{
				listOpt.get(i).click();
				break;
			}
		}
*/		
		// method =====> 2
		for (WebElement ele : listOpt) 
		{	
			String allopt = ele.getText();
			System.out.println("Option names : "+allopt);
			
			if(allopt.equalsIgnoreCase("CR7 watch"))
			{
				ele.click();
				break;
			}	
		}	
		Thread.sleep(3000);
		driver.close();
	}
}
