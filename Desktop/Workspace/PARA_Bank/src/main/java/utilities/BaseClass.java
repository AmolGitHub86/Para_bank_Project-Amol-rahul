package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.RegistationPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	WebDriver driver;
	RegistationPage registationpage;
	
	
	public WebDriver driver_initilazation() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
	}
	
	public  RegistationPage registaion_class_call() {		
		registationpage = new RegistationPage(driver);
		return registationpage;
	}
	
	

}
