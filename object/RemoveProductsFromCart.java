package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class RemoveProductsFromCart {
 WebDriver driver;	
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By addProductToCart=By.xpath("//a[@data-product-id=\"2\"]");
 By viewCart=By.xpath("//u[normalize-space()='View Cart']");
 By cartPage=By.xpath("//a[normalize-space()='Cart']");
 By cancelBtn=By.xpath("//i[@class='fa fa-times']");
 By emptyCart=By.xpath("//b[normalize-space()='Cart is empty!']");
 SoftAssert softAssert=new SoftAssert();
 public RemoveProductsFromCart(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displayed");
 }
 public void addProductToCart() {
	 driver.findElement(addProductToCart).click();
 }
 public void ClickOnCartOption() {
	 driver.findElement(viewCart).click();
 }
 public void ValidateCartPageVisible() {
	 boolean isDisplayed = driver.findElement(cartPage).isDisplayed();
	softAssert.assertEquals(isDisplayed, "Cart page is not displayed");
 }
 public void ClickOnCancelBtn() {
	 driver.findElement(cancelBtn).click(); 
 }
 public void ValidateProductRemoveFromCart() {
	 String actualText = driver.findElement(emptyCart).getText();
	 String expectedText="Cart is empty!";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }	
}
