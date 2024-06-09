package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.RegistationPage;
import utilities.BaseClass;


public class TC_01 extends BaseClass {
	
	TC_01 tc01 ;
	
	@Test
	public void registation_int() {
		
		tc01 = new TC_01();
		tc01.driver_initilazation();
		 RegistationPage regi = tc01.registaion_class_call();
		 regi.Registation();
		
	
		
	
		
	}
	
	
	
	
	

}
