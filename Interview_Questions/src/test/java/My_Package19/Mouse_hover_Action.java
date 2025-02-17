package My_Package19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_hover_Action {

	public static void main(String[] args) throws Throwable 
	{
		// Q. How to perform mouse Hover Actions?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.startproto.com/manufacturing-software/inventory-management");
		driver.manage().window().maximize();
		
		WebElement product = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-0']//div[contains(text(),'Product')]"));
		WebElement customer = driver.findElement(By.xpath("//div[contains(text(),'Customers')]"));
		WebElement Resources = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-2']//div[contains(text(),'Resources')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(customer).moveToElement(product).moveToElement(Resources).click().perform();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
