package My_Package13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_PopUp {

	public static void main(String[] args) throws Throwable 
	{
		// for disable notification pop up we use chromeOption class
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
