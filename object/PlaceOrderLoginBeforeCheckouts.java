package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class PlaceOrderLoginBeforeCheckouts {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By signupLoginBtn=By.xpath("//a[normalize-space()='Signup / Login']");
 By emailField=By.xpath("//input[@data-qa='login-email']");
 By passwordField=By.xpath("//input[@placeholder='Password']");
 By loginBtn=By.xpath("//button[normalize-space()='Login']");
 By username=By.xpath("//b[normalize-space()='admin319']");
 By addProductToCart=By.xpath("//a[@data-product-id=\"2\"]");
 By cartOption=By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
 By cartPage=By.xpath("//a[normalize-space()='Cart']");
 By proceedToCheckouts=By.xpath("//a[normalize-space()='Proceed To Checkout']");
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
 By continueBtn=By.xpath("//a[normalize-space()='Continue']");
 SoftAssert softAssert=new SoftAssert();
 public PlaceOrderLoginBeforeCheckouts(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }
 public void ClickOnSignupLoginOption() {
	 driver.findElement(signupLoginBtn).click();
 }
 public void LoginToAccount(String email,String password) {
	 driver.findElement(emailField).sendKeys(email);
	 driver.findElement(passwordField).sendKeys(password);
	 driver.findElement(loginBtn).click(); 
 }
 public void ValidateUsernameVisibility() {
	 String actualText = driver.findElement(username).getText();
	 String expectedText="admin319";
	 softAssert.assertEquals(actualText, expectedText,"Username is mismatched");
 }
 public void AddProductToCart() {
	 driver.findElement(addProductToCart).click();
 }
 public void ClickOnCartOption() {
	 driver.findElement(cartOption).click();
 }
 public void ValidateCartPageVisible() {
	 boolean isDisplayed = driver.findElement(cartPage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "cart page is not displyed");
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
 
 
 
 

