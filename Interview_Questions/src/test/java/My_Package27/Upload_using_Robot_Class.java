package My_Package27;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_using_Robot_Class {

	public static void main(String[] args) throws AWTException, Throwable 
	{
		// Using Robot class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement inp_Box2 = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click", inp_Box2);
		
		Thread.sleep(3000);
		
		String file = "D:\\PavanSir_32_Interview_questions\\Interview_Questions\\Uploads\\abstract class vs interface.pdf";
		
		/*
		 * here
		 * 1) copy the path  
		 * 2) CTRL + V
		 * 3) ENTER              
		 */

		Robot rb = new Robot();
		rb.delay(2000);
		
		// put the path in clipBoard ==> 1) copy the path 
		
		StringSelection ss = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// 2) CTRL + V
		
		// pressing key
		rb.keyPress(KeyEvent.VK_CONTROL); // it will press CTRL key on keyBord
		rb.keyPress(KeyEvent.VK_V); // it will press v button
		rb.delay(2000);
		
		//release key
		rb.keyRelease(KeyEvent.VK_CONTROL); // it will release CTRL key on keyBord
		rb.keyRelease(KeyEvent.VK_V); // it will release v button
		rb.delay(2000);
		
		//pressing key
		rb.keyPress(KeyEvent.VK_ENTER);// it will Press ENTER key on keyBord
		rb.delay(2000);
		
		//release key
		rb.keyRelease(KeyEvent.VK_ENTER);// it will release ENTER button
		rb.delay(2000);
		
		
		driver.close();
		

	}

}
