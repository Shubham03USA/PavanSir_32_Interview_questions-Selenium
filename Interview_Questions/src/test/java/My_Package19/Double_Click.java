package My_Package19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {

	public static void main(String[] args) throws Throwable 
	{
		//Q. How to perform double click Action?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement textbox1 = driver.findElement(By.xpath("//input[@id='field1']"));
		textbox1.clear();
		Thread.sleep(2000);
		
		textbox1.sendKeys("Hello Rahul...");
		Thread.sleep(2000);	
		
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(btn).perform();
		
		Thread.sleep(2000);			
		driver.close();

	}

}
