package Basicpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pomskillrary.LoginPage;

public class BaseskillraryPage {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com");
	
	LoginPage lp = new LoginPage();
	PageFactory.initElements(driver, lp);
	lp.getLogintxt().click();
	Thread.sleep(2000);
	lp.getEmailtf().sendKeys("Pune");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	lp.getEmailtf().sendKeys("admin");
}
}
