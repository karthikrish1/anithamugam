package lg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class d1 {
	static Logger log= LogManager.getLogger(d1.class);
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    ChromeDriver ob= new ChromeDriver();
    ob.get("http://www.google.com");//1
    log.info("visited website");
    log.error("element may not be present");
    ob.findElementByLinkText("Images").click();
    log.info("closing the site");
    ob.quit();
    
}
}
