package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import automationExercise.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TC06StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    @When("Click on 'Contact Us' button")
    public void clickOnContactUsButton() {
        automationExercisePage.contactUs.click();

    }

    @Then("Verify 'GET IN TOUCH' is visible")
    public void verifyGETINTOUCHIsVisible() {
        Assert.assertTrue(automationExercisePage.getInTouch.isDisplayed());
    }

    @When("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        automationExercisePage.contactName.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB,
                faker.lorem().word(),Keys.TAB,
                faker.lorem().paragraph());
    }

    @And("Upload file")
    public void uploadFile() {

        automationExercisePage.fileInput.sendKeys("C:\\Users\\humai\\OneDrive\\Masaüstü\\Web Denemesı\\Resimler\\th.jpg");
    }

    @And("Click 'Submit' button")
    public void clickSubmitButton() {
        automationExercisePage.submit.submit();
    }

    @And("Click OK button")
    public void clickOKButton() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify success message 'Success! Your details have been submitted successfully.' is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Assert.assertEquals(automationExercisePage.actualSuccess.getText(),"Success! Your details have been submitted successfully.");
    }

    @When("Click 'Home' button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() throws InterruptedException {
        automationExercisePage.homeButton.click();
        ReusableMethods.waitFor(3);
        Assert.assertEquals("Automation Exercise",Driver.getDriver().getTitle());

    }

}
