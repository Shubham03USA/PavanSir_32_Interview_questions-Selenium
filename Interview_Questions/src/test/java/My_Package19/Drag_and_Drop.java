package My_Package19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {

	public static void main(String[] args) throws Throwable
	{
		// Q. How to perform Drag and Drop Action?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement Spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(madrid, Spain).perform();
		
        Thread.sleep(3000);	
		driver.close();

	}

}
