package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class TestcasePage {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By testCase=By.xpath("//a[normalize-space()='Test Cases']");
 By testcasePage=By.xpath("//a[contains(text(),'Test Cases')]");
 
 SoftAssert softAssert=new SoftAssert();
 public TestcasePage(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }
 public void ClickOnTestCaseOption() {
	 driver.findElement(testCase).click();
 }
 public void ValidateTestCasePage() {
	 boolean isDisplayed = driver.findElement(testcasePage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The test page is not displayed");
 }
}
