package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC13StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click 'View Product' for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        automationExercisePage.viewProduct.click();
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertEquals("Automation Exercise - Product Details", Driver.getDriver().getTitle());
    }

    @When("Increase quantity to {int}")
    public void increaseQuantityTo(int arg0) {
        automationExercisePage.quantity.clear();
        automationExercisePage.quantity.sendKeys(String.valueOf(arg0));
    }

    @And("Click 'Add to cart' button")
    public void clickAddToCartButton() {
        automationExercisePage.addToCartButton.click();
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals("4",automationExercisePage.exactQuantity.getText());
    }
}
