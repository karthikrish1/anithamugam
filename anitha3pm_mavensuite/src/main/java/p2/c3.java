package p2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.mycontactform.com");
	    //id
	    WebElement ele = ob.findElementByClassName("btn_log");
	    Actions ac= new Actions(ob);
	   // ac.click(ele).build().perform();
	   //ac.doubleClick(ele).build().perform();
	   // ac.contextClick(ele).build().perform();
	   // ac.moveToElement(ele).click().build().perform();
	    ac.clickAndHold(ele).build().perform();
	    Thread.sleep(3000);
	    ac.release(ele).build().perform();
	    Thread.sleep(3000);
	    ob.quit();
	    
	}
}
