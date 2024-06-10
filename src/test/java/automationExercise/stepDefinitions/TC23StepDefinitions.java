package automationExercise.stepDefinitions;

import automationExercise.hooks.Hook;
import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TC23StepDefinitions extends ReusableMethods {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

        for (WebElement w:automationExercisePage.deliveryAddress){
            Assert.assertTrue(w.getText().contains(name));
            Assert.assertTrue(w.getText().contains(lastName));
            Assert.assertTrue(w.getText().contains(companyName));
            Assert.assertTrue(w.getText().contains(streetAddress));
            Assert.assertTrue(w.getText().contains(streetAddress2));
            Assert.assertTrue(w.getText().contains(state));
            Assert.assertTrue(w.getText().contains(city));
            Assert.assertTrue(w.getText().contains(zipCode));
            Assert.assertTrue(w.getText().contains(phoneNumber));
        }
    }

    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

        for (WebElement w:automationExercisePage.billingAddress){
            Assert.assertTrue(w.getText().contains(name));
            Assert.assertTrue(w.getText().contains(lastName));
            Assert.assertTrue(w.getText().contains(companyName));
            Assert.assertTrue(w.getText().contains(streetAddress));
            Assert.assertTrue(w.getText().contains(streetAddress2));
            Assert.assertTrue(w.getText().contains(state));
            Assert.assertTrue(w.getText().contains(city));
            Assert.assertTrue(w.getText().contains(zipCode));
            Assert.assertTrue(w.getText().contains(phoneNumber));
        }
    }
}
