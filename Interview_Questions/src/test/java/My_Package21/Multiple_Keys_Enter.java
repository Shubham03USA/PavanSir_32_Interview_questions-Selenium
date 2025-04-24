package My_Package21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Keys_Enter {

	public static void main(String[] args) throws Throwable 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement input_box = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		input_box.sendKeys("Hello selenium testing Multiple key action...");
		
		WebElement Output_box = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		Actions act = new Actions(driver);
		
		//ctrl + A ==> to select all
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("ctrl + A ==> to select all...");
		
		
		//ctrl + C  ==> to copy text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("ctrl + C  ==> to copy text");
		
	    // tab ==> to shift next box for paste
		act.sendKeys(Keys.TAB);
		act.perform();
		System.out.println("tab ==> to shift next box for paste");
		
		//ctrl + V ==> to paste the selected text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("ctrl + V ==> to paste the selected text");
		
		//compare text 
		if(input_box.getAttribute("value").equals(Output_box.getAttribute("value")))
		{
			System.out.println("Text was copied successfully... ");
		}
		else
		{
			System.out.println("Text was not copied ... ");
		}
	
		Thread.sleep(2000); 
		driver.close();

	}
}
