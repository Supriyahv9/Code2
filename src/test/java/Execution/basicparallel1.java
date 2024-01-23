package Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class basicparallel1 {

	@Test
	public void MyntraTest() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Reporter.log("hello",true);
	}
	
	@Test
	public void jiocinemaTest() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.jiocinema.com/");
		//System.out.println("jiocinema");
		Reporter.log("Good morning",true);
	}
}
