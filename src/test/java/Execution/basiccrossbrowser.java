package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basiccrossbrowser {

	public WebDriver driver;
	
	@Parameters("Browser")
	@Test
	public void MyntraTest(String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}else {
		 driver = new EdgeDriver();
		System.out.println("default browser if condition is not matching");
	}
		
		driver.get("https://www.myntra.com/");
}
}
