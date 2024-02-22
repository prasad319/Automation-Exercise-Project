package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ViewAndCartBrandProduct {
 WebDriver driver;
 By productOption=By.xpath("//a[@href='/products']");
 By brandText=By.xpath("//h2[normalize-space()='Brands']");          
 By brandname=By.xpath("//a[@href='/brand_products/Polo']");
 By brandPage=By.xpath("//li[@class='active']");
 By brandProductText=By.xpath("//h2[@class=\"title text-center\"]");
 By brandLink=By.xpath("//a[@href='/brand_products/H&M']");
 By brandLinkPage=By.xpath("//li[@class='active']"); 
 SoftAssert softAssert=new SoftAssert();
 public ViewAndCartBrandProduct(WebDriver driver) {
	 this.driver=driver;
 }
 public void ClickOnProductOption() {
	 driver.findElement(productOption).click();
 }
 public void ValidateBrandTextVisibility() {
	 String actualText = driver.findElement(brandText).getText();
	 String expectedText="Brands";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnBrandName() {
	 driver.findElement(brandname).click();
 }
 public void ValidateBrandPageVisibility() {
	 boolean isDisplayed = driver.findElement(brandPage).isDisplayed();
	 softAssert.assertTrue(isDisplayed,"Brand page is not displayed");
 }
 public void ValidateBrandProductsText() {
	 String actualText = driver.findElement(brandProductText).getText();
	 String expectedText="BRAND - POLO PRODUCTS";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnBrandLink() {
	 driver.findElement(brandLink).click();
 }
 public void ValidateBrandLinkPageVisibility() {
	 boolean isDisplayed = driver.findElement(brandLinkPage).isDisplayed();
	 softAssert.assertTrue(isDisplayed,"Page is not displayed");
 }
}
