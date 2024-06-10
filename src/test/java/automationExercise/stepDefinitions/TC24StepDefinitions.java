package automationExercise.stepDefinitions;

import automationExercise.pages.AutomationExercisePage;
import automationExercise.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class TC24StepDefinitions {
    protected static WebDriverWait webDriverWait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @When("Click 'Download Invoice' button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        String txt= System.getProperty("user.home")+"\\Downloads\\invoice.txt";
        try {
            Files.delete(Paths.get(txt));
        } catch (IOException e) {
            System.out.println("Silinecek dosya bulunamadi");
        }
        automationExercisePage.downloadInvoice.click();
        webDriverWait.until( driver -> Files.exists(Paths.get(txt)));
        Assert.assertTrue(Files.exists(Paths.get(txt)));
    }
}
