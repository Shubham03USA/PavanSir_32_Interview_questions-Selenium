package My_Package23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_Size_and_Location_of_WebElement {

	public static void main(String[] args) throws Throwable 
	{
		// Q how to capture size and location of the webElemnet?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']"));
		
		//Method 1 ==> to get location using getLocation()
		
		System.out.println("Location ( X and Y ) = " + logo.getLocation());
		
		System.out.println("Location ( X ) = " + logo.getLocation().getX());
		System.out.println("Location ( Y ) = " + logo.getLocation().getY());
		
		//Method 2 ==> to get location using getRect()
		
		System.out.println("Location ( X ) = " + logo.getRect().getX());
		System.out.println("Location ( Y ) = " + logo.getRect().getY());

		// method 1 ==> to get width and height using getSize()
		
		System.out.println("It will give width and height = "+logo.getSize());
		
		System.out.println("It will give width  = "+logo.getSize().width);
		System.out.println("It will give height  = "+logo.getSize().height);

		// method 2 ==> to get width and height using getRect()
		
		System.out.println("width  = " + logo.getRect().getDimension().width);
		System.out.println("Height  = " + logo.getRect().getDimension().height);
		
        Thread.sleep(3000);
        driver.close();

	}

}
