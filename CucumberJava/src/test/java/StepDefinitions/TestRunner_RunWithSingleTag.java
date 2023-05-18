package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/FeatureWithTags",glue= {"StepDefinitions"},

monochrome = true,    //for formated output
plugin = {"json:target/cucumber.json"},
//tags ="@smokeTag or @RegressionTag"  //will run any one of this scenario which has this tags 

//tags ="@SmokeTag and @RegressionTag"   // will run the scenarios which has both this tags

//tags ="(@SmokeTag or @RegressionTag) and @Important"   

//tags ="@SmokeTag and not @Important"  

tags ="@mustrun"  


		)

public class TestRunner_RunWithSingleTag {

}
