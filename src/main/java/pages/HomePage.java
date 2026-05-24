package pages;

import utilities.DriverFactory;
import utilities.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ConfigReader;

public class HomePage {
WebDriver driver = DriverFactory.getDriver();
 By signupLoginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
 By productsLink = By.cssSelector("a[href='/products']");
 By cartLink = By.cssSelector("a[href='/view_cart']");
 By contactUsLink = By.xpath("//a[contains(text(),'Contact us')]");
 By logoutLink = By.xpath("//a[contains(text(),'Logout')]");
 By deleteAccountLink = By.xpath("//a[contains(text(),'Delete Account')]");
 By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
 
 public void openHomePage() {
	 driver.get(ConfigReader.BASE_URL);
 }
public void verifyHomePage() 
{ 
	 Assert.assertTrue(driver.getTitle().contains("Automation Exercise")); }
 
 public void clickSignupLogin() 
{ WaitUtils.clickable(signupLoginLink).click(); }
 
 public void clickProducts() 
{ WaitUtils.clickable(productsLink).click(); }
 
 public void clickCart() 
{ WaitUtils.clickable(cartLink).click(); }
 
 public void clickContactUs() 
{ WaitUtils.clickable(contactUsLink).click(); }
 
 public void clickLogout() 
{WaitUtils.clickable(logoutLink).click(); }
 
 public void deleteAccountIfVisible() { if (!driver.findElements(deleteAccountLink).isEmpty()) {
driver.findElement(deleteAccountLink).click(); }
 }
 
 public boolean isLoggedIn() { 
	 return WaitUtils.visible(loggedInText).isDisplayed(); }
}