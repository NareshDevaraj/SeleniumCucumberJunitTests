package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/backgroundDemo",glue= {"StepsForBackground"},

monochrome = true,    //for formated output
plugin ={"pretty", "junit:target/reports/cucumber.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"}
//tags="@LoginDemoTest"

)


public class TestRunnerForBackgroundDemo {

}
