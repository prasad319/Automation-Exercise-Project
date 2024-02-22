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

public class ViewAndCartBrandProduct {
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
 	public void ViewAndCartBrandProducts() {
	 	try {
			object.ViewAndCartBrandProduct page = new object.ViewAndCartBrandProduct(driver);
			page.ClickOnProductOption();
			page.ValidateBrandTextVisibility();
			page.ClickOnBrandName();
			page.ValidateBrandPageVisibility();
			page.ValidateBrandProductsText();
			page.ClickOnBrandLink();
			page.ValidateBrandLinkPageVisibility();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 
 
 
 
 
 
 
 
 
 
 
 
 




}
