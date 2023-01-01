package youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teast1 { 
	System.out.println("selenium");
	Sysout.output.println("java");
    static WebDriver driver;
	public static void main(String[] args)  {
	WebDriverManager.operadriver().setup();
	WebDriver driver =new OperaDriver();
	String url="https://www.facebook.com";
	driver.get(url);
    driver.manage().window().maximize();
    
	}
	}

