package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import automationExercise.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TC19StepDefinitions extends ReusableMethods {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        Assert.assertTrue(automationExercisePage.brands.isDisplayed());
    }

    @When("Click on any brand name")
    public void clickOnAnyBrandName() {
        automationExercisePage.brandName.click();
        waitFor(3);
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise - Polo Products");

        for (WebElement w:automationExercisePage.allBrandProducts){
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @When("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        automationExercisePage.brandLink.click();
        waitFor(3);
    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise - H&M Products");
        for (WebElement w:automationExercisePage.allProductsOtherPage){
            Assert.assertTrue(w.isDisplayed());
        }
    }
}
