package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TC12StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @And("Hover over first product and click 'Add to cart'")
    public void hoverOverFirstProductAndClickAddToCart() {
        automationExercisePage.firstProduct.click();
    }

    @And("Click 'Continue Shopping' button")
    public void clickContinueShoppingButton() {
        automationExercisePage.continueShoppingButton.click();
    }

    @And("Hover over second product and click 'Add to cart'")
    public void hoverOverSecondProductAndClickAddToCart() {
        automationExercisePage.secondProduct.click();
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertTrue( automationExercisePage.firstProduct.isDisplayed() && automationExercisePage.secondProduct.isDisplayed() );
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertEquals("Rs. 500",automationExercisePage.firstPrice.getText());

        Assert.assertEquals("Rs. 400",automationExercisePage.secondPrice.getText());

        Assert.assertEquals("1",automationExercisePage.firstQuantity.getText());

        Assert.assertEquals("1", automationExercisePage.secondQuantity.getText());

        Assert.assertEquals("Rs. 500",automationExercisePage.firstPriceTotal.getText());

        Assert.assertEquals("Rs. 400",automationExercisePage.secondPriceTotal.getText());
    }

    @And("Click 'View Cart' button")
    public void clickViewCartButton() {
        automationExercisePage.viewCartButton.click();
    }
}
