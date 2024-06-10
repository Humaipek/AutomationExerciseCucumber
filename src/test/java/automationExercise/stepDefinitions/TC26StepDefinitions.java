package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TC26StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Scroll up page to top")
    public void scrollUpPageToTop() {
        automationExercisePage.scrollUp.click();
    }
}
