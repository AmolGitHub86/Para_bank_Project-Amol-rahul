package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	public RegistationPage registationPage;
	public HomePage homepage;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	WebElement registerbutton;
	
	@FindBy(name = "username")
	WebElement login_username;
	
	@FindBy(name = "password")
	WebElement login_password;
	
	@FindBy(css = "input[value='Log In']")
	WebElement login_button;
	

	public RegistationPage goto_RegistationPage() {
		registerbutton.click();
		registationPage = new RegistationPage(driver);
		return registationPage;
	}
	
	public HomePage login(String username, String password) {
		login_username.sendKeys(username);
		login_password.sendKeys(password);
		login_button.click();
		homepage =new HomePage(driver);
		
		return homepage;
	}
	
	
}
