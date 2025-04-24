package FetchingDataFrom_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetch_Data {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
		// fetching data from excel so called as  parameterization = best way to use try catch block
		
		String excelfilepath = "Put here excel file path";	
		
		try(FileInputStream file = new FileInputStream(excelfilepath);
				Workbook wb = new XSSFWorkbook(file))
		{	
			Sheet sheet = wb.getSheetAt(0);
			
			// iterate through row and cell
			
		for (Row row : sheet)
		{
			for (Cell cell : row) 
			{
				switch (cell.getCellType()) 
				{
				case STRING:
					System.out.println(cell.getStringCellValue() + "/t");
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue() + "/t");
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue() + "/t");
					break;
	
				default:
					System.out.println("Unknown type/t");
					break;
				}			
			}
		}			
		} 
		catch (IOException i) 
		{
			i.printStackTrace();
		}		
	}

}
