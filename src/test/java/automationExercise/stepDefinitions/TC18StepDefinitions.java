package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import automationExercise.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TC18StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Then("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertTrue(automationExercisePage.categories.isDisplayed());
    }

    @When("Click on 'Women' category")
    public void clickOnWomenCategory() {
        automationExercisePage.womenCategory.click();
    }

    @And("Click on any category link under 'Women' category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        automationExercisePage.dressCategory.click();
    }

    @Then("Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {

        Assert.assertEquals(automationExercisePage.womenDressProducts.getText(),"WOMEN - DRESS PRODUCTS");
    }

    @When("On left side bar, click on any sub-category link of 'Men' category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        automationExercisePage.menCategory.click();
        automationExercisePage.tshirtsCategory.click();
        ReusableMethods.waitFor(5);

    }

    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise - Tshirts Products");
    }
}
