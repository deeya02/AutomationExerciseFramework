package stepDefinitions;

import pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps {
	HomePage homePage = new HomePage();

    @Given("user launches Automation Exercise website")
    public void user_launches_website() {

        homePage.openHomePage();
        homePage.verifyHomePage();
    }
    
    @When("user opens signup login page")
    public void user_opens_signup_login_page() {
    	homePage.clickSignupLogin();
    }
}