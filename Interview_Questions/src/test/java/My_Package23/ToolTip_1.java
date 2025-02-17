package My_Package23;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip_1 
{
	public static void main(String[] args) throws Throwable
	{
		
		// how to capture toolTip of the web Element?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
		@Nullable
		String tooltip = inputbox.getAttribute("title");
		System.out.println(" ===> "+tooltip);
		
		Thread.sleep(3000);
		driver.close();		
	}

}
