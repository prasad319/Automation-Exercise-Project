package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LoginUserWithValidEmailAndPassword {
 WebDriver driver;
 By homePage=By.xpath("//a[normalize-space()='Home']");
 By signupLoginBtn=By.xpath("//a[normalize-space()='Signup / Login']");
 By logintoyourAC=By.xpath("//h2[normalize-space()='Login to your account']");
 By emailField=By.xpath("//input[@data-qa='login-email']");
 By passwordField=By.xpath("//input[@placeholder='Password']");
 By loginBtn=By.xpath("//button[normalize-space()='Login']");
 By username=By.xpath("//b[normalize-space()='admin319']");
 By deleteAccountBtn=By.xpath("//a[normalize-space()='Delete Account']");
 By deleteAccountText=By.xpath("//b[normalize-space()='Account Deleted!']");
 By continueBtn=By.xpath("//a[normalize-space()='Continue']");
 SoftAssert softAssert=new SoftAssert();
 public LoginUserWithValidEmailAndPassword(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidateHomepageVisibility() {
	boolean isDisplayed = driver.findElement(homePage).isDisplayed();
	softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }
 public void ClickOnSignupLoginOption() {
	 driver.findElement(signupLoginBtn).click();
 }
 public void ValidateLoginToYourAccountText() {
	 String actualText = driver.findElement(logintoyourAC).getText();
	 String expectedText="Login to your account";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void EnterEmailAddress(String emailInput) {
	 driver.findElement(emailField).sendKeys(emailInput);
 }
 public void EnterPassword(String passwordInpuut) {
	 driver.findElement(passwordField).sendKeys(passwordInpuut);
 }
 public void ClickOnLoginBtn() {
	 driver.findElement(loginBtn).click();
 }
 public void ValidateUsernameVisibility() {
	 String actualText = driver.findElement(username).getText();
	 String expectedText="admin319";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnDeleteAccountBtn() {
	driver.findElement(deleteAccountBtn).click(); 
 }
 public void ValidateAccountDeletedVisible() {
	String actualText = driver.findElement(deleteAccountText).getText();
	String expectedText="ACCOUNT DELETED!";
	softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnContinueBtn() {
	driver.findElement(continueBtn).click(); 
 }
}
