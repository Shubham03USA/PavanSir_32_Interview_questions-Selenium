package ParallelAndCross;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_2 extends LounchQuit
{
	@Test
	public void seachBox()
	{
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("shoes");
		searchbox.sendKeys(Keys.ENTER);
		
	}

}
