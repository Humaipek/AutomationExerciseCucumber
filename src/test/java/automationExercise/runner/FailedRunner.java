package automationExercise.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed.scenario.txt"
        },
        features = "@TestOutput/failed.scenario.txt",
        glue = {"automationExercise/stepDefinitions","automationExercise/hooks"},
        dryRun = false,
        monochrome = false
)
public class FailedRunner {
}