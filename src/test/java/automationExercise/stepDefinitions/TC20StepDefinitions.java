package automationExercise.stepDefinitions;

import automationExercise.hooks.Hook;
import automationExercise.pages.AutomationExercisePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TC20StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Add those products to cart")
    public void addThoseProductsToCart() {
        for (WebElement w:automationExercisePage.addProductsToCart){
            w.click();
            automationExercisePage.continueShoppingButton.click();
        }
    }

    @And("Click 'Cart' button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {
        automationExercisePage.cartButton.click();
        for (WebElement w:automationExercisePage.productsList){
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @And("Click 'Signup  Login' button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {
        automationExercisePage.signUpLogin.click();

        automationExercisePage.loginMail.sendKeys(Hook.email);
        automationExercisePage.loginPassword.sendKeys(Hook.password);
        automationExercisePage.loginButton.click();
    }

    @And("Again, go to Cart page")
    public void againGoToCartPage() {
       automationExercisePage.cartButton.click();
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        for (WebElement w:automationExercisePage.productsList){
            Assert.assertTrue(w.isDisplayed());
        }
    }
}
