package StaleElementReferenceException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException_1 
{
	/*
	 * how StaleElementReferenceException occur? ==> there are 3 way to occur it like 
	 * ==>Element Removed from DOM: If the element is removed from the DOM and
	 * the WebDriver still holds a reference to it, subsequent actions on that
	 * element will trigger the StaleElementReferenceException. 
	 * ==> Page Refresh: If the page is refreshed, elements on the page may be re-rendered,
	 *  causing previously located elements to become stale. 
	 * ==> DOM Changes: If the DOM is dynamically modified (e.g., through JavaScript), 
	 * elements may change, and their previous references become invalid.
	 */
	
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		input.sendKeys("laptops");

//		WebElement btn = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
//		btn.click();
		
		Thread.sleep(3000);
		input.clear();
		driver.navigate().refresh();
		input.sendKeys("Mobiles");

		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	
	
}