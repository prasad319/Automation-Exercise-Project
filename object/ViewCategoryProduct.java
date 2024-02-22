package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ViewCategoryProduct {
 WebDriver driver;
 By category=By.xpath("//h2[normalize-space()='Category']");
 By womenCategory=By.xpath("//a[normalize-space()='Women']");
 By sareeLink=By.xpath("//a[normalize-space()='Saree']");
 By womenCategoryPage=By.xpath("//h2[normalize-space()='Women - Saree Products']");
 By womenProducts=By.xpath("//li[@class='active']");
 By menCategory=By.xpath("//a[normalize-space()='Men']");
 By jeansLink=By.xpath("//a[normalize-space()='Jeans']");
 By mensCategoryPage=By.xpath("//li[@class='active']");
 SoftAssert softAssert=new SoftAssert();
 public ViewCategoryProduct(WebDriver driver) {
	 this.driver=driver;
 }
 public void ValidateIsCategoryVisible() {
	 String actualText = driver.findElement(category).getText();
	 String expectedText="Category";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnWomenCategory() {
	 driver.findElement(womenCategory).click();
 }
 public void ClickOnLink() {
	 driver.findElement(sareeLink).click();
 }
 public void ValidateWomenCategoryPageDisplayed() {
	 boolean isDisplayed = driver.findElement(womenCategoryPage).isDisplayed();
	 softAssert.assertEquals(isDisplayed, "Page is not displayed");
 }
 public void ValidateWomenProductsText() {
	 String actualText = driver.findElement(womenProducts).getText();
	 String expectedText="Women - Saree Products";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ClickOnMenCategoryLink() {
	 driver.findElement(menCategory).click();
	 driver.findElement(jeansLink).click();
 }
 public void ValidateMenCategoryPageVisible() {
	 boolean isDisplayed = driver.findElement(mensCategoryPage).isDisplayed();
	 softAssert.assertEquals(isDisplayed, "Page is not displayed");
 }
}
