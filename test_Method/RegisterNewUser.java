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

public class RegisterNewUser {
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
	driver.get("https://automationexercise.com/");
 }
 @AfterMethod
 	public void afterMethod() {
	 driver.manage().window().minimize();
	 driver.quit();
 }
 @Test
 	public void SignupAndRegisterUser() {
	 try {
		 object.RegisterNewUser page = new object.RegisterNewUser(driver);
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
		 page.ValidationOfNewUserSignupTextVisible();
		 page.EnterUsername(usernameField);
		 page.EnterEmailAddress1(emailField);
		 page.ClickOnSignupBtn2();
		 page.ValidateTextEnterAccountInformation();
		 page.CheckGendercheckbox();
		 page.ValidateUsernamefieldPrefilledCorrectly();
		 page.ValidateEmailfieldPrefilledCorrectly();
		 page.EnterPassword(password);	
		 page.SelectDateOfBirth();
		 page.SelectCheckboxSignupforournewsletter();
		 page.SelectCheckboxReceivespecialoffersfromourpartners();
		 page.EnterFirstname(firstName);
		 page.EnterLastname(lastName);	
		 page.EnterCompanyname(companyName);
		 page.EnterAddress1(address1);	
		 page.EnterAddress2(address2);
		 page.SelectCountry();	
		 page.EnterStatename(state);
		 page.EnterCityname(city); 
		 page.EnterZipcode(zipCode);
		 page.EnterMobileno(mobileNo);
		 page.ClickOnCreateAccountBtn();
		 page.ValidateAccountCreatedVisible();
		 page.ClickOnContinueBtn();
		 page.ValidateUsernameVisibility();
		 page.clickOnDeleteAccountOption();
		 page.ValidateAccountDeletedVisible();
		 page.ClickOnContinueBtn2();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
}

