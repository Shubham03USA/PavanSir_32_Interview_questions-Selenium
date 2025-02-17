package Responsive_Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResponsiveTest 
{
	WebDriver driver;
	HashMap<String, Dimension> deviceMap = new HashMap<String, Dimension>() 
	{
		{
			put("pixel", new Dimension(412, 915));
			put("Tablet", new Dimension(1024, 1366));
			put("Desktop", new Dimension(2188, 1373));
		}
	};

	WebDriverWait wait;

	@BeforeMethod(description = "Lounch chrome browser")
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.startproto.com/manufacturing-software/inventory-management");
		wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
	}

	@Test
	public void responsiveTest() throws InterruptedException 
	{
		for (Map.Entry<String, Dimension> device : deviceMap.entrySet()) 
		{
			System.out.println(device.getKey() + "--" + device.getValue());

			if (device.getKey().equalsIgnoreCase("pixel")) 
			{
				driver.manage().window().setSize(device.getValue()); // if we pass specific dimension to driver
				System.out.println("Runing test for pixle");

				WebElement HambugerIconElement = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@class='navbar_menu-button w-nav-button']")));
				Assert.assertEquals(HambugerIconElement.isDisplayed(), true);
				HambugerIconElement.click();

				WebElement menuItemElements = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@class='navbar_menu-container']")));
				Assert.assertEquals(menuItemElements.isDisplayed(), true);
			} 
			else if (device.getKey().equalsIgnoreCase("Tablet")) 
			{
				driver.manage().window().setSize(device.getValue()); // if we pass specific dimension to driver
				System.out.println("Runing test for Tablet");

				WebElement navItemElements = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@class='navbar_menu-container']")));
				Assert.assertEquals(navItemElements.isDisplayed(), true);

			} 
			else if (device.getKey().equalsIgnoreCase("Desktop")) 
			{
				driver.manage().window().setSize(device.getValue()); // if we pass specific dimension to driver
				System.out.println("Runing test for Desktop");

				WebElement navItemElements = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//div[@class='navbar_menu-container']")));
				Assert.assertEquals(navItemElements.isDisplayed(), true);

			}
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
