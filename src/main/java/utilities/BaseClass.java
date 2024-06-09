package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.RegistationPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	public WebDriver driver;
	public LandingPage landingpage;
	
	
	public WebDriver driver_initilazation() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public  LandingPage LaunchApplication() {	
		driver = driver_initilazation();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	

}
