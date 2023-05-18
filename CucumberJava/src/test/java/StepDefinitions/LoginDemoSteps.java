package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {

/*	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("Open the browser")
	public void open_the_browser() {




		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);

		System.getProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	@And("User is on the login page")
	public void user_is_on_the_login_page() {

		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_user_name_and_password(String username,String password) {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);


	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000); 
	}



	@Then("user should be navigated to the homepage")
	public void user_should_be_navigated_to_the_homepage() throws InterruptedException {
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);       //to check the page by visual
		driver.close();
		//driver.quit();
	}

*/



}
