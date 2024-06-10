package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TC21StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();

    @And("Click on 'View Product' button")
    public void clickOnViewProductButton() {
        automationExercisePage.viewProduct.click();
    }
    @Then("Verify 'Write Your Review' is visible")
    public void verifyWriteYourReviewIsVisible() {
        Assert.assertTrue(automationExercisePage.writeYourReview.isDisplayed());
    }

    @When("Enter name, email and review")
    public void enterNameEmailAndReview() {
        automationExercisePage.reviewName.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.internet().emailAddress(), Keys.TAB,faker.lorem().paragraph());
    }

    @Then("Verify success message 'Thank you for your review.'")
    public void verifySuccessMessageThankYouForYourReview() {
        Assert.assertTrue(automationExercisePage.successMessageThankYouForYourReview.isDisplayed());
    }


    @And("Click 'Submit' button review")
    public void clickSubmitButtonRewiew() {
        automationExercisePage.submitButtonRewiew.click();
    }
}
