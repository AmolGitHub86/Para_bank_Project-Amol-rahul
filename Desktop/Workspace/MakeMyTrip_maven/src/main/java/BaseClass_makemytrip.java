import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_makemytrip {
	
	@Test
	public void initialization() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.findElement(By.cssSelector("i[class='wewidgeticon we_close']"));                       
		//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.findElement(By.cssSelector("span[class='commonModal__close']")).click();
		driver.findElement(By.id("fromCity"));
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Mumbai");
		
		
		
	}
	
	

}
