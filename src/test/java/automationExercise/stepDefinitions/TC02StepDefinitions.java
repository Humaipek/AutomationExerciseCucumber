package automationExercise.stepDefinitions;

import automationExercise.hooks.Hook;
import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.ConfigReader;
import automationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TC02StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Then("Verify 'Login to your account' is visible")
    public void verifyLoginToYourAccountIsVisible() {

        Assert.assertTrue(automationExercisePage.loginToYourAccount.isDisplayed());
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        automationExercisePage.loginMail.sendKeys(Hook.email);
        automationExercisePage.loginPassword.sendKeys(Hook.password);
    }

    @And("Click 'login' button")
    public void clickLoginButton() {
        automationExercisePage.loginButton.click();
    }

    @Then("Verify that 'ACCOUNT DELETED!' is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertTrue(automationExercisePage.deleteAccountText.isDisplayed());
    }

}
