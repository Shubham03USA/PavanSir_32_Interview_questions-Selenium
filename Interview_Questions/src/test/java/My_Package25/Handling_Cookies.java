package My_Package25;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Cookies 
{

	public static void main(String[] args) throws Throwable 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// Q. How to capture cookies from browser?
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies = "+cookies.size()); 		
		
		//Q. How to print cookies from browser?
		for (Cookie ck : cookies) 
		{
			System.out.println(" ===> "+ck.getName() + " : "+ ck.getValue());			
		}
		
		//Q. How to add cookies to the browser?
		
		Cookie c = new Cookie("MyCookies09", "1234");
		driver.manage().addCookie(c);
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies after adding new cookies = "+cookies.size());//7
		
		//Q. How to delete specific cookies from the browser?
		driver.manage().deleteCookie(c); // we can delete by name ==> deleteCookieName(MyCookies09)
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies after deleting cookie = "+cookies.size());//6
		
		//Q. How to delete all cookies from the browser?
		driver.manage().deleteAllCookies();
		
		cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies after deleting all cookie = "+cookies.size()); //0

		Thread.sleep(3000);
		driver.close();

	}

}
