package test_Method;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubscriptionCartPage {
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
 	public void VerifySubscriptionInCartPage() {
	try {
		object.SubscriptionCartPage page = new object.SubscriptionCartPage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Automation_Exercise\\src\\test\\java\\utils\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		String email = p.getProperty("Email.Address");
		page.ValidationOfHomepageVisibility();
		page.ClickOnCartOption();
		page.ValidateSubsriptionText();
		page.EnterEmail(email);
		page.ClickOnArrowBtn();
		page.ValidateSuccessMessage();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 	 
 }	
}
