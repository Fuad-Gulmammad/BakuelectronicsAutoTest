package stepDefinition;

import com.aventstack.extentreports.Status;
import config.ExtentManager;
import io.cucumber.java.en.*;
import pages.ShoppingCartPage;

public class ShoppingCartStep {
        public static ShoppingCartPage shoppingCartPage;

    public ShoppingCartStep() {
        shoppingCartPage = new ShoppingCartPage();
    }

    @When ("The user updates the quantity of the notebook by increasing it")
    public void addOnNotebookQuantity(){
        shoppingCartPage.increaseProductAmount();
        ExtentManager.getTest().log(Status.INFO, "The user updates the quantity of the notebook by increasing it");

    }

    @When ("The user updates the quantity of the smartphone by increasing it")
    public void addOnSmartphoneQuantity(){
        shoppingCartPage.increaseProductAmount();
        ExtentManager.getTest().log(Status.INFO, "The user updates the quantity of the smartphone by increasing it");

    }

    @And ("The user updates the quantity of the notebook by decreasing it")
    public void decreaseNotebookQuantity() throws InterruptedException {
        shoppingCartPage.decreaseProductAmount();
        ExtentManager.getTest().log(Status.INFO, "The user updates the quantity of the notebook by decreasing it");

    }

    @And ("The user updates the quantity of the smartphone by decreasing it")
    public void decreaseSmartphoneQuantity() throws InterruptedException {
        shoppingCartPage.decreaseProductAmount();
        ExtentManager.getTest().log(Status.INFO, "The user updates the quantity of the smartphone by decreasing it");

    }

   @Then("The user removes the notebook from the shopping cart")
   public void removeNotebookFromShoppingCart() {
        shoppingCartPage.removalFromCart();
       ExtentManager.getTest().log(Status.INFO, "The user removes the notebook from the shopping cart");

   }

    @Then("The user removes the smartphone from the shopping cart")
    public void removeSmartphoneFromShoppingCart() {
        shoppingCartPage.removalFromCart();
        ExtentManager.getTest().log(Status.INFO, "The user removes the smartphone from the shopping cart");

    }

    @Given("The user adds notebook to shopping cart")
    public void selectDesiredComputer() {
        clickProductFromCatalog("https://new.bakuelectronics.az/catalog/noutbuklar-komputerler-planshetler/noutbuklar");
        addItemToShoppingCart();
        ExtentManager.getTest().log(Status.INFO, "The user adds notebook to shopping cart");

    }

    @Given("The user adds smartphone to shopping cart")
    public void selectDesiredSmartphone() {
        clickProductFromCatalog("https://new.bakuelectronics.az/catalog/telefonlar-qadcetler/smartfonlar-mobil-telefonlar");
        addItemToShoppingCart();
        ExtentManager.getTest().log(Status.INFO, "The user adds smartphone to shopping cart");

    }

    private void addItemToShoppingCart() {
        shoppingCartPage.clickCartButtons();
        ExtentManager.getTest().log(Status.INFO, "Add Item to shopping cart");

    }

    private void clickProductFromCatalog(String url) {
        shoppingCartPage.driver.get(url);
        shoppingCartPage.clickOnProduct();
        ExtentManager.getTest().log(Status.INFO, "Click to product from catalog");

    }
}
