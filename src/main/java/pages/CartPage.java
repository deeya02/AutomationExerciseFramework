package pages;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.DriverFactory;
import utilities.WaitUtils;

public class CartPage {

    WebDriver driver = DriverFactory.getDriver();

    By productsButton =
            By.xpath("//a[@href='/products']");

    By firstProduct =
            By.xpath("(//div[@class='product-image-wrapper'])[1]");

    By firstAddToCartButton =
            By.xpath("(//a[@data-product-id='1'])[1]");

    By continueShoppingButton =
            By.xpath("//button[contains(text(),'Continue Shopping')]");

    By cartButton =
            By.xpath("//a[@href='/view_cart']");

    By cartPageText =
            By.xpath("//li[contains(text(),'Shopping Cart')]");

    By productInCart =
            By.xpath("//td[@class='cart_description']");

    By proceedToCheckoutButton =
            By.xpath("//a[contains(@class,'Check_out')]");

    public void clickProducts() {

        WaitUtils.clickable(productsButton).click();
    }

    public void addFirstProductToCart() {

        WebElement product =
                WaitUtils.visible(firstProduct);

        Actions actions = new Actions(driver);

        actions.moveToElement(product).perform();

        WebElement addToCart =
                WaitUtils.visible(firstAddToCartButton);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                addToCart
        );
    }

    public void clickContinueShopping() {
    	WebElement continueBtn= WaitUtils.visible(continueShoppingButton);

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click;", continueBtn);
    }

    public void clickCart() {

        WebElement cart = WaitUtils.visible(cartButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", cart);
    }

    public void verifyCartPageDisplayed() {

        Assert.assertTrue(
                WaitUtils.visible(cartPageText).isDisplayed());
    }

    public void verifyProductAdded() {

        Assert.assertTrue(
                WaitUtils.visible(productInCart).isDisplayed()
        );
    }

    public void clickProceedToCheckout() {

        WebElement checkout = WaitUtils.visible(proceedToCheckoutButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", checkout);
        js.executeScript("arguments[0].click();", checkout);
    }
}