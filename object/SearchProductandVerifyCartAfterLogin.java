package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SearchProductandVerifyCartAfterLogin {
 WebDriver driver;
 By productOption=By.xpath("//a[@href='/products']");
 By productPage=By.xpath("//h2[normalize-space()='All Products']");
 By searchBar=By.xpath("//input[@id='search_product']");
 By searchBtn=By.xpath("//button[@id='submit_search']");
 By searchedproduct=By.xpath("//h2[normalize-space()='Searched Products']");
 By productName1=By.xpath("//div[@class='productinfo text-center']//p[contains(text(),'Men Tshirt')]");
 By addProductToCart=By.xpath("//div[@class='productinfo text-center']//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart']");
 By viewCart=By.xpath("//u[normalize-space()='View Cart']");
 By productName2=By.xpath("//a[normalize-space()='Men Tshirt']");
 By signupLoginBtn=By.xpath("//a[normalize-space()='Signup / Login']");
 By emailField=By.xpath("//input[@data-qa='login-email']");
 By passwordField=By.xpath("//input[@placeholder='Password']");
 By loginBtn=By.xpath("//button[normalize-space()='Login']");
 By cartOption=By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
 SoftAssert softAssert=new SoftAssert();
 public SearchProductandVerifyCartAfterLogin(WebDriver driver) {
	this.driver=driver; 
 } 
 public void ClickOnproductOption() {
	 driver.findElement(productOption).click();
 }
 public void ValidateAllProductPageVisible() {
	 boolean isDisplayed = driver.findElement(productPage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "Page is not displayed");
 } 
 public void EnterProductName(String productnameInput) {
	 driver.findElement(searchBar).sendKeys(productnameInput);
 }
 public void ClickOnSearchBtn() {
	 driver.findElement(searchBtn).click();
 }
 public void ValidateSearchProductTextVisible() {
	 String actualText = driver.findElement(searchedproduct).getText();
	 String expectedText="Searched Products";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateAllProduct() {
	 String actualText = driver.findElement(productName1).getText();
	 String expectedText="Men Tshirt";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnAddProductToCart() {
	 driver.findElement(addProductToCart).click();
 }
 public void ClickOnCartButton() {
	 driver.findElement(viewCart).click();
 }
 public void ValidateAllProductsVisibleInCart() {
	 String actualText = driver.findElement(productName2).getText();
	 String expectedText="Men Tshirt";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnSignupLoginOption() {
	 driver.findElement(signupLoginBtn).click();
 }
 public void EnterEmail(String emailInput) {
	 driver.findElement(emailField).sendKeys(emailInput);
 }
 public void EnterPassword(String passwordInput) {
	 driver.findElement(passwordField).sendKeys(passwordInput);
 }
 public void ClickOnLoginBtn() {
	 driver.findElement(loginBtn).click();
 }
 public void ClickOnCartOptionAgain() {
	 driver.findElement(cartOption).click();
 }
 public void ValidateProductVisibleInCartAfterLogin() {
	 String actualText = driver.findElement(productName2).getText();
	 String expectedText="Men Tshirt";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }	
}
