package My_Package19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Operations {

	public static void main(String[] args) throws Throwable 
	{
		//Q. How to perform right click Action?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));		
		
		Actions act = new Actions(driver);
		act.contextClick(btn).perform();
		
		Thread.sleep(3000);	
		driver.close();
		

	}

}
