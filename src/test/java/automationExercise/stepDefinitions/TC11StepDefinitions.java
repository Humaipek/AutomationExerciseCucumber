package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import io.cucumber.java.en.When;

public class TC11StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click 'Cart' button")
    public void clickCartButton() {
        automationExercisePage.cartButton.click();

    }
}
