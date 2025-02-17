package My_Package27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_using_JS {

	public static void main(String[] args) throws Throwable 
	{
		// if click method not working then we go for java script executor
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		
		String file = "D:\\PavanSir_32_Interview_questions\\Interview_Questions\\Uploads\\abstract class vs interface.pdf";
		
		WebElement inp = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", inp);
		
		inp.sendKeys(file);
		Thread.sleep(3000);
		
		WebElement Submit_btn = driver.findElement(By.xpath("//button[@id='fileSubmit']"));
		Submit_btn.sendKeys(Keys.ENTER); // click() and js also not work so keys class used
		
		Thread.sleep(3000);
		driver.close();

	}

}
