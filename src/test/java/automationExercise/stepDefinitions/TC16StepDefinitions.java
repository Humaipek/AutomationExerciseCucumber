package automationExercise.stepDefinitions;

import automationExercise.hooks.Hook;
import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.ConfigReader;
import io.cucumber.java.en.And;

public class TC16StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @And("Fill email, password and click 'Login' button")
    public void fillEmailPasswordAndClickLoginButton() {
        automationExercisePage.loginMail.sendKeys(Hook.email);
        automationExercisePage.loginPassword.sendKeys(Hook.password);
        automationExercisePage.loginButton.click();
    }
}
