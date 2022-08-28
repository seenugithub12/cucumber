package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\M1084291\\eclipse-workspace\\CucumberForCA\\features",
glue="StepDefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:reports/report.html"})
public class runnerTest {

}
