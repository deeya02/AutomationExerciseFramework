package pages;

import utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.File;

public class ContactusPage {
 WebDriver driver = DriverFactory.getDriver();
 By getInTouch = By.xpath("//h2[contains(text(),'Get In Touch')]");
 By name = By.name("name");
 By email = By.name("email");
 By subject = By.name("subject");
 By message = By.id("message");
 By uploadFile = By.name("upload_file");
 By submit = By.name("submit");
 By success = By.xpath("//div[contains(text(),'Success')]");
 
 public void verifyContactPage() 
{ Assert.assertTrue(driver.findElement(getInTouch).isDisplayed(
)); }
 
 public void fillContactForm() {
 driver.findElement(name).sendKeys("Demo User");
 driver.findElement(email).sendKeys("demo@example.com");
 driver.findElement(subject).sendKeys("Automation Project");
 driver.findElement(message).sendKeys("This is a Selenium automation test.");
 }
 
 public void uploadFile() throws Exception {
 File file = new File("contact-upload.txt");
 if (!file.exists()) 
java.nio.file.Files.write(file.toPath(), "Demo upload file".getBytes());
 
driver.findElement(uploadFile).sendKeys(file.getAbsolutePath())
;
 }
 public void submitForm() 
{ driver.findElement(submit).click();
driver.switchTo().alert().accept(); }
 
 public void verifySuccessMessage() 
{ Assert.assertTrue(driver.findElement(success).getText().contains("Success")); }
}