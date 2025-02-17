package My_Package17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_WebTable_Print_on_Console {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		Thread.sleep(3000);
		
		// Finding xpaths 
		
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();// it will click on show more link
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
			
		for(int i=0;i<row.size();i++) // Row = it will print entire data of the table
		{
			System.out.println("Print the table row = "+row.get(i).getText());
		}
		
//		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
		
//		for(int i=0;i<column.size();i++) // Column =  it will print only headings 
//		{
//			System.out.println("Print the table column = "+column.get(i).getText());
//		}
//		
		driver.close();

	}

}
