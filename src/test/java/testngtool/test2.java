package testngtool;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test2 {

	
	@Test
	public void AjioTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
		String expectedurl = "https://www.ajio.com/pune";
		
		/*if(actualurl.equals(expectedurl)) {
			System.out.println("url is same");
		}else {
			System.out.println("url is different");
		}*/
		
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(10));
		waits.until(ExpectedConditions.urlToBe(expectedurl));
		
		System.out.println("Good morning");
	}
}
