package My_Package17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		//driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();// it will click on show more link
		
		
		int col = driver.findElements(By.xpath("//table[@id='dataTable']//tr//th")).size();
		System.out.println("Colum size :"+col);
		
		int row = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		System.out.println("Size of the row :"+row);
		
		int final_col = col -1; // becouse last column is not a data its img
		System.out.println("Finalcolumn size :"+final_col);
		
		// Method 1
		for(int r=1; r<=row; r++)
		{
			for(int c=1; c<=final_col; c++)
			{
				String all_data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+ r +"]//td["+ c +"]")).getText();
				System.out.print(all_data+"  |  ");
			}
			System.out.println(" ");
		}
		
		// method 2
/*		
 *      List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("Size of the row :"+row.size());
		
 * 
		for(int i=0;i<row.size();i++) // Row = it will print entire data of the table
		{
			System.out.println("Print the table row = "+row.get(i).getText());
			System.out.println("    ");
		}
*/		
//		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
		
//		for(int i=0;i<column.size();i++) // Column =  it will print only headings 
//		{
//			System.out.println("Print the table column = "+column.get(i).getText());
//		}
//		
		driver.close();

	}

}
