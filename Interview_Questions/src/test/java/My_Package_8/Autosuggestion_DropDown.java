package My_Package_8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion_DropDown 
{
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// AutoSuggestion DropDown
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement data = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		data.sendKeys("TestNG Tutorial");
		
		List<WebElement> listOpt = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
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
			if(ele.getText().contains("testng tutorial w3schools"))
			{
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
