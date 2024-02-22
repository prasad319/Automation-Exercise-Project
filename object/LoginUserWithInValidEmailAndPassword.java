package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LoginUserWithInValidEmailAndPassword {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By signupLoginBtn=By.xpath("//a[normalize-space()='Signup / Login']");
 By logintoyourAC=By.xpath("//h2[normalize-space()='Login to your account']");
 By emailField=By.xpath("//input[@data-qa='login-email']");
 By passwordField=By.xpath("//input[@placeholder='Password']");
 By loginBtn=By.xpath("//button[normalize-space()='Login']");
 By wrongInputMsg=By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
 SoftAssert softAssert=new SoftAssert();
 public LoginUserWithInValidEmailAndPassword(WebDriver driver) {
	this.driver=driver; 
 } 
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
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
 public void ValidateWrongInputErrorMessage() {
	 String actualErrorMsg = driver.findElement(wrongInputMsg).getText();
	 String expectedErrorMsg="Your email or password is incorrect!";
	 softAssert.assertEquals(actualErrorMsg, expectedErrorMsg,"Message is mismatched");
 }
}
