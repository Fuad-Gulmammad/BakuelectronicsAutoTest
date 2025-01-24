package stepDefinition;

import com.aventstack.extentreports.Status;
import config.ExtentManager;
import io.cucumber.java.en.*;
import pages.CheckoutPage;

public class CheckoutStep {
    public static CheckoutPage checkoutPage;

    public CheckoutStep() {
        checkoutPage = new CheckoutPage();
    }

    @Given("The user clicks on the Proceed to Checkout button")
    public void clicktoProceedButton() {
        checkoutPage.proceedToCheckout();
        ExtentManager.getTest().log(Status.INFO, "The user clicks on the Proceed to Checkout button");

    }

    @When("The user enters their phone number {string}")
    public void enterPhoneNumber(String phone_number) {
        checkoutPage.enterPhoneNumber(phone_number);
        ExtentManager.getTest().log(Status.INFO, "The user enters their phone number");

    }

    @And("The user selects the location to pick up the product")
    public void selectPickupLocation() {
        checkoutPage.enterPickupFromStore();
        checkoutPage.addressSelection();
        ExtentManager.getTest().log(Status.INFO, "The user selects the location to pick up the product");

    }

    @Then("The user chooses the payment method and completes the order")
    public void choosePaymentMethodAndCompleteOrder() {
        checkoutPage.selectCardPayment();
        checkoutPage.clickCompleteOrder();
        ExtentManager.getTest().log(Status.INFO, "The user chooses the payment method and completes the order");

    }

}
