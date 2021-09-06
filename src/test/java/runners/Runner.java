package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"steps"},
        plugin = {"pretty","io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm","html:Reporter/reporter.html"},
        monochrome = false,
        tags = "@saude or @funcional or @contrato",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {

}
