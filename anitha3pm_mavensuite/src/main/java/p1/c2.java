package p1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="One")
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumeasy.com");
		
		driver.manage().deleteAllCookies();
		Set<Cookie> s = driver.manage().getCookies();
		System.out.println("Number of coookies "+ s.size());
		driver.quit();
	}
}
