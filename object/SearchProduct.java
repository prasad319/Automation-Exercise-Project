package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SearchProduct {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By productBtn=By.xpath("//a[@href='/products']");
 By productPage=By.xpath("//h2[normalize-space()='All Products']");
 By searchBar=By.xpath("//input[@id='search_product']");
 By searchBtn=By.xpath("//i[@class='fa fa-search']");
 By searchedProducts=By.xpath("//h2[normalize-space()='Searched Products']");
 SoftAssert softAssert=new SoftAssert();
 public SearchProduct(WebDriver driver) {
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
 public void EnterProductname(String ProductnameInput) {
	 driver.findElement(searchBar).sendKeys(ProductnameInput);
 }
 public void ClickOnSearchBtn() {
	driver.findElement(searchBtn).click();
 }
 public void ValidateSearchedProductsVisible() {
	 String actualText = driver.findElement(searchedProducts).getText();
	 String expectedText="SEARCHED PRODUCTS";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched"); 
 }
}

