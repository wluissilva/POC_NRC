package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json", "html:target/cucumber"},
        monochrome = false,
        tags = "@saude or @funcional or @contrato",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {

}
