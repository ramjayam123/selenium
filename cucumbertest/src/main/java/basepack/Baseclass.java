package basepack;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;
	public static void browserlaunch() {
		driver=new ChromeDriver();
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void toMaximize() {
		driver.manage().window().maximize();
	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
    public static void features(WebElement web) {
    	web.click();
    }
    public static void explicitwait(WebElement locator) {
    	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10000));
    	wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void screenshot(WebDriver driver) throws IOException {
    	TakesScreenshot ts=(TakesScreenshot)driver;
   	 File src = ts.getScreenshotAs(OutputType.FILE);
   		File desc=new File("./logs1/img4.png");
   		 FileUtils.copyFile(src, desc);
   		 }
    public static void quit() {
    	driver.quit();
    }
    public static void action(WebDriver driver) {
    	Actions act=new Actions(driver);
    	act.sendKeys(Keys.ARROW_DOWN).sendKeys("").click().perform();
    }
    public static void jsScroll(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", element);
		
		js.executeScript("window.scroll(500,0)", "");
    }
    public static void Robot() throws AWTException {
    	Robot rr=new Robot();
    }
}
