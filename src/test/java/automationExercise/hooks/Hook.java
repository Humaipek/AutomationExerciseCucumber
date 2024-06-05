package automationExercise.hooks;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.ConfigReader;
import automationExercise.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Ignore;
import org.openqa.selenium.Keys;

public class Hook {

   @After
    public void tearDown() throws Exception {
        Driver.getDriver().close();
    }
    public static Faker faker = new Faker();
    public static String email;
    public static String password;
    @Before("@TC02 or @TC04 or @TC05 or @TC16 or @TC20")
    public void registerAccount() throws Exception {
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        email=faker.internet().emailAddress();
        password=faker.internet().password();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        if (automationExercisePage.cookieConsent.isDisplayed()){
            automationExercisePage.cookieConsent.click();
        }
        automationExercisePage.signUpLogin.click();
        automationExercisePage.signUpName.sendKeys(faker.name().firstName(), Keys.TAB,
                email);
        automationExercisePage.signUpButton.click();
        automationExercisePage.gender.click();
        automationExercisePage.name.clear();
        automationExercisePage.name.sendKeys(faker.name().firstName());
        automationExercisePage.password.sendKeys(password,Keys.TAB,
                "24", Keys.TAB,"September",Keys.TAB,"1978");
        automationExercisePage.selectSignupForOurNewsletter.click();
        automationExercisePage.selectReceiveSpecialOffersFromOurPartners.click();
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
        automationExercisePage.createAccountButton.click();
        Driver.closeDriver();

    }

}
