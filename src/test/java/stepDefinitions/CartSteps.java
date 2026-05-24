package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @When("User clicks products button")
    public void user_clicks_products_button() {
        cartPage.clickProducts();
    }

    @When("User adds first product to cart")
    public void user_adds_first_product_to_cart() {
        cartPage.addFirstProductToCart();
    }

    @When("User clicks continue shopping")
    public void user_clicks_continue_shopping() {
        cartPage.clickContinueShopping();
    }

    @When("User clicks cart button")
    public void user_clicks_cart_button() {
        cartPage.clickCart();
    }

    @Then("Cart page should be displayed")
    public void cart_page_should_be_displayed() {
        cartPage.verifyCartPageDisplayed();
    }

    @Then("Product should be added to cart")
    public void product_should_be_added_to_cart() {
        cartPage.verifyProductAdded();
    }

    @When("User clicks proceed to checkout")
    public void user_clicks_proceed_to_checkout() {
        cartPage.clickProceedToCheckout();
    }
}