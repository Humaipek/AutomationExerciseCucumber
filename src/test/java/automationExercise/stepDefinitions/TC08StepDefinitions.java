package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import automationExercise.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TC08StepDefinitions {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click on 'Products' button")
    public void clickOnProductsButton() {
        automationExercisePage.productsButton.click();

    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        Assert.assertEquals(automationExercisePage.allProductsText.getText(),"ALL PRODUCTS");
    }

    @When("The products list is visible")
    public void theProductsListIsVisible() {
        for (WebElement w:automationExercisePage.allProducts){
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @And("Click on 'View Product' of first product")
    public void clickOnViewProductOfFirstProduct() {
        automationExercisePage.viewProduct.click();
        WaitUtils.waitFor(3);
    }

    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("product_details"));
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        Assert.assertTrue(automationExercisePage.productName.isDisplayed());


        Assert.assertTrue(automationExercisePage.productCategory.isDisplayed());


        Assert.assertTrue(automationExercisePage.productPrice.isDisplayed());


        Assert.assertTrue(automationExercisePage.productAvailability.isDisplayed());


        Assert.assertTrue(automationExercisePage.productCondition.isDisplayed());


        Assert.assertTrue(automationExercisePage.productBrand.isDisplayed());
    }
}
