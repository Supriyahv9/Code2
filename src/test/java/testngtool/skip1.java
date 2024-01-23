package testngtool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class skip1 {

	@Test
	public void AjioTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		String actualurl = driver.getCurrentUrl();
		
		String expectedurl = "https://www.ajio.com/pune";
		
		Assert.assertEquals(actualurl, expectedurl);
		
		System.out.println("Good morning");
	}
	
	@Test
	public void AjiohomeTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		WebElement searchtf = driver.findElement(By.name("searchVal"));
		searchtf.sendKeys("watche");
		searchtf.sendKeys(Keys.ENTER);
		
	}
}
