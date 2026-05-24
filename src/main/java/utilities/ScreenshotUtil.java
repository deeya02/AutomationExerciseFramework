package utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenshotUtil {
 public static String takeScreenshot(String scenarioName) {
 try {
 File src = ((TakesScreenshot) 
DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
 String fileName = scenarioName.replaceAll("[^a-zA-Z0-9]", "_") + "_" + RandomStringUtils.randomAlphanumeric(5) + ".png";
 String path = System.getProperty("user.dir") + "/screenshots/" + fileName;
 
Files.createDirectories(Paths.get(System.getProperty("user.dir") + "/screenshots"));
 Files.copy(src.toPath(), Paths.get(path));
 return path;
 } catch (Exception e) {
 return "Screenshot capture failed: " + 
e.getMessage();
 }
 }
}
