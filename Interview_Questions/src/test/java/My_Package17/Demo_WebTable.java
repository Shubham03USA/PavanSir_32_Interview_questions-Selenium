package My_Package17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_WebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']"));
	    List<WebElement> col = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul//li"));
		
	    System.out.println("Size of rows = "+ row.size());
	    System.out.println("Size of column = " + col.size());
	    
	    for(int i= 0;i<row.size();i++)
	    {
	    	System.out.println(row.get(i).getText());
	    	
	    }
		
		Thread.sleep(3000);
		driver.close();

	}

}
