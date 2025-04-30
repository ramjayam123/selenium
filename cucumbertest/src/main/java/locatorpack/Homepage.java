 package locatorpack;

import org.openqa.selenium.By;

import basepack.Baseclass;

public class Homepage  extends Baseclass {
	public By closepopup=By.xpath("//span[@data-cy='closeModal']");
	public By clickbustap=By.xpath("//span[text()='Buses']");
	public By selectfromlocation=By.xpath("//input[@data-cy='fromCityVal']");
	public By enterflocation=By.xpath("//input[@placeholder='From']");
	public By entertolocation=By.xpath("//input[@placeholder='To']");
	public By ClickTheSearchButton=By.xpath("(//button[@type='button'])[1]");
	public By ApplyFilterACtype =By.xpath("(//span[@class='secondaryTxt font14'])[1]");
	public By ApplyFilterSeettype=By.xpath("//span[normalize-space(text())='Sleeper']");
	public By selectsingle=By.xpath("(//span[@class='checkmarkOuter']//span)[1]");
	public By clickpickuppoint=By.xpath("(//input[@name='input-filter-search'])[1]");
	public By selectpickuppoint=By.xpath("(//span[@class='checkMarkInner'])[2]");
	public By pickupTime =By.xpath("(//span[contains(@class,'listingSprite eveningIcon')])[1]");
	public By TravelOperator1 =By.xpath("//span[normalize-space(text())='IntrCity SmartBus']");
	public By clicktravelsearchbox =By.xpath("(//input[@name='input-filter-search'])[2]");
	public By TravelOperator2=By.xpath("//span[normalize-space(text())='PADMAVATHI TRAVELS']");
	public By droppoint=By.xpath("(//input[@name='input-filter-search'])[3]");
	public By selectDroppoint=By.xpath("//span[normalize-space(text())='Lal Bagh']");
	public By selectdropTime=By.xpath("(//span[contains(@class,'listingSprite nightIcon')]/following-sibling::span)[2]");
	public By printbusPrice=By.xpath("(//div[@class='priceSection']//div)[1]");
	public By selectcheapestBus=By.xpath("(//ul[contains(@class,'makeFlex font14')]//li)[3]");
	public By selectseats =By.xpath("(//div[@data-test-id='select-seats'])[1]");
	public By selectseat =By.xpath("(//span[normalize-space(text())='₹680'])[3]");
	public By selePickupPoint=By.xpath("(//span[normalize-space(text())='Sholinganallur'])[2]");
	public By seledropPoint=By.xpath("(//span[normalize-space(text())='Lal Bagh'])[2]");
	public By clickContinue=By.xpath("//span[normalize-space(text())='Continue']");
	public By clickTravellerDetails=By.xpath("//div[@class='trdSelectTraveller card']");
	public By selectGender=By.xpath("(//div[@class='genderTab makeFlex']//div)[1]");
	public By entermobilenumber=By.xpath("(//input[contains(@class,'blackText font14')])[1]");
    public By entermailid=By.xpath("(//input[contains(@class,'blackText font14')])[2]");
    public By clickstate=By.xpath("//div[@class='dropdownFieldWpr__inputWpr']//input[1]");
    public By selectstate=By.xpath("//li[normalize-space(text())='Tamil Nadu']");
    public By confirmbox=By.xpath("//span[@class='checkboxWpr']//b[1]");
    public By continuebutton=By.xpath("//span[normalize-space(text())='Continue']");
    public By CreditAndDebitCards=By.xpath("//span[normalize-space(text())='Credit & Debit Cards']");
    
	 public void popupclose() {
		 driver.findElement(closepopup).click();
	 }
	 
	 public void buses() {
		 
		 driver.findElement(clickbustap).click();
		 driver.findElement(selectfromlocation).click();
		 driver.findElement(enterflocation).sendKeys("chennai");
		 driver.findElement(entertolocation).sendKeys("bangaloor");
		 driver.findElement(ClickTheSearchButton).click();
	 }
	 public void enterbookingDetails() {
		 driver.findElement(ApplyFilterACtype).click();
		 driver.findElement(ApplyFilterSeettype).click();
		 driver.findElement(selectsingle).click();
		 driver.findElement(clickpickuppoint).click();
		 driver.findElement(selectpickuppoint).click();
		 driver.findElement(pickupTime).click();
		 driver.findElement(TravelOperator1).click();
		 driver.findElement(clicktravelsearchbox).sendKeys("PADMAVATHI");
		 driver.findElement(TravelOperator2).click();
		 driver.findElement(droppoint).sendKeys("lal");
		 driver.findElement(selectDroppoint).click();
		 driver.findElement(selectdropTime).click();
		 driver.findElement(selectcheapestBus).click();
		 driver.findElement(selectseats).click();
		 driver.findElement(selectseat).click();
		 driver.findElement(selePickupPoint).click();
		 driver.findElement(selePickupPoint).click();
		 driver.findElement(clickContinue).click();
	 }
	 public void TravellerDetails() {
		 driver.findElement(clickTravellerDetails).click();
		 driver.findElement(selectGender).click();
		 driver.findElement(entermailid).sendKeys("ram111@gmail.com");
		 driver.findElement(entermobilenumber).sendKeys("8888888888");
		 driver.findElement(clickstate).click();
		 driver.findElement(selectstate).click();
		 driver.findElement(confirmbox).click();
		 driver.findElement(continuebutton).click();
		 
	 }
	 public void Paymentdetails() {
		 driver.findElement(CreditAndDebitCards).click();
	 }
	 
} 
 