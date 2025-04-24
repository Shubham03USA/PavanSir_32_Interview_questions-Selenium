package My_Package16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table {

	public static void main(String[] args) throws Throwable 
	{
		/*
		 * Q. how many columns in table?
		 * Q. how many rows in table?
		 * Q. retrieve the specific row / column data?
		 * Q. retrieve all the data from table?
		 * Q. print a specific data?
		 */
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		driver.manage().window().maximize();
		
		//  Q. how many rows in table?
		
		int row_Count = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']//tr")).size();
		System.out.println("Number of rows in table = "+ row_Count);
		
	    //  Q. how many column in table?
		
		int col_count = driver.findElements(By.xpath("//div[@class='bd-example table-responsive']//tr//th")).size();
		System.out.println("Number of column = "+ col_count);
		
		// Q. retrieve the specific row / column data? 
		
		String specefic_data = driver.findElement(By.xpath("//div[@class='bd-example table-responsive']//tr[4]//td[3]")).getText();
		System.out.println("Specific data from table = " +specefic_data);
		
		// Q. retrieve all the data from table?
		
		System.out.println("All data from table => ");
		
		int final_col = col_count-1;
		
		for(int r=1; r<= row_Count; r++)
		{
			for(int c=1; c<= final_col; c++)
			{
				String data = driver.findElement(By.xpath("//div[@class='bd-example table-responsive']//tr["+(r)+"]//td["+(c)+"]")).getText();
				
				System.out.print(data+"  ||  ");
				
			}
			System.out.println();
		}
	
		Thread.sleep(3000);	
		driver.close();
	}

}
