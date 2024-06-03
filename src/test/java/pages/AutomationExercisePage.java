package pages;

import org.openqa.selenium.support.PageFactory;

public class AutomationExercisePage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
