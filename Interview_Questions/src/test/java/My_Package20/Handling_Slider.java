package My_Package20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Slider {

	public static void main(String[] args) throws Throwable 
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		
		//before slider move location and size
		System.out.println("Location of the min slide = "+min_slider.getLocation()); //(86, 234)
		System.out.println("Height and width of the slider = "+min_slider.getSize()); //(71, 17)
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 150, 0).perform();
		
		//After slider move location and size
		System.out.println("Location of the min slide = "+min_slider.getLocation()); //()
		System.out.println("Height and width of the slider = "+min_slider.getSize()); //()
		Thread.sleep(3000);
		
		
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	
		Actions a = new Actions(driver);
		a.dragAndDropBy(max_slider, -150, 0).perform();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
