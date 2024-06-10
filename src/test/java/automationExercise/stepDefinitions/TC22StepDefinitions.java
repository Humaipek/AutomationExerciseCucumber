package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC22StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        Actions actions=new Actions(Driver.getDriver());
        actions.scrollToElement(automationExercisePage.scrollToBottomOfPage).perform();
    }

    @Then("Verify 'RECOMMENDED ITEMS' are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(automationExercisePage.scrollToBottomOfPage.isDisplayed());
    }

    @When("Click on 'Add To Cart' on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        automationExercisePage.product.click();
    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        for (WebElement w:automationExercisePage.productsList){
            String products=w.getText();
            if (products.contains("Stylish Dress")){
                Assert.assertTrue(automationExercisePage.product.isDisplayed());
            }
        }
    }
}
