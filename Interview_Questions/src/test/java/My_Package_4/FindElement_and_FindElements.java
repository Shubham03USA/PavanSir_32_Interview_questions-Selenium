package My_Package_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement_and_FindElements {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable
	{
		// What is the difference between FindElements and FindElements method
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//findElement => return single element
		
//		WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']")); 	
//		searchBox.sendKeys("Mobile");
		
		WebElement link = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("findElement will return single of first elements = "+link.getText());
		
		//findElements => return multiple elements
		
		List<WebElement> multiplelinks = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Total elements present in footer = " + multiplelinks.size());
		System.out.println("It will return all the elements present in footer");
		

		for (WebElement links : multiplelinks) 		
		{
			System.out.println("URl of Links :	"+links.getAttribute("href"));
			System.out.println("Links name = "+links.getText());
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
