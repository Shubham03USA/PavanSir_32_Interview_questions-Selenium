package Lounch_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lounch_Amazon_By_MouseOver 
{
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// just launch Amazon India and mouse over on Account and list and then 
		// click on Sing up with the help of actions class
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		act.moveToElement(link).perform();
		System.out.println("Moving to account and sign up box");
		
		WebElement sigin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		sigin.click();
		System.out.println("Clicking on sign up button...");
				
		Thread.sleep(3000);
		driver.close();
	}
}
