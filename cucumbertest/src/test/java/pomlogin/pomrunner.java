package pomlogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import logingclass.loginpage;

public class pomrunner {
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, loginpage.class);
		loginpage.CreateanAccount.click();
		loginpage.firstname.sendKeys("Ram");
		loginpage.lastname.sendKeys("jai");
		loginpage.email.sendKeys("ramjai111@gmail.com");
		loginpage.password.sendKeys("ram222");
		loginpage.confirmpassword.sendKeys("ram222");
		loginpage.createaccount.click();

	}

}
