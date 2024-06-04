package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC03StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    @When("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        automationExercisePage.loginMail.sendKeys(faker.internet().emailAddress());
        automationExercisePage.loginPassword.sendKeys(faker.internet().password());
    }
    @Then("Verify error 'Your email or password is incorrect!' is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
         Assert.assertTrue(automationExercisePage.yourEmailOrPasswordIsIncorrect.isDisplayed());
    }


}
