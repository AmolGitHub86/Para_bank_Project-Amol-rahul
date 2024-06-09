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

	
	
	public void Registation() {
		//driver.findElement(By.linkText("Register")).click();	
		registerbutton.click();
		WebDriverWait waitdriver = new WebDriverWait(driver,Duration.ofSeconds(10));
		waitdriver.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
//		driver.findElement(By.id("customer.firstName")).sendKeys("Amol");
//		driver.findElement(By.id("customer.lastName")).sendKeys("Ayarkar");
//		driver.findElement(By.id("customer.address.street")).sendKeys("Nanvi mumbai");
//		driver.findElement(By.id("customer.address.city")).sendKeys("mumbai");
//		driver.findElement(By.id("customer.address.state")).sendKeys("maharashtra");
//		driver.findElement(By.id("customer.address.zipCode")).sendKeys("402401");
//		driver.findElement(By.id("customer.phoneNumber")).sendKeys("8698991626");
//		driver.findElement(By.id("customer.ssn")).sendKeys("3456tfgh");
		
		firstname.sendKeys("Amol");
		lastname.sendKeys("Ayarkar");
		address.sendKeys("Nanvi mumbai");
		city.sendKeys("mumbai");
		state.sendKeys("maharashtra");
		zipcode.sendKeys("402401");
		phonenumber.sendKeys("8698991626");
		ssn.sendKeys("3456tfgh");
		
		
		
		
	}

}
