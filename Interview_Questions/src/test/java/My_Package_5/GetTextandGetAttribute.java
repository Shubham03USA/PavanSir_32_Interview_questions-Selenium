package My_Package_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextandGetAttribute {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		// get text vs get Attribute
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();

//		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
//		email.clear();
//		email.sendKeys("abc@gmail.coop");
//		email.clear();
		
		// how to capture the values from textBox which is already present in textBox
		
		// using get attribute method
		String captureEmail = driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value");
		System.out.println("Alredy present value by getAttribute() = "+captureEmail);
		
		// using get text method ==> we get empty value
		String captureEmail1 = driver.findElement(By.xpath("//input[@id='Email']")).getText();
		System.out.println("Alredy present value by getText() = "+captureEmail1);
		
		//for login button using get text method
		String loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']")).getText();
		System.out.println("Getting text from button which is ="+loginbtn);
		
		//for login button using get attribute method
		String loginbtn1 = driver.findElement(By.xpath("//button[normalize-space()='Log in']")).getAttribute("type");
		System.out.println("Getting attribute value from button which is ="+loginbtn1);

		String loginbtn2 = driver.findElement(By.xpath("//button[normalize-space()='Log in']")).getAttribute("class");
		System.out.println("Getting attribute value from button which is ="+loginbtn2);

		// getting title of the page
		String title = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		System.out.println("Page Title"+title);
		Thread.sleep(3000);
		driver.close();

	}

}
