package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class RegisterUserWithExistingEmail {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By signupLoginBtn=By.xpath("//a[normalize-space()='Signup / Login']");
 By logintoyourAC=By.xpath("//h2[normalize-space()='Login to your account']");
 By usernameField=By.xpath("//input[@placeholder='Name']");
 By emailField=By.xpath("//input[@data-qa='signup-email']");
 By signupBtn=By.xpath("//button[normalize-space()='Signup']");
 By errorMsg=By.xpath("//p[normalize-space()='Email Address already exist!']");
 SoftAssert softAssert=new SoftAssert();
 public RegisterUserWithExistingEmail(WebDriver driver){
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
 public void EnterUsername(String usernameInput) {
	 driver.findElement(usernameField).sendKeys(usernameInput);
 }
 public void EnterEmail(String emailInpuut) {
	 driver.findElement(emailField).sendKeys(emailInpuut);
 }
 public void ClickOnSignupBtn() {
	 driver.findElement(signupBtn).click();
 }
 public void ValidateEmailAlreadyExistErrorMsg() {
	 String actualText = driver.findElement(errorMsg).getText();
	 String expectedText="Email Address already exist!";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 } 
}
