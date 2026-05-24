package pages;

import utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.WaitUtils;

public class CheckoutPage {
 WebDriver driver = DriverFactory.getDriver();
 By addressDetails = By.xpath("//h2[contains(text(),'Address Details')]");
 By reviewOrder = By.xpath("//h2[contains(text(),'Review Your Order')]");
 By message = By.name("message");
 By placeOrder = By.xpath("//a[contains(text(),'Place Order')]");
 By nameOnCard = By.name("name_on_card");
 By cardNumber = By.name("card_number");
 By cvc = By.name("cvc");
 By expiryMonth = By.name("expiry_month");
 By expiryYear = By.name("expiry_year");
 By payButton = By.id("submit");
 By orderPlaced = By.xpath("//b[contains(text(),'Order Placed!')]");
 
 public void verifyCheckoutPageLoaded() {
	 Assert.assertTrue(WaitUtils.visible(addressDetails).isDisplayed());
	 Assert.assertTrue(WaitUtils.visible(reviewOrder).isDisplayed());
 }
 /*public void verifyAddressDetails() 
{ Assert.assertTrue(driver.findElement(addressDetails).isDisplayed()); }
 
 public void verifyOrderReview() 
{ Assert.assertTrue(driver.findElement(reviewOrder).isDisplayed
()); }*/
 
 public void enterComment() 
{ WaitUtils.visible(message).sendKeys("Please deliver quickly."); }
 
 public void clickPlaceOrder() 
{ 
	 WaitUtils.visible(reviewOrder);
	 
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,500)");
	 js.executeScript("arguments[0].click();", WaitUtils.clickable(placeOrder));}
 
 public void enterPaymentDetails() {
 WaitUtils.visible(nameOnCard).sendKeys("Demo User");
 
 WaitUtils.visible(cardNumber).sendKeys("4111111111111111");
 WaitUtils.visible(cvc).sendKeys("123");
 WaitUtils.visible(expiryMonth).sendKeys("12");
 WaitUtils.visible(expiryYear).sendKeys("2030");
}
 
 public void clickPay() 
{ JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", WaitUtils.clickable(payButton));
 }
 
 public void verifyOrderPlaced() 
{ 
	 Assert.assertTrue(WaitUtils.visible(orderPlaced).isDisplayed()); }
 
 
}