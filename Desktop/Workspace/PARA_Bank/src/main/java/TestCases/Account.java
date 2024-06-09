package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import utilities.BaseClass;

public class Account extends BaseClass {
	
	@Test
	public void account_overview() {		  
		HomePage homepage = landingpage.login("amolayarkar1", "12345678");
		homepage.opennewaccount();
	}
	
 
}
