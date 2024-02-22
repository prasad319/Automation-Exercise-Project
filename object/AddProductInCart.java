package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AddProductInCart {
 WebDriver driver;	
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By productBtn=By.xpath("//a[@href='/products']");
 By firstProduct=By.xpath("//a[@data-product-id='1']");
 By continueShopping=By.xpath("//button[normalize-space()='Continue Shopping']");
 By secondProduct=By.xpath("//a[@data-product-id='2']");
 By viewCart=By.xpath("//u[normalize-space()='View Cart']");
 By firstproductName=By.xpath("//a[normalize-space()='Blue Top']");
 By secondproductName=By.xpath("//a[normalize-space()='Men Tshirt']");
 By firstproductPrice=By.xpath("//td[@class='cart_price']//p[contains(text(),'Rs. 500')]");
 By secondproductPrice=By.xpath("//td[@class='cart_price']//p[contains(text(),'Rs. 400')]");
 By firstproductQuantity=By.xpath("//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']");
 By secondproductQuantity=By.xpath("//tr[@id='product-1']//button[@class='disabled'][normalize-space()='1']");
 By firstproductTotalprice=By.xpath("//p[@class='cart_total_price'][normalize-space()='Rs. 500']");
 By secondproductTotalprice=By.xpath("//p[@class='cart_total_price'][normalize-space()='Rs. 400']");
 SoftAssert softAssert=new SoftAssert();
 public AddProductInCart(WebDriver driver) {
	this.driver=driver; 
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed"); 
 }
 public void ClickOnProductOption() {
	driver.findElement(productBtn).click();	 
 }
 public void AddFirstProductInCart() {
	driver.findElement(firstProduct).click();
 }
 public void ClickContinueShoppingOption() {
	driver.findElement(continueShopping).click();
 }
 public void AddSecondProductInCart() {
	 driver.findElement(secondProduct).click();
 }
 public void ClickOnViewCartOption() {
	 driver.findElement(viewCart).click();
 }
 public void ValidateProductsAddedToCart() {
	 String actualText1 = driver.findElement(firstproductName).getText();
	 String expectedText1="Blue Top";
	 softAssert.assertEquals(actualText1, expectedText1,"Text is mismatched");
	 String actualText2 = driver.findElement(secondproductName).getText();
	 String expectedText2="Men Tshirt";
	 softAssert.assertEquals(actualText2, expectedText2,"Text is mismatched");
 } 
 public void ValidateFirstProductPrice() {
	 String actualText = driver.findElement(firstproductPrice).getText();
	 String expectedText="Rs. 500";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched"); 
 }
 public void ValidateSecondProductPrice() {
	 String actualText = driver.findElement(secondproductPrice).getText();
	 String expectedText="Rs. 400";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateFirstProductQuantity() {
	 String actualText = driver.findElement(firstproductQuantity).getText();
	 String expectedText="1";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateSecondProductQuantity() {
	 String actualText = driver.findElement(secondproductQuantity).getText();
	 String expectedText="1";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateFirstProductTotalPrice() {
	 String actualText = driver.findElement(firstproductTotalprice).getText();
	 String expectedText="Rs. 500";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateSecondProductTotalPrice() {
	 String actualText = driver.findElement(secondproductTotalprice).getText();
	 String expectedText="Rs. 400";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
}
