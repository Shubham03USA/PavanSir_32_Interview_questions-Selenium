package SVG_Ghraph_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGghraphHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		String verticalXpath = "//*[local-name ()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		String textxpath = "//*[local-name()='svg' ]//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		List<WebElement> barslist = driver.findElements(By.xpath(verticalXpath));
		System.out.println("Total bars list = " + barslist.size());
		
		Actions act = new Actions(driver);
		
		for(WebElement e : barslist)
		{
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String text = driver.findElement(By.xpath(textxpath)).getText();
			System.out.println("Tooltip text = "+text);
		}
		
		driver.quit();

	}

}
