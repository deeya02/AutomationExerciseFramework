package utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    public static WebElement visible( By locator) {
    	WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(20));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement clickable(By locator) {
    	WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(20));
        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }
}
/*package utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
public static WebElement visible(WebElement element) {
	return new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(element));
}
public static WebElement clickable(WebElement element) {
	return new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(30))
			.until(ExpectedConditions.elementToBeClickable(element));
}
}*/
