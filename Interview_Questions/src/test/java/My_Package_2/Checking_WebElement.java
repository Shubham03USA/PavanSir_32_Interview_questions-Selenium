package My_Package_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checking_WebElement {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		//Q1. How to check web element IsDisplayed, IsEnable, IsSelected?
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		WebElement SearchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='small-searchterms']")));
		
		// isDisplayed 
		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display status = " + SearchBox.isDisplayed());
		
		// isEnable
		System.out.println("Enable status = " + SearchBox.isEnabled());
		
		//IsSelected
		
		WebElement maleBtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Male Button is selected = " + maleBtn.isSelected()); // false
		maleBtn.click(); 
		System.out.println("Male Button is selected = " + maleBtn.isSelected()); // true
		
		WebElement femaleBtn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Female button is selected = " + femaleBtn.isSelected()); //false
		femaleBtn.click();
		System.out.println("Female button is selected = " + femaleBtn.isSelected()); //true

		//Thread.sleep(3000);
		driver.close();
		
	}

}
