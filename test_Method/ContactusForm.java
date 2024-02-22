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

public class ContactusForm {
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
 	public void FillContactUsForm() {
	 	try {
	 		object.ContactusForm page = new object.ContactusForm(driver);
		 	FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Automation_Exercise\\src\\test\\java\\utils\\data.properties");
		 	Properties p = new Properties();
		 	p.load(fis);
		 	String name = p.getProperty("username");
		 	String email = p.getProperty("Email.Address");
		 	String subject = p.getProperty("subject");
		 	String message = p.getProperty("Message");
		 	page.ValidationOfHomepageVisibility();
		 	page.ClickOnContactUsOption();
		 	page.ValidateGetInTouchText();
		 	page.Entername(name);
		 	page.Enteremail(email);
		 	page.WriteSubject(subject);
		 	page.WriteMessage(message);
		 	page.UploadFile();
		 	page.ClickOnSubmitBtn();
		 	Thread.sleep(3000);
		 	page.ClickOnOkBtn();
		 	page.ClickOnHomeBtn();
		 	page.ValidationOfHomepageVisibility();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 	
 }
}
