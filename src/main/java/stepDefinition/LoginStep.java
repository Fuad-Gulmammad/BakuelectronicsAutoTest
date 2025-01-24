package stepDefinition;

import com.aventstack.extentreports.Status;
import config.ExtentManager;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;

public class LoginStep {

    private static final Logger log = LoggerFactory.getLogger(LoginStep.class);
    public  LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();
    }

    @Given("The user navigates to the homepage")
    public void navigateToHomepage() {
        String firstPage = "https://new.bakuelectronics.az/";
        loginPage.driver.get(firstPage);
        loginPage.driver.manage().window().maximize();

        ExtentManager.getTest().log(Status.INFO, "The user navigates to the homepage");

    }

    @Given("The user clicks on the login button")
    public void clickingOnLoginButton() {
        loginPage.clickLoginButton();
        ExtentManager.getTest().log(Status.INFO, "The user clicks on the login button");
    }

    @When("The user enters {string} and {string}")
    public void enterCredentials(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        ExtentManager.getTest().log(Status.INFO, "The user enters email and password");

    }

    @Then("Clicks on the Daxil ol button and proceeds to the homepage")
    public void clickingOnSubmit() {
        loginPage.clickSubmitButton();
        ExtentManager.getTest().log(Status.INFO, "Clicks on the Login button and proceeds to the homepage");
    }


}
