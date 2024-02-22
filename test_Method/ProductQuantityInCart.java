package test_Method;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductQuantityInCart {
 WebDriver driver;
 @BeforeMethod
 	public void beforeMethod() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	 	options.addExtensions(new File("D:\\Automation testing Class\\AdBlock-—-best-ad-blocker.crx")); 
	 	DesiredCapabilities capabilities = new DesiredCapabilities();
	 	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	 	options.merge(capabilities);
	 	driver = new ChromeDriver(options);
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get("http://automationexercise.com");
 }
 @AfterMethod
 	public void afterMethod() {
	 	driver.manage().window().minimize();
	 	driver.quit();
 }
 @Test
  	public void VerifyProductquantityInCart() {
	 	try {
			object.ProductQuantityInCart page = new object.ProductQuantityInCart(driver);
	 		page.ValidationOfHomepageVisibility();
	 		page.ClickOnProductOption();
	 		page.ClickOnViewProduct();
	 		page.ValidateProductDetails();
	 		page.IncreaseQuantityOfProduct("4");
	 		page.ClickOnAddToCartOption();
	 		page.ClickOnViewCartOption();
	 		page.ValidateProductDisplayInCartWithExactQuantity();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
 }
}
