package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features", glue= "stepDefinitions", monochrome=true, dryRun=false,
plugin= {"pretty", "html:target/cucumber-report.html"})

public class TestRunner extends AbstractTestNGCucumberTests{

}
