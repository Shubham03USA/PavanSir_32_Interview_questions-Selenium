package TestCaseStudio;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_Studio
{
	// test case studio is used to generate manual test steps via automation using test case studio extension 

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addExtensions(new File("D:\\loopjjegnlccnhgfehekecpanpmielcj-1.7.7-Crx4Chrome.com.crx"));
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("chrome-extension://loopjjegnlccnhgfehekecpanpmielcj/testCaseStudio/studioWindow.html");
		String testcasestudioWindId = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium tutorials");
		driver.findElement(By.name("q")).submit();
		driver.close();
		
		driver.switchTo().window(testcasestudioWindId);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@title=\"Edit test case name\"]")).sendKeys("Google Test Case");
		driver.findElement(By.xpath("//button[@class='saveTestCaseBtn']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
