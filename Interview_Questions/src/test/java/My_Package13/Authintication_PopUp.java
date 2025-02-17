package My_Package13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authintication_PopUp {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//syntax = http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		//Authentication pop up
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");// it will login directly

		Thread.sleep(3000);
		driver.close();
	}

}
