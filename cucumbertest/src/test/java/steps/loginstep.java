package steps;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepack.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locatorpack.Homepage;
public class loginstep extends Baseclass  {
	Homepage home=new Homepage();
	
@Given("I open the URL {string}")
public void iOpenTheURL(String url) {
	geturl("https://www.makemytrip.com");
//	driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    driver.get(url); 
	//driver.manage().window().maximize();
}
//@Given("I close the pop-up window")
//public void iCloseThePopUpWindow() throws InterruptedException  {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
//	}
////@When("I click on the {string} tab")
//public void iClickOnTheTab(String string) throws InterruptedException {
//	Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Buses']")).click();
//}
//@When("I select {string} as the From location")
//public void iSelectAsTheFromLocation(String string) throws AWTException, InterruptedException  {
//Actions act=new Actions(driver);
//Robot rr=new Robot();
//	driver.findElement(By.xpath("//input[@data-cy='fromCityVal']")).click();
//	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("chennai");
//	Thread.sleep(2000);
//	rr.keyPress(KeyEvent.VK_DOWN);
//	act.sendKeys(Keys.TAB).perform();
//}
//@When("I select {string} as the To location")
//public void iSelectAsTheToLocation(String string) throws InterruptedException, AWTException {
//	Robot rr1=new Robot();
//	Actions act1=new Actions(driver);
//	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("bangaloor");
//	Thread.sleep(2000);
//	rr1.keyPress(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//	act1.sendKeys(Keys.TAB).perform();
//}
//@When("I choose the travel date as the next available date")
//public void iChooseTheTravelDateAsTheNextAvailableDate() throws InterruptedException {
//	Thread.sleep(2000);
//	Actions act3=new Actions(driver);
//	act3.sendKeys(Keys.TAB).perform();
//}
//@When("I click the Search Button")
//public void iClickTheSearchButton() throws InterruptedException {
//Thread.sleep(2000);
//
//	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
//}
//@Then("I apply filters for {string} and {string}")
//public void iApplyFiltersForAnd(String string, String string2) throws InterruptedException {
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("(//span[@class='secondaryTxt font14'])[1]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[normalize-space(text())='Sleeper']")).click();
//	Thread.sleep(2000);
//}
//@Then("I select the {string} checkbox")
//public void iSelectTheCheckbox(String string) throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//span[@class='checkmarkOuter']//span)[1]")).click();
//}
// @Then("I choose {string} as the pick-up point")
//public void iChooseAsThePickUpPoint(String string) throws InterruptedException {
//	 Actions act=new Actions(driver);
//	 driver.findElement(By.xpath("(//input[@name='input-filter-search'])[1]")).click();
//	 act.sendKeys(Keys.ARROW_DOWN).sendKeys("Sholinganallur").click().perform(); 
//	 driver.findElement(By.xpath("(//span[@class='checkMarkInner'])[2]")).click();
//} 
//@Then("I select pick-up time between {int} PM and {int} PM")
//public void iSelectPickUpTimeBetweenPMAndPM(Integer int1, Integer int2) throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//span[contains(@class,'listingSprite eveningIcon')])[1]")).click();
//}
//@Then("I choose travel operators {string} and {string}")
//public void iChooseTravelOperatorsAnd(String string, String string2) throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[normalize-space(text())='IntrCity SmartBus']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//input[@name='input-filter-search'])[2]")).sendKeys("PADMAVATHI");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[normalize-space(text())='PADMAVATHI TRAVELS']")).click();
//}
//@Then("I choose {string} as the drop point")
//public void iChooseAsTheDropPoint(String string) throws InterruptedException {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//input[@name='input-filter-search'])[3]")).sendKeys("Lal Bagh");
// 	driver.findElement(By.xpath("//span[normalize-space(text())='Lal Bagh']")).click();
//	}
//@Then("I select drop time between {int} PM and {int} AM")
//public void iSelectDropTimeBetweenPMAndAM(Integer int1, Integer int2) throws InterruptedException {
//	Thread.sleep(2000);
//	JavascriptExecutor exe1=(JavascriptExecutor)driver;
//	driver.findElement(By.xpath("(//span[contains(@class,'listingSprite nightIcon')]/following-sibling::span)[2]")).click();
//	exe1.executeScript("window.scroll(500,0)", "");
//}
//@Then("I print the bus prices in the console")
//public void iPrintTheBusPricesInTheConsole() throws InterruptedException {
//	Thread.sleep(2000);
//  List<WebElement> elements = driver.findElements(By.xpath("(//div[@class='priceSection']//div)[1]"));
//     for (WebElement webE : elements) {
//	  String text = webE.getText();
//	  System.out.println(text);
//}
//	}
//  @When("I choose the cheapest bus and select any number of seats")
//public void iChooseTheCheapestBusAndSelectAnyNumberOfSeats() throws InterruptedException  {
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//ul[contains(@class,'makeFlex font14')]//li)[3]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//div[@data-test-id='select-seats'])[1]")).click();
//}
//	@When("Select Pick up point {string} and  Drop point {string}")
//	public void select_pick_up_point_and_drop_point(String string, String string2) throws InterruptedException {
//	Thread.sleep(3000);	
//	driver.findElement(By.xpath("(//span[normalize-space(text())='₹680'])[3]")).click();
//		Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//span[normalize-space(text())='Sholinganallur'])[2]")).click();
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.xpath("(//span[normalize-space(text())='Lal Bagh'])[2]")).click();
//	}
//	@When("I click the Continue button")
//	public void iclickthecontinuebutton() throws InterruptedException {
//		Thread.sleep(3000);
//	   driver.findElement(By.xpath("//span[normalize-space(text())='Continue']")).click();
//	}
//	@When("I enter the traveller details with name {string}, age {string}, and gender {string}")
//	public void ienterthetravellerdetailswithnameageandgender(String string, String string2, String string3) throws InterruptedException, AWTException {
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@class='trdSelectTraveller card']")).click();
//	    Actions act=new Actions(driver);
//	    act.sendKeys(Keys.TAB).sendKeys("ram").perform();
//    	 act.sendKeys(Keys.TAB).sendKeys("33").perform();
//	     driver.findElement(By.xpath("(//div[@class='genderTab makeFlex']//div)[1]")).click();
//	}
//	@When("I enter the contact details with email {string} and mobile number {string}")
//	public void ienterthecontactdetailswithemailandmobilenumber(String string, String string2) {
//	    driver.findElement(By.xpath("(//input[contains(@class,'blackText font14')])[1]")).sendKeys("ram111@gmail.com");
//	    driver.findElement(By.xpath("(//input[contains(@class,'blackText font14')])[2]")).sendKeys("8888888888");
//	    }
//	@When("I select the state {string}")
//	public void iselectthestate(String string) throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='dropdownFieldWpr__inputWpr']//input[1]")).click();
//		driver.findElement(By.xpath("//li[normalize-space(text())='Tamil Nadu']")).click();
//		}
//	@When("I select the checkbox to confirm and save billing details to my profile")
//	public void iselectthecheckboxtoconfirmandsavebillingdetailstomyprofile() throws InterruptedException { 
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='checkboxWpr']//b[1]")).click();
//}
//	@When("I select a coupon code radio button if available")
//	public void iselectacouponcoderadiobuttonifavailable() throws InterruptedException  {
//		Thread.sleep(2000);
//	System.out.println("BESTBUS");
//}
//	@When("I click on the Continue button")
//	public void i_click_on_the_continue_button() throws InterruptedException, IOException {
//		Thread.sleep(5000);
//	    driver.findElement(By.xpath("//span[normalize-space(text())='Continue']")).click();
//	    }
//	@Then("I take a screenshot of the payment page and save it")
//	public void iTakeAScreenshotOfThePaymentPageAndSaveIt() throws IOException, InterruptedException  {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space(text())='Credit & Debit Cards']")));
//         driver.findElement(By.xpath("//span[normalize-space(text())='Credit & Debit Cards']")).click();    
//         TakesScreenshot ts=(TakesScreenshot)driver;
//	 File src = ts.getScreenshotAs(OutputType.FILE);
//		File desc=new File("./logs1/img4.png");
//		 FileUtils.copyFile(src, desc);
//
//	} 
	}
//

