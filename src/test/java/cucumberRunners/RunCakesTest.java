package cucumberRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( strict = true,
        monochrome = true,
        plugin = {"html:target/cucumberHtmlReport"},
        //pretty:target/cucumber-json-report.json
        features = {"src/test/resources/features"},
        tags={"@E2E"},
        glue = {"stepDefinitions"}
)

public class RunCakesTest {


}
