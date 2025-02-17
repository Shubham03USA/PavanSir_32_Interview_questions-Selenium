package Utilitie_Package_For_JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript_Util 
{
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	public static String getTitleByJs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;		
	}
	
	public static void clickElementByJs(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void generateAlert(WebDriver driver, String message)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}
	
	public static void refreshPageJs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");		
	}
	
	public static void scrollingUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollingDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
	
	public static void ZoomingPageByJs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '150%'"); // zoom out by 100%
	}
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolor = element.getCssValue("backgroundColor");
		
		for(int i=0;i<50;i++)
		{
			changeColor("#000000",element,driver);//1
			changeColor(bgcolor,element,driver);//2
		}
	}
	
	// this method called in above method
	
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'" ,element);
		
		try
		{
			Thread.sleep(50);
		}
		catch (InterruptedException i) 
		{
			
		}
	}

}
