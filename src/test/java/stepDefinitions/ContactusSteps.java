package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.ContactusPage;
import pages.HomePage;
//import utilities.DriverFactory;

public class ContactusSteps {

    HomePage home =
            new HomePage();

    ContactusPage contact =
            new ContactusPage();

    @When("user opens contact us page")
    public void user_opens_contact_us_page() {

        home.clickContactUs();
    }
    
    @Then("contact forms should be visible")
    public void contact_forms_should_be_visible() {
    	contact.verifyContactPage();
    }

    @When("user submits contact form with valid data")
    public void user_submits_contact_form_with_valid_data() throws Exception{

        contact.fillContactForm();
        contact.uploadFile();
    	contact.submitForm();
        
    }

    @Then("contact success message should be visible")
    public void contact_success_message_should_be_visible() {

        contact.verifySuccessMessage();
    }
}
