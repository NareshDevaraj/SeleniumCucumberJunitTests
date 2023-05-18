package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPagePF {

	WebDriver driver;


	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		
		// to fix No Element Exception for Ajex application 
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		//PageFactory.initElements(factory, this);
		     
		//or
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		
		
	}


	@FindBy(id = "name")
	@CacheLookup       //it will store in memory and will call it from any method ---- only used for basic website where it will not have any change
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;

	
	//example for list of elements
	@FindBy(partialLinkText = "Naresh")    //will save all the links with naresh will store in links
	List<WebElement> myLinks;

	//one more example 
	@FindBy(how =How.ID, using="name")
	WebElement abc;
	
	

	public void enterUsername(String username) {

		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {

		txt_password.sendKeys(password);
	}

	public void clickLogin() {

		btn_login.click();
	}





}
