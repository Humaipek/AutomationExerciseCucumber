package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TC09StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        automationExercisePage.searchInput.sendKeys("dress");
        automationExercisePage.searchButton.click();
    }

    @Then("Verify 'SEARCHED PRODUCTS' is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(automationExercisePage.searchedProducts.getText(),"SEARCHED PRODUCTS");
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {

        for (WebElement w:automationExercisePage.allProductsRelated){
            Assert.assertTrue(w.isDisplayed());
        }
    }
}
