package pom_runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumbertest_pom.login_pom;

public class login_pom_runner {
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, login_pom.class);
		login_pom.CreateanAccount.click();
		login_pom.firstname.sendKeys("Ram");
		login_pom.lastname.sendKeys("jai");
		login_pom.email.sendKeys("ramjai111@gmail.com");
		login_pom.password.sendKeys("ram222");
		login_pom.confirmpassword.sendKeys("ram222");
		login_pom.createaccount.click();
}
}
