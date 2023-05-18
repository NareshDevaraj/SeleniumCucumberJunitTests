package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;




public class HooksDemoSteps {

	WebDriver driver = null;
	
	//@Before("@HookScenario1")               //Conditional hooks to run for specific  scenario 
	//@Before(value="@HookScenario1",order=1)               //Conditional hooks to run for specific  scenario in order 
	@Before(order = 1)               //to run before each scenario 
	@SuppressWarnings("deprecation")
	public void browserSetup() {
		
		
		System.out.println("  I am inside browser setup      ");
		System.getProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before (order=0)
	public void setup2() {
		System.out.println("  I am inside browser setup  2  \n  ");
		
	}
	
	
	
	@After(order=1)    //to run after each scenario 
	public void teardown() {
		System.out.println("  I am inside tearDown      ");
		driver.close();
		driver.quit();
		
	}
	
	@After(order=2)   
	public void teardown2() {
		System.out.println("  I am inside tearDown 2    \n  ");

		
	}
	
	@BeforeStep
	public static void beforeSteps() {
		System.out.println("  I am inside beforeSteps      ");
		
		
	}
	
	
	@AfterStep
	public static void afterSteps() {
		System.out.println("  I am inside AfterSteps      ");
		
		
	}
	
	
	
	@Given("Hooks - user is on login page")
	public void hooks_user_is_on_login_page() {

	}
	@When("Hooks - user enters valid username and password")
	public void hooks_user_enters_valid_username_and_password() {

	}
	@And("Hooks - clicks on login button")
	public void hooks_clicks_on_login_button() {

	}
	@Then("Hooks - user is navigated to the home page")
	public void hooks_user_is_navigated_to_the_home_page() {
		
	}



}
