package My_Package16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificRow_Print
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		int rows = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']//tr[2]")).size();
		System.out.println("Size of rows : "+rows); //for specific row give direct row number 

		int column = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']//tr//th")).size();
		System.out.println("Size of column : "+column);
		
		for(int r = 1; r<=rows; r++)
		{
			for(int c =1; c<=column; c++)
			{
                String specific_Row = driver.findElement(By.xpath("//div[@class='bd-example table-responsive']//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print( specific_Row + "    " );
			}
			System.out.println();
		}
		
		

	}

}
