package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

public class base_class { 
	String URL="https://www.makemytrip.com";
	  WebDriver driver=null;
	  Actions act=new Actions(driver);
	 
@SuppressWarnings("deprecation")
@BeforeMethod

public void startapp() throws AWTException  {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	//Robot rr=new Robot();
	}
}
