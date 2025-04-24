package My_Package16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificColumn_Print 
{
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		int rows = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']//tr")).size();
		System.out.println("Size of rows : "+rows);

		int column = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']//tr//th")).size();
		System.out.println("Size of column : "+column);
/*
		// Printing Salary only
		
		for(int r = 1; r <= rows; r++)
		{
			for(int c= 5; c<=column - 2; c++)
			{
				String salary = driver.findElement(By.xpath("//div[@class='bd-example table-responsive']//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(salary );
			}
			System.out.println();
		}
*/
		
		// Printing Age only
		
		for(int r = 1; r <= rows; r++)
		{
			for(int c= 3; c <= column - 4; c++)
			{
				String salary = driver.findElement(By.xpath("//div[@class='bd-example table-responsive']//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(salary );
			}
			System.out.println();
		}
	
		driver.quit();
		
	}

}
