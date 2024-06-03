package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.ConfigReader;
import automationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TC01StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    Faker faker=new Faker();
    @Given("Navigate to url")
    public void navigateToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        if (automationExercisePage.cookieConsent.isDisplayed()){
            automationExercisePage.cookieConsent.click();
        }
    }

    @Then("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }

    @When("Click on 'Signup  Login' button")
    public void clickOnSignupLoginButton() {
        automationExercisePage.signUpLogin.click();
    }

    @Then("Verify 'New User Signup!' is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(automationExercisePage.newUserSignup.isDisplayed());
    }

    @When("Enter name and email address")
    public void enterNameAndEmailAddress() {
        automationExercisePage.signUpName.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.internet().emailAddress());

    }

    @And("Click 'Signup' button")
    public void clickSignupButton() {
        automationExercisePage.signUpButton.click();
    }

    @Then("Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(automationExercisePage.enterAccount.isDisplayed());
    }

    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        automationExercisePage.gender.click();

        automationExercisePage.name.clear();

        automationExercisePage.name.sendKeys(faker.name().firstName());

        automationExercisePage.password.sendKeys(faker.internet().password(),Keys.TAB,
                "24", Keys.TAB,"September",Keys.TAB,"1978");
    }

    @And("Select checkbox 'Sign up for our newsletter!'")
    public void selectCheckboxSignUpForOurNewsletter() {
       automationExercisePage.selectSignupForOurNewsletter.click();
    }
    @And("Select checkbox 'Receive special offers from our partners!'")
    public void selectReceiveSpecialOffersFromOurPartners() {
        automationExercisePage.selectReceiveSpecialOffersFromOurPartners.click();
    }

    @And("Fill details: First name, Last name, Company, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressCountryStateCityZipcodeMobileNumber() {
        automationExercisePage.firstName.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.company().name(),Keys.TAB,
                faker.address().streetAddress(),Keys.TAB,
                faker.address().secondaryAddress(),Keys.TAB,
                "India",Keys.TAB,
                faker.address().state(),Keys.TAB,
                faker.address().city(),Keys.TAB,
                faker.address().zipCode(),Keys.TAB,
                faker.phoneNumber().cellPhone());
    }

    @And("Click 'Create Account button'")
    public void clickCreateAccountButton() {
        automationExercisePage.createAccountButton.click();
    }

    @Then("Verify that 'ACCOUNT CREATED!' is visible")
    public void VerifyThatACCOUNTCREATEDIsVisible() {
                Assert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());
    }
    @And("Click 'Continue' button")
    public void clickContinueButton() {
        automationExercisePage.continueButton.click();
    }
    @Then("Verify that 'Logged in as username' is visible")
    public void VerifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(automationExercisePage.logginInAs.isDisplayed());
    }

    @And("Click 'Delete Account' button")
    public void clickDeleteAccountButton() {
        automationExercisePage.deleteAccountButton.click();
    }
    @Then("Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button")
    public void verifyThatACCOUNTDELETEDIsVisible() {
       Assert.assertTrue(automationExercisePage.deleteAccountText.isDisplayed());
    }


}
