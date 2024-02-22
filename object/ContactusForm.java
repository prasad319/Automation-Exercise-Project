package object;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ContactusForm {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By contactusBtn=By.xpath("//a[normalize-space()='Contact us']");
 By getInTouch=By.xpath("//h2[normalize-space()='Get In Touch']");
 By nameField=By.xpath("//input[@placeholder='Name']");
 By emailField=By.xpath("//input[@placeholder='Email']");
 By subjectField=By.xpath("//input[@placeholder='Subject']");
 By messageField=By.xpath("//textarea[@id='message']");
 By file=By.xpath("//input[@name='upload_file']");
 By submitBtn=By.xpath("//input[@name='submit']");
 By successMsg=By.xpath("//div[@class='status alert alert-success']");
 By homeBtn=By.xpath("//span[normalize-space()='Home']");
 SoftAssert softAssert=new SoftAssert();
 public ContactusForm(WebDriver driver) {
	 this.driver=driver;
 }	
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }
 public void ClickOnContactUsOption() {
	 driver.findElement(contactusBtn).click();
 }
 public void ValidateGetInTouchText() {
	 String actualText = driver.findElement(getInTouch).getText();
	 String expectedText="GET IN TOUCH";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void Entername(String nameInput) {
	 driver.findElement(nameField).sendKeys(nameInput); 
 }
 public void Enteremail(String emailInput) {
	driver.findElement(emailField).sendKeys(emailInput); 
 }
 public void WriteSubject(String subjectInput) {
	 driver.findElement(subjectField).sendKeys(subjectInput);
 }
 public void WriteMessage(String messageInput) {
	driver.findElement(messageField).sendKeys(messageInput); 
 }
 public void UploadFile() {
	driver.findElement(file).sendKeys("D:\\Automation testing Class\\Selenium Screenshot\\Automation Exercise.png"); 
 }
 public void ClickOnSubmitBtn() {
	 driver.findElement(submitBtn).click();
 }
 public void ClickOnOkBtn() {
	Alert alert = driver.switchTo().alert(); 
	String text = alert.getText();
	System.out.println("The text is-"+text);
	alert.accept();
 }
 public void ValidateSuccessMessage() {
	String actualText = driver.findElement(successMsg).getText(); 
	String expectedText="Success! Your details have been submitted successfully.";
	softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnHomeBtn() {
	 driver.findElement(homeBtn).click();
 } 
}
