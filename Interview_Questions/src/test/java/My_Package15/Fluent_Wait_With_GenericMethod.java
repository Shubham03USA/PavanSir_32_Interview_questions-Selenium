package My_Package15;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_Wait_With_GenericMethod {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		By weblocator = By.xpath("//a[normalize-space()='Documentation']");
		waitForElementWithFluentWait(driver, weblocator);
		
		
		driver.close();

	}
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator)
	{
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
		
		WebElement ele = mywait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(locator);
			}
		});
		
		return ele;
	}

}
