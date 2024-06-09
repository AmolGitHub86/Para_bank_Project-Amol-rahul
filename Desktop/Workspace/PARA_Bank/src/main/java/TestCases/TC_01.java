package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.RegistationPage;
import utilities.BaseClass;


public class TC_01 extends BaseClass {
	
	
	@Test
	public void registation() {
		RegistationPage registationPage = landingpage.goto_RegistationPage();
		registationPage.Registation();
		//driver.close();
		
	}
	

}
