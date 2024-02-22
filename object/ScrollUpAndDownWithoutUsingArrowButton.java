package object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ScrollUpAndDownWithoutUsingArrowButton {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By subscription=By.xpath("//h2[normalize-space()='Subscription']");
 By text=By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");
 SoftAssert softAssert=new SoftAssert();
 public ScrollUpAndDownWithoutUsingArrowButton (WebDriver driver) {
	 this.driver=driver;
 } 
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }  
 public void ScrollDownPageToBottom() {
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,8000)"); 
 } 
 public void ValidateSubscriptionText() {
	String actualText = driver.findElement(subscription).getText(); 
	String expectedText="Subscription";
	softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ScrollUpPageToTop() {
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,-8000)"); 
 }
 public void ValidatePageScrollUp() {
	 String actualText = driver.findElement(text).getText(); 
	 String expectedText="Full-Fledged practice website for Automation Engineers";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched"); 
 }	
}
