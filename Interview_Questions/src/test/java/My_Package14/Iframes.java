package My_Package14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		// there are 3 way to switch to frame  
		//1) driver.switchTo().frame("name of frame"); 
		//2) driver.switchTo().frame(webElement);
		//3) driver.switchTo().frame(0); => index
		
		//1st iFrame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[normalize-space()='Click me to display Date and Time.']")).click();
		Thread.sleep(3000);
		
		//2nd iFrame
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		driver.close();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
