package My_Package23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_with_SubMenu  
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://webapp.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		/*	 
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));		
		user.sendKeys("admin");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("admin");
		*/
		
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		
		Actions act = new Actions(driver);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement adm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Administrator']")));
		
		//WebElement ttp = driver.findElement(By.xpath("//a[text()='Administrator']"));
		
		act.moveToElement(adm).perform();
		
		Thread.sleep(3000);
		
		 List<WebElement> drp = driver.findElements(By.xpath("//li[@id='mci_Administrator']//li"));
		
		 System.out.println("Size of list = "+drp.size());
		
		for (WebElement drp_list : drp) 
		{
			String list =drp_list.getText();			
			if(list.equalsIgnoreCase("Manage Breadcrumb Links"))
			{
				drp_list.click();
				WebElement submenu = driver.findElement(By.xpath("//li[@id='mci_Add_New_Breadcrumb_Links']"));
				Actions a = new Actions(driver);
				a.moveToElement(submenu).perform();
			}
			System.out.println(" === > "+list);
		}
		driver.close();
	}
}
