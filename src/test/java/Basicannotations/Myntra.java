package Basicannotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Myntra {

	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}
	
	@Test
	public void MyntraTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
	
	@Test
	public void AmazonTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("After method");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
}
