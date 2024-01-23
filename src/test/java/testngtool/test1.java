package testngtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	

	@Test(priority=3)
	public void ZomatoTest() {
	
		//System.out.println("Welcome to Pune");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
	}
	
	
	@Test(invocationCount=3,priority=1)
	public void SwiggyTest() {
		//System.out.println("Welcome to Deccan");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
	
	@Test(priority=2)
	public void FacebookTest() {
		//System.out.println("Hello everyone");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
		
	

}
