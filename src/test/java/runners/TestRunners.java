package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/feature/feature",

        glue ={"stepDefinitions","hooks"},

        monochrome = true,

        plugin = {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"
        		,"testng:target/testng-cucumber.xml"
        }
)

public class TestRunners
        extends AbstractTestNGCucumberTests {
}
