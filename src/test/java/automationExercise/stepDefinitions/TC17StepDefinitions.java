package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC17StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click 'X' button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        automationExercisePage.xButton.click();
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        Assert.assertEquals(automationExercisePage.productsList.size(),1);
    }
}
