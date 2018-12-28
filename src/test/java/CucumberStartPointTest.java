import cucumber.api.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "bell.StepDefinition",
        tags = "@calc",
        snippets = SnippetType.CAMELCASE
)

public class CucumberStartPointTest {
}
