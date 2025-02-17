package My_Package14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inner_iFrame {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		//Outer iFrame
		
		
		WebElement outer_iframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outer_iframe); // we are passing frame as webElement
		Thread.sleep(3000);
		
		// inneriFrmae
		WebElement inner_iframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(inner_iframe);
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@type='text'] ")).sendKeys("WelCome to iframe ...");
		Thread.sleep(3000);

		driver.close();

	}

}
