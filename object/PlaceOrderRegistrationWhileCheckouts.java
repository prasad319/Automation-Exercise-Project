package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class PlaceOrderRegistrationWhileCheckouts {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By addProductToCart=By.xpath("//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]");
 By viewCart1=By.xpath("//u[normalize-space()='View Cart']");
 By cartpage=By.xpath("//a[normalize-space()='Cart']");
 By proceedToCheckouts=By.xpath("//a[normalize-space()='Proceed To Checkout']");
 By registerloginOption=By.xpath("//u[normalize-space()='Register / Login']");
 By usernameField=By.name("name");
 By emailAddressField=By.xpath("//input[@data-qa='signup-email']");
 By signupBtn=By.xpath("//button[normalize-space()='Signup']");
 By checkbox1=By.xpath("//input[@id='id_gender1']");
 By username1=By.xpath("//input[@id='name']");
 By emailAddress=By.xpath("//input[@id='email']");
 By passwrd=By.xpath("//input[@id='password']");
 By day=By.xpath("//select[@id='days']");
 By month=By.xpath("//select[@id='months']");
 By year=By.xpath("//select[@id='years']");
 By checkbox2=By.xpath("//input[@id='newsletter']");
 By checkbox3=By.xpath("//input[@id='optin']");
 By firstName=By.xpath("//input[@id='first_name']");
 By lastName=By.xpath("//input[@id='last_name']");
 By companyName=By.xpath("//input[@id='company']");
 By address1=By.xpath("//input[@id='address1']");
 By address2=By.xpath("//input[@id='address2']");
 By country=By.xpath("//select[@id='country']");
 By statename=By.xpath("//input[@id='state']");
 By city=By.xpath("//input[@id='city']");
 By zipcode=By.xpath("//input[@id='zipcode']");
 By mobileNumber=By.xpath("//input[@id='mobile_number']");
 By createaccountBtn=By.xpath("//button[normalize-space()='Create Account']");
 By accountCreated=By.xpath("//b[normalize-space()='Account Created!']");
 By continueBtn=By.xpath("//a[normalize-space()='Continue']");
 By username2=By.xpath("//b[normalize-space()='Admin319']");
 By cartOption=By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
 By addressDetails=By.xpath("//h2[normalize-space()='Address Details']");
 By reviewOrder=By.xpath("//h2[normalize-space()='Review Your Order']");
 By commentBox=By.xpath("//textarea[@name='message']");
 By placeOrder=By.xpath("//a[normalize-space()='Place Order']");
 By cardName=By.xpath("//input[@name='name_on_card']");
 By cardNumber=By.xpath("//input[@name='card_number']");
 By cvcNumber=By.xpath("//input[@placeholder='ex. 311']");
 By month2=By.xpath("//input[@placeholder='MM']");
 By year2=By.xpath("//input[@placeholder='YYYY']");
 By payAndConfirmOrder=By.xpath("//button[@id='submit']");
 By successMsg=By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']");
 By deleteOption=By.xpath("//a[normalize-space()='Delete Account']");
 By accountDelete=By.xpath("//b[normalize-space()='Account Deleted!']");
 SoftAssert softAssert=new SoftAssert();
 public PlaceOrderRegistrationWhileCheckouts(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }
 public void AddProductToCart() {
	 driver.findElement(addProductToCart).click();
 }
 public void ClickOnCartOption1() {
	 driver.findElement(viewCart1).click();
 }
 public void ValidationOfCartPageVisibility() {
	 boolean isDisplayed = driver.findElement(cartpage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The cart page is not displyed");	 
 }
 public void ClickOnProceedToCheckouts() {
	 driver.findElement(proceedToCheckouts).click();
 }
 public void ClickOnRegisterLoginOption() {
	 driver.findElement(registerloginOption).click();
 }
 public void SignupAndCreateAccount(String email,String username,String name,String password,String fstname,String lstname,String compnyname,String add1,String add2,String state,String city,String zipcde,String mobno ) {
	 driver.findElement(usernameField).sendKeys(username);
	 driver.findElement(emailAddressField).sendKeys(email);
	 driver.findElement(signupBtn).click();
	 driver.findElement(checkbox1).click();
	 String actualText = driver.findElement(username1).getAttribute("value");
	 String expectedText="admin319";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText1 = driver.findElement(emailAddress).getAttribute("value");
	 String expectedText1="admin319@gmail.com";
	 softAssert.assertEquals(actualText1, expectedText1,"Text is mismatched");
	 driver.findElement(passwrd).sendKeys(password);
	 WebElement dropDown1 = driver.findElement(day);
	 Select select1 = new Select(dropDown1);
	 select1.selectByIndex(17);
	 WebElement dropdown2 = driver.findElement(month);
	 Select select2 = new Select(dropdown2);
	 select2.selectByVisibleText("April");
	 WebElement dropDown3 = driver.findElement(year);
	 Select select3 = new Select(dropDown3);
	 select3.selectByIndex(11);
	 driver.findElement(checkbox2).click();
	 driver.findElement(checkbox3).click();
	 driver.findElement(firstName).sendKeys(fstname);
	 driver.findElement(lastName).sendKeys(lstname);
	 driver.findElement(companyName).sendKeys(compnyname);
	 driver.findElement(address1).sendKeys(add1);
	 driver.findElement(address2).sendKeys(add2);
	 WebElement dropDown = driver.findElement(country);
	 Select select = new Select(dropDown);
	 select.selectByIndex(0);
	 driver.findElement(statename).sendKeys(state);
	 driver.findElement(this.city).sendKeys(city);
	 driver.findElement(zipcode).sendKeys(zipcde);
	 driver.findElement(mobileNumber).sendKeys(mobno);
	 driver.findElement(createaccountBtn).click(); 
 }
 public void ValidateAccountCreatedVisible() {
	 String actualText = driver.findElement(accountCreated).getText();
	 String expectedText="ACCOUNT CREATED!";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");	
	 driver.findElement(continueBtn).click();
 }
 public void ValidateUsernameVisibility() {
	 String actualText = driver.findElement(username2).getText();
	 String expectedText="admin319";
	 softAssert.assertEquals(actualText, expectedText,"Username is mismatched");
 }
 public void ClickOnCartOption2() {
	 driver.findElement(cartOption).click();
 }
 public void ClickProceedToCheckoutOption() {
	 driver.findElement(proceedToCheckouts).click();
 }
 public void ValidateAddressDetailsAndReviewYourOrder() {
	 String actualText = driver.findElement(addressDetails).getText();
	 String expectedText="Address Details";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText1 = driver.findElement(reviewOrder).getText();
	 String expectedText1="Address Details";
	 softAssert.assertEquals(actualText1, expectedText1,"Text is mismatched");
 }
 public void EnterDescriptionInCommentText(String commentText) {
	 driver.findElement(commentBox).sendKeys(commentText);
 }
 public void ClickOnPlaceOrder() {
	 driver.findElement(placeOrder).click();
 }
 public void EnterPaymentDetails(String Cardname,String cardno,String cvcno,String month,String year)  {
	 driver.findElement(cardName).sendKeys(Cardname);
	 driver.findElement(cardNumber).sendKeys(cardno);
	 driver.findElement(cvcNumber).sendKeys(cvcno);
	 driver.findElement(month2).sendKeys(month);
	 driver.findElement(year2).sendKeys(year);
 }
 public void ClickOnPayAndConfirmOrder() {
	 driver.findElement(payAndConfirmOrder).click();
 }
 public void ValidateSuccessMessage() {
	 String actualText = driver.findElement(successMsg).getText();
	 String expectedText="Address Details";
	 softAssert.assertEquals(actualText, expectedText,"Congratulations! Your order has been confirmed!");
 }
 public void DeleteAccount() {
	 driver.findElement(deleteOption).click();
 }
 public void ValidateAccountDeletedText() {
	 String actualText = driver.findElement(accountDelete).getText();
	 String expectedText="Address Details";
	 softAssert.assertEquals(actualText, expectedText,"Account Deleted!");
 }
 public void ClickOnContinue() {
	 driver.findElement(continueBtn).click();
 }
}
