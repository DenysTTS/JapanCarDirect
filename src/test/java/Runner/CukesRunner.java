package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",

        },
        features ="src/test/resources/FeatureFiles",
        glue="src/test/java/StepDefinitions",
        dryRun=false,
        tags = "@Librarian"
)
public class CukesRunner {
}