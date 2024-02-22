package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AddReviewonProducts {
 WebDriver driver; 
 By productOption=By.xpath("//a[@href='/products']");
 By productPage=By.xpath("//h2[normalize-space()='All Products']");
 By viewProduct=By.xpath("//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]//i[1]");
 By writeyourReview=By.xpath("//a[normalize-space()='Write Your Review']");
 By nameField=By.xpath("//input[@id='name']");
 By emailField=By.xpath("//input[@id='email']");
 By reviewField=By.xpath("//textarea[@id='review']");
 By submitBtn=By.xpath("//button[@id='button-review']");
 By successMsg=By.xpath("//span[normalize-space()='Thank you for your review.']");
 SoftAssert softAssert=new SoftAssert();
 public AddReviewonProducts(WebDriver driver) {
	 this.driver=driver;
 }
 public void ClickOnproductOption() {
	 driver.findElement(productOption).click();
 }
 public void ValidateAllProductPageVisible() {
	 boolean isDisplayed = driver.findElement(productPage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "Page is not displayed");
 } 
 public void ClickOnViewProductOption() {
	 driver.findElement(viewProduct).click();
 }
 public void ValidateWriteYourReviewVisible() {
	 String actualText = driver.findElement(writeyourReview).getText();
	 String expectedText="Write Your Review";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void EnterName(String NameInput) {
	 driver.findElement(nameField).sendKeys(NameInput);
 }
 public void EnterEmail(String EmailInput) {
	 driver.findElement(emailField).sendKeys(EmailInput);
 }
 public void EnterReview(String ReviewInput) {
	 driver.findElement(reviewField).sendKeys(ReviewInput);
 }
 public void ClickOnSubmitBtn() {
	 driver.findElement(submitBtn).click();
 }
 public void ValidateSuccessMessage() {
	 String actualText = driver.findElement(successMsg).getText();
	 String expectedText="Thank you for your review.";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched"); 
 }
}
