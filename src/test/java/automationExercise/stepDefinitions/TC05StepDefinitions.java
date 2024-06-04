package automationExercise.stepDefinitions;

import automationExercise.hooks.Hook;
import automationExercise.pages.AutomationExercisePage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TC05StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    @When("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        automationExercisePage.signUpName.sendKeys(faker.name().firstName(), Keys.TAB,
                Hook.email);
    }

    @Then("Verify error 'Email Address already exist!' is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(automationExercisePage.emailExist.isDisplayed());
    }
}
