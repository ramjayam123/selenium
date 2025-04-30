package logingclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(xpath="(//a[text()[normalize-space(.) = 'Create an Account']])[1]")
	public static   WebElement CreateanAccount;
	@FindBy(xpath="//input[@id='firstname']")
	public static   WebElement firstname; 
	@FindBy(xpath="(//label[contains(.,'Last Name')]/following::input)[1]")
	public static   WebElement lastname;
	@FindBy(xpath="(//input[@type='email'])[1]")
	public static   WebElement email;
	@FindBy(xpath="(//input[@name='password'])[1]")
	public static   WebElement password;
	@FindBy(xpath="(//input[@type='password'])[2]")
	public static   WebElement confirmpassword;
	@FindBy(xpath="//button[@title='Create an Account']//span[1]")
	public static   WebElement createaccount;
	


}
