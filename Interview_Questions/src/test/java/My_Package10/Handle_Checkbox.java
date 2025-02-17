package My_Package10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Checkbox {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://total-qa.com/checkbox-example/");
		driver.manage().window().maximize();
		
		//single selection 
		//driver.findElement(By.xpath("//div[@id='primary']//input[1]")).click(); //Selenium
		
		//selecting multiple checkBox
		List<WebElement> multiCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of checkbox = "+multiCheckBox.size());
		
		//using for loop
/*		
		for(int i=0; i<=multiCheckBox.size();i++)
		{
			multiCheckBox.get(i).click();
		
		}
*/		
		
		//using for each loop
/*		
		for (WebElement ele : multiCheckBox) 
		{
			ele.click();
		}
*/
		// select last 2
		int totalcheckbox = multiCheckBox.size();
		
/*
		for(int i=totalcheckbox-2; i<=totalcheckbox; i++)
		{
			multiCheckBox.get(i).click();
		}
*/
		
		//select 1st 2 check box
		
		for(int i=0; i<=totalcheckbox; i++)
		{
			if(i<2)
			{
				multiCheckBox.get(i).click();
			}
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
