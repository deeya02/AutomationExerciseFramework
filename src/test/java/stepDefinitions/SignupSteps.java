package stepDefinitions;

import io.cucumber.java.en.*;
import pages.AccountPage;
import pages.HomePage;
import pages.SignupLoginPage;
import utilities.TestDataContext;


public class SignupSteps {
 HomePage homePage = new HomePage();
 
 SignupLoginPage signupLoginPage = new SignupLoginPage();
 
 AccountPage accountPage = new AccountPage();
 
 @Then("signup page should be visible")
 public void signup_page_should_be_visible() 
{ signupLoginPage.verifySignupPage(); }
 
 @When("user enters new signup details")
 public void user_enters_new_signup_details() {
 String uniqueEmail = "demo" + System.currentTimeMillis() + "@mail.com";
 TestDataContext.setEmail(uniqueEmail);
 signupLoginPage.enterSignupDetails("Demo User", uniqueEmail);
 signupLoginPage.clickSignup();
 }
 
 @When("user fills account information")
 public void user_fills_account_information() 
{ accountPage.fillAccountDetails(); }
 
 @When("user clicks create account")
 public void user_clicks_create_account() 
{ accountPage.clickCreateAccount(); }
 
 @Then("account should be created successfully")
 public void account_should_be_created_successfully() 
{ accountPage.verifyAccountCreated(); }
 
 @When("user enters existing signup email")
 public void user_enters_existing_signup_email() {
signupLoginPage.enterSignupDetails("Existing User", "test@example.com");
 signupLoginPage.clickSignup();
 }
 
 @Then("existing email error message should be visible")
 public void 
existing_email_error_message_should_be_visible() 
{ signupLoginPage.verifyExistingEmailError(); 
}
}