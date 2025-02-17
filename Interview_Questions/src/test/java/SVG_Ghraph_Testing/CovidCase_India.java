package SVG_Ghraph_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CovidCase_India {
	//  code is not correct

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tradingeconomics.com/india/coronavirus-deaths");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String verticalXpath = "(//*[local-name()='svg' and @class='highcharts-root'])//*[name()='rect'][2]";
		
		String textxpath = "//div[@class='tooltip-box']";
		
		List<WebElement> barlists = driver.findElements(By.xpath(verticalXpath));
		System.out.println("Total bar list = "+barlists.size());
		
		Actions act = new Actions(driver);
		
		for( WebElement l:barlists)
		{
			act.moveToElement(l).perform();
			Thread.sleep(500);
			String text = driver.findElement(By.xpath(textxpath)).getText();
			System.out.println("Tool tip text = "+text);
		}
		driver.quit();

	}

}
