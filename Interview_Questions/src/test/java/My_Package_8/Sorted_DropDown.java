package My_Package_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorted_DropDown {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// Sorted dropDown
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		drp.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select//option"));
		System.out.println("List of all Country = "+list.size());
				
		ArrayList<String> Org_al = new ArrayList<String>();
		
		ArrayList<String> Temp_al = new ArrayList<String>();
		
		
		for (WebElement opt : list) 
		{
			Org_al.add(opt.getText());
			Temp_al.add(opt.getText());
		}
		Collections.sort(Temp_al);
		System.out.println("temp === "+Temp_al);
		
		Collections.sort(Org_al);
		System.out.println("Org = "+ Org_al);

		Thread.sleep(3000);
		driver.close();

	}

}
