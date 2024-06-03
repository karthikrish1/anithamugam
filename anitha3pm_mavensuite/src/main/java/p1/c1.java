package p1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {

	
	@Test(groups="One")
	public void t1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.google.com");//1
	    
	    Thread.sleep(3000);
	    
	    ob.findElementByLinkText("Images").click();//2
	    
	    Thread.sleep(3000);
	    
	    ob.navigate().back();//1
	    
	    Thread.sleep(3000);
	    
	    ob.navigate().forward();//2
	    
	   File f = ob.getScreenshotAs(OutputType.FILE);
	   //FileUtils= > apache drectory studio coomon io
	   FileUtils.copyFile(f, new File("anitha.png"));
	   
	    ob.quit();
	}
}
