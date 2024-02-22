package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SubscriptionHomePage {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By subscription=By.xpath("//h2[normalize-space()='Subscription']");
 By emailField=By.xpath("//input[@id='susbscribe_email']");
 By arrowBtn=By.xpath("//i[@class='fa fa-arrow-circle-o-right']");
 By successMsg=By.xpath("//div[@class='alert-success alert']");
 SoftAssert softAssert=new SoftAssert();
 public SubscriptionHomePage(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed"); 
 } 
 public void ValidateSubsriptionText() {
	 String actualText = driver.findElement(subscription).getText();
	 String expectedText="Subscription";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void EnterEmail(String EmailInput) {
	 driver.findElement(emailField).sendKeys(EmailInput);
 }
 public void ClickOnArrowBtn() {
	 driver.findElement(arrowBtn).click();
 }
 public void ValidateSuccessMessage() {
	 String actualText = driver.findElement(successMsg).getText();
	 String expectedText="You have been successfully subscribed!";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismacthed");
 }	
}
