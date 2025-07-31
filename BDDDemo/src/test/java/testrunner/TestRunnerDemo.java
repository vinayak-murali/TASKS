package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/login.feature"},
glue = {"org/example/StepDefinitions"},
plugin = {"pretty", "html:target/HTMLReport.html"})

public class TestRunnerDemo extends AbstractTestNGCucumberTests {
}
