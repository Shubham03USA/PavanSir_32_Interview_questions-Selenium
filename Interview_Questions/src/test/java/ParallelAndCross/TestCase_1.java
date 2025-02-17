package ParallelAndCross;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_1 extends LounchQuit
{
   @Test
   public void Login()
   {
	   
	  WebElement accountlist = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	  accountlist.click();
	
	  WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
	  username.sendKeys("ram4589@gmail.com");
	  
	  WebElement continuebtn = driver.findElement(By.xpath("//input[@id='continue']"));
	  continuebtn.click();
	  
	  WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
	  pass.sendKeys("1234sff6");
	  
	  WebElement signupbtn = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
	  signupbtn.click();
 
   }
   
}
