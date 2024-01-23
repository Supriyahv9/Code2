package Basiclistener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.Listenerimplementation;


@Listeners(Listenerimplementation.class)
public class TiraTest {
	@Test
	public void PerfumeTest() {
		WebDriver dc = new ChromeDriver();
		dc.manage().window().maximize();
		dc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dc.get("https://www.tirabeauty.com/");
		
		WebElement searchtf = dc.findElement(By.id("searchs"));
		searchtf.sendKeys("Perfumes");
		searchtf.sendKeys(Keys.ENTER);
		
	}
	
	@Test
	public void LaunchTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Assert.assertEquals("Pune", "Deccan");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	}
	
	
}
