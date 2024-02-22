package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ProductQuantityInCart {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By productBtn=By.xpath("//a[@href='/products']");
 By viewProduct=By.xpath("(//i[@class=\"fa fa-plus-square\"])[2]");
 By productName=By.xpath("//h2[normalize-space()='Men Tshirt']");
 By productCategory=By.xpath("//p[normalize-space()='Category: Men > Tshirts']");
 By productPrice=By.xpath("//span[normalize-space()='Rs. 400']");
 By productQuantity=By.xpath("//input[@id='quantity']");
 By addToCartBtn=By.xpath("//button[normalize-space()='Add to cart']");
 By viewCart=By.xpath("//u[normalize-space()='View Cart']");
 By productwithIncreaseQty=By.xpath("//button[@class='disabled']");
 SoftAssert softAssert=new SoftAssert();
 public ProductQuantityInCart(WebDriver driver) {
	this.driver=driver; 
 } 
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed"); 
 }
 public void ClickOnProductOption() {
	driver.findElement(productBtn).click();	 
 }
 public void ClickOnViewProduct() {
	 driver.findElement(viewProduct).click();
 }
 public void ValidateProductDetails() {
	 String actualText1 = driver.findElement(productName).getText();
	 String expectedText1="Men Tshirt";
	 softAssert.assertEquals(actualText1, expectedText1,"Text is mismatched");
	 String actualText2 = driver.findElement(productCategory).getText();
	 String expectedText2="Category: Men > Tshirts";
	 softAssert.assertEquals(actualText2, expectedText2,"Text is mismatched");
	 String actualText3 = driver.findElement(productPrice).getText();
	 String expectedText3="Rs. 400";
	 softAssert.assertEquals(actualText3, expectedText3,"Text is mismatched");
 }
 public void IncreaseQuantityOfProduct(String productinput) {
	 driver.findElement(productQuantity).clear();
	 driver.findElement(productQuantity).sendKeys(productinput);
 }
 public void ClickOnAddToCartOption() {
	 driver.findElement(addToCartBtn).click();
 }
 public void ClickOnViewCartOption() {
	 driver.findElement(viewCart).click();
 }
 public void ValidateProductDisplayInCartWithExactQuantity() {
	 boolean isDisplayed = driver.findElement(productwithIncreaseQty).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "Increase quantity is not displayed");
 }
}
