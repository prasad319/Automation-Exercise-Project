package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AddToCartFromRecommendedItems {
 WebDriver driver;
 By recommendedItems=By.xpath("//h2[normalize-space()='recommended items']");
 By addToCart=By.xpath("(//p[text()=\"Men Tshirt\"])[3]/../a[1]");
 By viewCart=By.xpath("//u[normalize-space()='View Cart']");
 By product=By.xpath("//a[normalize-space()='Men Tshirt']");
 SoftAssert softAssert=new SoftAssert();
 public AddToCartFromRecommendedItems(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidateRecommendedItemsVisible() {
	 String actualText = driver.findElement(recommendedItems).getText();
	 String expectedText="recommended items";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnAddToCart() {
	 driver.findElement(addToCart).click();
 }
 public void ClickOnViewCartOption() {
	 driver.findElement(viewCart).click();
 }
 public void ValidateProductDisplayingInCart() {
	 String actualText = driver.findElement(product).getText();
	 String expectedText="Men Tshirt";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }	
}
