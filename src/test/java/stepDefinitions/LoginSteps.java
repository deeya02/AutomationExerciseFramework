package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;
import pages.SignupLoginPage;
import utilities.ConfigReader;
import utilities.TestDataContext;

public class LoginSteps {
 HomePage homePage = new HomePage();
 SignupLoginPage signupLoginPage = new SignupLoginPage();
 
 @When("user logs in with valid credentials")
 public void user_logs_in_with_valid_credentials() {
	 homePage.clickSignupLogin();
 String email;
 if(TestDataContext.getEmail() != null ) {
	 email = TestDataContext.getEmail();
 }
 else {
	 email = ConfigReader.VALID_EMAIL;
 }
 signupLoginPage.enterLoginDetails(email, ConfigReader.VALID_PASSWORD);
 }
 
 @When("user logs in with invalid credentials")
 public void user_logs_in_with_invalid_credentials() {
	 homePage.clickSignupLogin();
 signupLoginPage.enterLoginDetails("wrong@gmail.com", "wrongpass");
 signupLoginPage.clickLogin();
 }
 
 @Then("login error message should be visible")
 public void login_error_message_should_be_visible() 
{ signupLoginPage.verifyLoginError(); }
 
 @Then("user should be logged in")
 public void user_should_be_logged_in() 
{ //signupLoginPage.verifySuccessfulLogin(); 
Assert.assertTrue(homePage.isLoggedIn());	 
}
}
 
