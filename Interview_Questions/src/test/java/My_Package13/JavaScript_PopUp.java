package My_Package13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_PopUp {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Alert window with OK button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert ok = driver.switchTo().alert();
		System.out.println("Alert box ok text = "+ ok.getText());
		ok.accept(); //ok 
		Thread.sleep(3000);
		
		// Alert with confirm button
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert box confirm text = "+confirm.getText());
		confirm.dismiss();//cancel
		Thread.sleep(3000);
		
		// Alert for prompt to write some text
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert promt = driver.switchTo().alert();
	    System.out.println("Alert box prompt text = "+promt.getText());
	    promt.sendKeys("Hi...This is js prompt ");
	    Thread.sleep(2000);
	    promt.accept();
		
		Thread.sleep(2000);
		driver.close();

	}

}
