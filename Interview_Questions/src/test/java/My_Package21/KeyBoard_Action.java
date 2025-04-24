package My_Package21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Action {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Enter key is pressed...");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.MULTIPLY).perform();
		System.out.println("Multiply * key is pressed ...");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		System.out.println("Arrow down key is pressed...");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ADD).perform();
		System.out.println("Add key is pressed ...");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Back space key is pressed...");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.F5).perform();			
		Thread.sleep(3000);

		driver.close();

	}

}
