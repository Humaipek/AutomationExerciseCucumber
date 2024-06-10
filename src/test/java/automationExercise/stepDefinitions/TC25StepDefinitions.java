package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC25StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        automationExercisePage.scrollUp.click();
    }

    @Then("Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {

        Assert.assertEquals(automationExercisePage.style.getAttribute("style"),"position: fixed; z-index: 2147483647; display: none;");

        Assert.assertTrue(automationExercisePage.fullFledgedText.isDisplayed());
    }
}
