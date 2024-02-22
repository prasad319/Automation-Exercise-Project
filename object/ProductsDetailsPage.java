package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ProductsDetailsPage {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By productBtn=By.xpath("//a[@href='/products']");
 By productPage=By.xpath("//h2[normalize-space()='All Products']");
 By viewProduct=By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
 By productName=By.xpath("//h2[normalize-space()='Blue Top']");
 By productCategory=By.xpath("//p[normalize-space()='Category: Women > Tops']");
 By productPrice=By.xpath("//span[normalize-space()='Rs. 500']");
 By productAvailability=By.xpath("//b[normalize-space()='Availability:']");
 By productCondition=By.xpath("//b[normalize-space()='Condition:']");
 By productBrand=By.xpath("//b[normalize-space()='Brand:']");
 SoftAssert softAssert=new SoftAssert();
 public ProductsDetailsPage(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed"); 
 }
 public void ClickOnProductOption() {
	 driver.findElement(productBtn).click();
 }
 public void ValidateUserNavigatedToAllProductsPage() {
	 boolean isDisplayed = driver.findElement(productPage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The product page is not displyed ");
 }
 public void ClickOnViewProduct() {
	 driver.findElement(viewProduct).click();
 }
 public void ValidateProductName() {
	 boolean isDisplayed = driver.findElement(productName).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "Product name is not displayed");
 }
 public void ValidateProductCategory() {
	 boolean isDisplayed = driver.findElement(productCategory).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "Product category is not displyed");
 }
 public void ValidateProductPrice() {
	 boolean isDisplayed = driver.findElement(productPrice).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "Product price is not displyed");
 }
 public void ValidateProductAvailability() {
	 boolean isDisplayed = driver.findElement(productAvailability).isDisplayed();
	 softAssert.assertTrue(isDisplayed,"Product availability is not displyed");
 }
 public void ValidateProductCondition() {
	boolean isDisplayed = driver.findElement(productCondition).isDisplayed(); 
	softAssert.assertTrue(isDisplayed, "Product condition is not displayed");
 }
 public void ValidateProductBrand() {
	boolean isDisplayed = driver.findElement(productBrand).isDisplayed();
	softAssert.assertTrue(isDisplayed, "Product brand is displayed");
 } 
}
