package My_Package14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class In_Out_Text_Capture_Iframe {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://seleniumbase.io/w3schools/iframes");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Capturing inner iFrame text
		driver.switchTo().frame("iframeResult"); // switch to outer frame
		
		driver.switchTo().frame(0); // switch to inner frame

		WebElement inner_text = driver.findElement(By.xpath("//h1"));
		
		System.out.println("Inner_iframe text = "+inner_text.getText());
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame(); // switch to outer frame or outer 
		String outer_frame = driver.findElement(By.xpath("//p[normalize-space()='Use CSS width & height to specify the iframe size:']")).getText();
		
		System.out.println("outer_frame text = "+outer_frame);
		
		driver.close();

	}

}
