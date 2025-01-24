package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:/Users/User/Desktop/AFEATask/BakuElectronics/src/test/java/features",
        glue = {"stepDefinition", "config"},
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/CucumberTestReportPositive.json",
                "html:target/cucumber-reports/html/CucumberTestReportPositive.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        monochrome = true,
        tags = "@Login"
)

public class LoginRunner {
}
