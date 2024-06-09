package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	public RegistationPage registationPage;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	WebElement registerbutton;
	

	public RegistationPage goto_RegistationPage() {
		registerbutton.click();
		registationPage = new RegistationPage(driver);
		return registationPage;
	}
}
