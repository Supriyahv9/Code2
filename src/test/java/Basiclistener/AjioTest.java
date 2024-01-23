package Basiclistener;

import java.io.IOException;
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
import CommonUtils.WebDriverUtil;

@Listeners(Listenerimplementation.class)
public class AjioTest {

	//WebDriverUtil wutils = new WebDriverUtil();
	@Test
	public void PerfumeTest() throws IOException {
		WebDriver dc = new ChromeDriver();
		dc.manage().window().maximize();
		dc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dc.get("https://www.ajio.com/");
		//Assert.assertEquals("Pune", "Deccan");
		//wutils.totakescreenshot(dc, "ajio");
		System.out.println("Good morning");
		
		
		
	}
}
