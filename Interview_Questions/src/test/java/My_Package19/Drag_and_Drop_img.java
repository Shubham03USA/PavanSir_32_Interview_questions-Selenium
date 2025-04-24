package My_Package19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop_img {

	public static void main(String[] args) throws Throwable
	{	
		// Q. How to perform Drag and Drop Action for images?

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		//switching toward frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement img1 = driver.findElement(By.xpath("//li[1]"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(img1, trash).perform();
		System.out.println("Img1 was moved into trash can ");
		Thread.sleep(2000);
		
		act.dragAndDrop(img2, trash).perform();
		System.out.println("Img2 was moved into trash can ");
        Thread.sleep(3000);	
        
		driver.close();

	}

}
