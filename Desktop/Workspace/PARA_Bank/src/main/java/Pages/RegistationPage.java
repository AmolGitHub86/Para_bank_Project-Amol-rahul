package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Factory;

public class RegistationPage {
	
	WebDriver driver;	
	
	public RegistationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(linkText = "Register")
	WebElement registerbutton;
	
	@FindBy(id = "customer.firstName")
	WebElement firstname;
	
	@FindBy(id = "customer.lastName")
	WebElement lastname;
	
	@FindBy(id = "customer.address.street")
	WebElement address;
	
	@FindBy(id = "customer.address.city")
	WebElement city;
	
	@FindBy(id = "customer.address.state")
	WebElement state;
	
	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(id = "customer.phoneNumber")
	WebElement phonenumber;
	
	@FindBy(id = "customer.ssn")
	WebElement ssn;
	
	@FindBy(id = "customer.username")
	WebElement username;
	
	@FindBy(id = "customer.password")
	WebElement password;
	
	@FindBy(id = "repeatedPassword")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;

	
	
	public void Registation() {	
		registerbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait waitdriver = new WebDriverWait(driver,Duration.ofSeconds(10));
		waitdriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
		firstname.sendKeys("Amol");
		lastname.sendKeys("Ayarkar");
		address.sendKeys("Nanvi mumbai");
		city.sendKeys("mumbai");
		state.sendKeys("maharashtra");
		zipcode.sendKeys("402401");
		phonenumber.sendKeys("8698991626");
		ssn.sendKeys("3456tfgh");	
		username.sendKeys("amolayarkar");
		password.sendKeys("1234567");
		confirmPassword.sendKeys("1234567");
		submitButton.click();
		
	}

}
