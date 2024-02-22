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

public class VerifyAddressDetailsInCheckoutPage {
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
 	public void VerifyAddressdetailsInCheckoutPage() {
	 	try {
			object.VerifyAddressDetailsInCheckoutPage page = new object.VerifyAddressDetailsInCheckoutPage(driver);
	 		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Automation_Exercise\\src\\test\\java\\utils\\data.properties");
			Properties p = new Properties();
	 		p.load(fis);
	 		String usernameField = p.getProperty("username");
			String emailField = p.getProperty("Email.Address");
			String password = p.getProperty("password");
			String firstName = p.getProperty("first.name");
			String lastName = p.getProperty("last.name");
			String companyName = p.getProperty("company.name");
			String address1 = p.getProperty("address1");
			String address2 = p.getProperty("address2");
			String state = p.getProperty("state");
			String city = p.getProperty("city");
			String zipCode = p.getProperty("zipcode");
			String mobileNo = p.getProperty("mobile.no");
	 		page.ValidationOfHomepageVisibility();
	 		page.ClickOnSignupBtn();
	 		page.SignupAndCreateAccount(emailField, usernameField, usernameField, password, firstName, lastName, companyName, address1, address2, state, city, zipCode, mobileNo);
	 		page.ValidateAccountCreatedVisible();
	 		page.ValidateUsernameVisibility();
	 		page.AddProductToCart();
	 		page.ClickOnCartOption();
	 		page.ValidateCartPageVisible();
	 		page.ClickProceedToCheckoutOption();
	 		page.ValidateDeliveryAddress();
	 		page.ValidateBillingAddress();
	 		page.DeleteAccount();
	 		page.ValidateAccountDeletedText();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
 }	
}
