package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
//import pages.SignupLoginPage;
import pages.CartPage;
import pages.CheckoutPage;
//import utilities.WaitUtils;

public class CheckoutSteps {
	CartPage cartPage = new CartPage();

    CheckoutPage checkout =
            new CheckoutPage();
    //SignupLoginPage signupLoginPage = new SignupLoginPage();
    
    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
    	//cartPage.clickCart();
    	cartPage.clickProceedToCheckout();
    }
    @Then("checkout page should be loaded")
    public void checkout_page_should_be_loaded() {

        checkout.verifyCheckoutPageLoaded();
    }

    @When("user places order")
    public void user_places_order() {

        checkout.clickPlaceOrder();
    }

    @When("user enters payment details")
    public void user_enters_payment_details() {

        checkout.enterPaymentDetails();
    }

    @When("user confirms payment")
    public void user_confirms_payment() {

        checkout.clickPay();
    }

    @Then("order should be placed successfully")
    public void order_should_be_placed_successfully() {
    	checkout.verifyOrderPlaced();
    }
}