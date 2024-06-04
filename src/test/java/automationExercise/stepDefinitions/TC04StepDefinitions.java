package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC04StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click 'Logout' button")
    public void clickLogoutButton() {
       automationExercisePage.logoutButton.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertEquals("https://automationexercise.com/login", Driver.getDriver().getCurrentUrl());
    }
}
