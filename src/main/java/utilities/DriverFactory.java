package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.time.Duration;*/

public class DriverFactory {
 static WebDriver driver;
 
 public static void initDriver() {
	 if(driver== null) {
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://automationexercise.com/");
	 }
 }
 public static WebDriver getDriver() {
	 if(driver == null) {
		 initDriver();
	 }
	 return driver;
 }
 public static void quitDriver() {
	 if(driver!= null) {
		 driver.quit();
		 driver=null;
	 }
 }
}