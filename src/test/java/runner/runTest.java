package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/features",
    glue = "step_definition",
    tags = "@openNewAccount",
    plugin = {"pretty", "html:target/RegressionReport.html"}

)

public class runTest {

    
}


