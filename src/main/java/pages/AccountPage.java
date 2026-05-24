package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.DriverFactory;
import utilities.WaitUtils;
//import org.testng.Assert;

public class AccountPage {

    WebDriver driver = DriverFactory.getDriver();

    By mrtitle =
            By.id("id_gender1");

    By password =
            By.id("password");

    By days =
            By.id("days");

    By months =
            By.id("months");

    By years =
            By.id("years");

    By firstName =
            By.id("first_name");

    By lastName =
            By.id("last_name");
    By company = By.id("company");

    By address =
            By.id("address1");

    By country =
            By.id("country");

    By state =
            By.id("state");

    By city =
            By.id("city");

    By zipcode =
            By.id("zipcode");

    By mobileNumber =
            By.id("mobile_number");

    By createAccountButton =
            By.xpath("//button[@data-qa='create-account']");
    By accountCreated = By.xpath("//h2[@data-qa='account-created']");
    By continueButton =
            By.cssSelector("a[data-qa='continue-button']");

   // By deleteAccount =
            //By.xpath("//a[contains(text(),'Delete Account')]");

    //By logout =
           // By.xpath("//a[contains(text(),'Logout')]");

    public void fillAccountDetails() {

        WaitUtils.clickable(mrtitle).click();

        WaitUtils.visible(password).sendKeys("Password@123");

        Select day = new Select(driver.findElement(days));
        day.selectByValue("1");
        
        Select month = new Select(driver.findElement(months));
        month.selectByVisibleText("January");
        
        Select year = new Select(driver.findElement(years));
        year.selectByValue("2000");

        driver.findElement(firstName)
        .sendKeys("Deeya");

        driver.findElement(lastName)
        .sendKeys("Agarwal");
        
        driver.findElement(company).sendKeys("Student Project");
        
        driver.findElement(address)
        .sendKeys("Lucknow");

        driver.findElement(country)
        .sendKeys("India");

        driver.findElement(state)
        .sendKeys("Uttar Pradesh");

        driver.findElement(city)
        .sendKeys("Lucknow");

        driver.findElement(zipcode)
        .sendKeys("226001");

        driver.findElement(mobileNumber)
        .sendKeys("9876543210");

    }
    public void clickCreateAccount() {
    	WebElement button = WaitUtils.visible(createAccountButton);
    	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",button);
    	
    	((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);
    }
    public void verifyAccountCreated() {
    	Assert.assertTrue(WaitUtils.visible(accountCreated).isDisplayed());
    }

    public void clickContinue() {

        WaitUtils.clickable(continueButton).click();
    }

   /* public void clickDeleteAccount() {

        driver.findElement(deleteAccount)
                .click();
    }*/
}