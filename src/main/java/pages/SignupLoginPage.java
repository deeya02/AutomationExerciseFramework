package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.DriverFactory;
import utilities.WaitUtils;

public class SignupLoginPage {
	 WebDriver driver = DriverFactory.getDriver();
	 By signupName = By.name("name");
	 By signupEmail = By.xpath("//input[@data-qa='signup-email']");
	 By signupButton = By.xpath("//button[@data-qa='signup-button']");
	 By loginEmail = By.xpath("//input[@data-qa='login-email']");
	 By loginPassword = By.xpath("//input[@data-qa='login-password']");
	 By loginButton = By.xpath("//button[@data-qa='login-button']");
	 By loginError = By.xpath("//p[contains(text(),'Your email or password is incorrect')]");
	 By existingEmailError = By.xpath("//p[contains(text(),'Email Address already exist!')]");
	 By newUserSignUp = By.xpath("//h2[contains(text(),'New User Signup!')]");
	 
	 public void verifySignupPage() 
	{ 
		 Assert.assertTrue(WaitUtils.visible(newUserSignUp).isDisplayed()); }
	 
	 public void enterSignupDetails(String name, String email) 
	{ 
		 WaitUtils.visible(signupName).sendKeys(name); 
	WaitUtils.visible(signupEmail).sendKeys(email); }
	 
	 public void clickSignup() 
	{ WaitUtils.clickable(signupButton).click(); }
	 
	 public void enterLoginDetails(String email, String password) 
	{ 
		 WaitUtils.visible(loginEmail).clear();
		 WaitUtils.visible(loginEmail).sendKeys(email); 
		 WaitUtils.visible(loginPassword).clear();
	WaitUtils.visible(loginPassword).sendKeys(password); 
	WaitUtils.clickable(loginButton).click();
	}
	 public void clickLogin() {
		 WaitUtils.clickable(loginButton).click();
	 }
	 public void verifyLoginError() 
	{ 
		 Assert.assertTrue(WaitUtils.visible(loginError).isDisplayed()); }
	 
	 public void verifyExistingEmailError() 
	{ 
		 Assert.assertTrue(WaitUtils.visible(existingEmailError).isDisplayed()); }
	 
	 public void verifySuccessfulLogin() {
		 Assert.assertTrue(WaitUtils.visible(newUserSignUp).isDisplayed());
	 }
	}