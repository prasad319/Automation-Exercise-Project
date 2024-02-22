package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class RegisterNewUser {
 WebDriver driver;
 By homepage=By.xpath("//a[normalize-space()='Home']");
 By signupBtn=By.xpath("//a[normalize-space()='Signup / Login']");
 By newsignupuserText=By.xpath("//h2[normalize-space()='New User Signup!']");
 By usernameField=By.name("name");
 By emailAddressField=By.xpath("//input[@data-qa='signup-email']");
 By signupBtn2=By.xpath("//button[normalize-space()='Signup']");
 By enterAccountInfo=By.xpath("//b[normalize-space()='Enter Account Information']");
 By checkbox1=By.xpath("//input[@id='id_gender1']");
 By name=By.xpath("//input[@id='name']");
 By emailAddress=By.xpath("//input[@id='email']");
 By password=By.xpath("//input[@id='password']");
 By day=By.xpath("//select[@id='days']");
 By month=By.xpath("//select[@id='months']");
 By year=By.xpath("//select[@id='years']");
 By checkbox2=By.xpath("//input[@id='newsletter']");
 By checkbox3=By.xpath("//input[@id='optin']");
 By firstName=By.xpath("//input[@id='first_name']");
 By lastName=By.xpath("//input[@id='last_name']");
 By companyName=By.xpath("//input[@id='company']");
 By address1=By.xpath("//input[@id='address1']");
 By address2=By.xpath("//input[@id='address2']");
 By country=By.xpath("//select[@id='country']");
 By state=By.xpath("//input[@id='state']");
 By city=By.xpath("//input[@id='city']");
 By zipcode=By.xpath("//input[@id='zipcode']");
 By mobileNumber=By.xpath("//input[@id='mobile_number']");
 By createaccountBtn=By.xpath("//button[normalize-space()='Create Account']");
 By accountCreated=By.xpath("//b[normalize-space()='Account Created!']");
 By continueBtn=By.xpath("//a[normalize-space()='Continue']");
 By username=By.xpath("//b[normalize-space()='Admin319']");
 By deleteOption=By.xpath("//a[normalize-space()='Delete Account']");
 By accountDelete=By.xpath("//b[normalize-space()='Account Deleted!']");
 By continueBtn2=By.xpath("//a[normalize-space()='Continue']"); 
 SoftAssert softAssert=new SoftAssert();
 public RegisterNewUser(WebDriver driver) {
	this.driver=driver;
 }
 public void ValidationOfHomepageVisibility() {
	 boolean isDisplayed = driver.findElement(homepage).isDisplayed();
	 softAssert.assertTrue(isDisplayed, "The home page is not displyed");
 }
 public void ClickOnSignupBtn() {
	  driver.findElement(signupBtn).click();  
 }
 public void ValidationOfNewUserSignupTextVisible() {
	 String actualText = driver.findElement(newsignupuserText).getText();
	 String expectedText="New User Signup!";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void EnterUsername(String usernameInput)    {
	 driver.findElement(usernameField).sendKeys(usernameInput); 
 }
 public void EnterEmailAddress1(String emailAddressInput)  {
  driver.findElement(emailAddressField).sendKeys(emailAddressInput); 
 }
 public void ClickOnSignupBtn2()  {
  driver.findElement(signupBtn2).click();
 }
 public void ValidateTextEnterAccountInformation() {
	String actualText = driver.findElement(enterAccountInfo).getText();
	String expectedText="ENTER ACCOUNT INFORMATION";
	softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateUsernamefieldPrefilledCorrectly() {
	 String actualText = driver.findElement(name).getAttribute("value");
	 String expectedText="admin319";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateEmailfieldPrefilledCorrectly() {
	 String actualText = driver.findElement(emailAddress).getAttribute("value");
	 String expectedText="admin319@gmail.com";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void CheckGendercheckbox()  {
	driver.findElement(checkbox1).click();
 }
 public void EnterName(String nameInput )  {
	driver.findElement(name).sendKeys(nameInput);
 }
 public void EnterEmailAddress2(String emailInput) {
	driver.findElement(emailAddress).sendKeys(emailInput);
 }
 public void EnterPassword(String passwordInput) {
	driver.findElement(password).sendKeys(passwordInput);	
 }
 public void SelectDateOfBirth() {
	WebElement dropDown1 = driver.findElement(day);
	Select select1 = new Select(dropDown1);
	select1.selectByIndex(17);
	WebElement dropdown2 = driver.findElement(month);
	Select select2 = new Select(dropdown2);
	select2.selectByVisibleText("April");
	WebElement dropDown3 = driver.findElement(year);
	Select select3 = new Select(dropDown3);
	select3.selectByIndex(11);
 }
 public void SelectCheckboxSignupforournewsletter() {
	driver.findElement(checkbox2).click();
 }
 public void SelectCheckboxReceivespecialoffersfromourpartners() {
	driver.findElement(checkbox3).click();
 }
 public void EnterFirstname(String FirstnameInput) {
	driver.findElement(firstName).sendKeys(FirstnameInput);
 }
 public void EnterLastname(String LastnameInput) {
	driver.findElement(lastName).sendKeys(LastnameInput);
 }
 public void EnterCompanyname(String CompanynameInput) {
	driver.findElement(companyName).sendKeys(CompanynameInput);
 }
 public void EnterAddress1(String Address1Input) {
	driver.findElement(address1).sendKeys(Address1Input);
 }
 public void EnterAddress2(String Address2Input) {
	driver.findElement(address2).sendKeys(Address2Input);
 }
 public void SelectCountry() {
	WebElement dropDown = driver.findElement(country);
	Select select = new Select(dropDown);
	select.selectByIndex(0);
 }
 public void EnterStatename(String StateInput) {
	driver.findElement(state).sendKeys(StateInput);
 }
 public void EnterCityname(String CityInput) {
	driver.findElement(city).sendKeys(CityInput);
 }
 public void EnterZipcode(String ZipcodeInput) {
	driver.findElement(zipcode).sendKeys(ZipcodeInput);
 }
 public void EnterMobileno(String MobilenoInput) {
	driver.findElement(mobileNumber).sendKeys(MobilenoInput);
 }
 public void ClickOnCreateAccountBtn() {
	driver.findElement(createaccountBtn).click();
 }
 public void ValidateAccountCreatedVisible() {
	String actualText = driver.findElement(accountCreated).getText();
	String expectedText="ACCOUNT CREATED!";
	softAssert.assertEquals(actualText, expectedText,"Text is mismatched");	
 }
 public void ClickOnContinueBtn() {
	driver.findElement(continueBtn).click();
 }
 public void ValidateUsernameVisibility() {
	 String actualText = driver.findElement(username).getText();
	 String expectedText="admin319";
	 softAssert.assertEquals(actualText, expectedText,"Username is mismatched");
 }
 public void clickOnDeleteAccountOption() {
	 driver.findElement(deleteOption).click();
 }
 public void ValidateAccountDeletedVisible() {
	 String actualText = driver.findElement(accountDelete).getText();
	 String expectedText="ACCOUNT DELETED!";
	 softAssert.assertEquals(actualText, expectedText,"Text is mismatched"); 
 }
 public void ClickOnContinueBtn2() {
	 driver.findElement(continueBtn2).click();
 }
}
