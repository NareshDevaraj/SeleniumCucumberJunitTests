package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/HooksDemo",glue= {"StepsForHooks"},

monochrome = true,    //for formated output
plugin ={"pretty", "junit:target/reports/cucumber.xml",
		"json:target/JSONReports/report.json",
"html:target/HtmlReports"}
//tags="@LoginDemoTest"

		)

public class TestRunnerForHooks {

}
