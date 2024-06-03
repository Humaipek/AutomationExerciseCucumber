package automationExercise.hooks;

import automationExercise.utilities.Driver;
import io.cucumber.java.After;

public class Hook {

    @After
    public void tearDown() throws Exception {
        Driver.getDriver().close();
    }
}
