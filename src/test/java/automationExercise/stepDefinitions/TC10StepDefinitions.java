package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TC10StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    @When("Scroll down to footer")
    public void scrollDownToFooter() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }

    @Then("Verify text 'SUBSCRIPTION'")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertEquals(automationExercisePage.subscription.getText(),"SUBSCRIPTION");
    }

    @When("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        automationExercisePage.subscriptionEmail.sendKeys(faker.internet().emailAddress());
        automationExercisePage.arrowButton.click();
    }

    @Then("Verify success message 'You have been successfully subscribed!' is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {

        Assert.assertEquals(automationExercisePage.subscribedSuccessfully.getText(),"You have been successfully subscribed!");
    }
}
