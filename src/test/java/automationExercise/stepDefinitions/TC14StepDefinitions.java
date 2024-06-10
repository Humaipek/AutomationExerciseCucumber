package automationExercise.stepDefinitions;

import automationExercise.hooks.Hook;
import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import automationExercise.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TC14StepDefinitions extends ReusableMethods {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    @When("Add products to cart")
    public void addProductsToCart() {
        automationExercisePage.addToCart.click();
        automationExercisePage.continueShoppingButton.click();
    }
    

    @When("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        automationExercisePage.proceedToCheckout.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {

        automationExercisePage.signUpName.sendKeys(name, Keys.TAB,
                faker.internet().emailAddress());
        automationExercisePage.signUpButton.click();

        automationExercisePage.gender.click();

        automationExercisePage.name.clear();

        automationExercisePage.name.sendKeys(name);

        automationExercisePage.password.sendKeys(faker.internet().password(), Keys.TAB,
                "24", Keys.TAB,"September",Keys.TAB,"1978");
        automationExercisePage.selectSignupForOurNewsletter.click();
        automationExercisePage.selectReceiveSpecialOffersFromOurPartners.click();
        automationExercisePage.firstName.sendKeys(name, Keys.TAB,
                lastName,Keys.TAB,
                companyName,Keys.TAB,
                streetAddress,Keys.TAB,
                streetAddress2,Keys.TAB,
                "India",Keys.TAB,
                state,Keys.TAB,
                city,Keys.TAB,
                zipCode,Keys.TAB,
                phoneNumber);
        automationExercisePage.createAccountButton.click();
    }
    
    @Then("Verify ' Logged in as username' at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(automationExercisePage.logginInAs.isDisplayed());
    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(
                automationExercisePage.addressDetails.isDisplayed() &&
                        automationExercisePage.reviewYourOrder.isDisplayed());
    }

    @When("Enter description in comment text area and click 'Place Order'")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        automationExercisePage.textArea.sendKeys(faker.lorem().sentence());
        automationExercisePage.placeOrder.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        automationExercisePage.nameOnCard.sendKeys(faker.name().firstName(),Keys.TAB,
                faker.number().digits(16),Keys.TAB,
                faker.number().digits(3),Keys.TAB,
                faker.number().digits(1),Keys.TAB,
                faker.number().digits(4));
    }

   /* @Then("Verify success message 'Your order has been placed successfully!'")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
            Assert.assertTrue(automationExercisePage.successMessage.isDisplayed());
    }*/


    @Then("Verify 'ACCOUNT DELETED!' and click 'Continue' button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        Assert.assertTrue(automationExercisePage.accountDeleted.isDisplayed());
        automationExercisePage.continueButton.click();
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertTrue(automationExercisePage.cartPage.isDisplayed());
    }

    @And("Click 'Register  Login' button")
    public void clickRegisterLoginButton() {
        automationExercisePage.registerLogin.click();
        
    }

    @Then("Verify 'ACCOUNT CREATED!' and click 'Continue' button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        Assert.assertTrue(automationExercisePage.accountCreated.isDisplayed());
        automationExercisePage.continueButton.click();
    }

    @And("Click 'Pay and Confirm Order' button")
    public void clickPayAndConfirmOrderButton() {
        automationExercisePage.confirmOrderButton.click();
    }
}
