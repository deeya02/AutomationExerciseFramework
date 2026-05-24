package hooks;

import utilities.DriverFactory;
import utilities.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before

    public void setup() {

        DriverFactory.initDriver();
    }

    @After

    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {
        	String path = ScreenshotUtil.takeScreenshot(scenario.getName());
        	scenario.log("Screenshot saved at: " + path);
        }
        DriverFactory.quitDriver();
    }
}