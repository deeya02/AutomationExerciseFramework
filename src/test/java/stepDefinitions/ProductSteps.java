package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class ProductSteps {
 HomePage homePage = new HomePage();
 ProductPage productsPage = new ProductPage();
 CartPage cartPage = new CartPage();
 
 @When("user opens products page")
 public void user_opens_products_page() 
{ homePage.clickProducts(); }
 
 @When("user searches product {string}")
 public void user_searches_product(String keyword) 
{ productsPage.searchProduct(keyword); }
 
 @Then("searched products should be displayed")
 public void searched_products_should_be_displayed() 
{ productsPage.verifySearchResults(); }
 
 @When("user opens first product details")
 public void user_opens_first_product_details() 
{ productsPage.openFirstProductDetails(); }
 
 @Then("product details should be visible")
 public void product_details_should_be_visible() 
{ productsPage.verifyProductDetails(); }
 
/* @When("user adds first product to cart")
 public void user_adds_first_product_to_cart() 
{ productsPage.addFirstProductToCart(); }
 
 @When("user opens cart from modal")
 public void user_opens_cart_from_modal() 
{ productsPage.clickViewCartFromModal(); }
 
 @Then("product should be added in cart")
 public void product_should_be_added_in_cart() 
{ cartPage.verifyProductInCart(); }*/
 
 @When("user filters products by women dress category")
public void user_filters_products_by_women_dress_category() 
{ productsPage.selectWomenDressCategory(); }
 
 @Then("category filtered products should be displayed")
 public void 
category_filtered_products_should_be_displayed() 
{ productsPage.verifyCategoryFiltered(); }
}