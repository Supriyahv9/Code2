package testngtool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test5 {

	

		
	@Test
	public void MyntraTest() {
		
		SoftAssert s = new SoftAssert();	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.className("desktop-searchBar"));
	
		
		
		//s.assertTrue(searchtf.isDisplayed());//True condition---Pass
		
	//	s.assertTrue(searchtf.isSelected());//False Condition----Fail
		
		//s.assertFalse(searchtf.isDisplayed());//True Condition---Fail
	
		s.assertFalse(searchtf.isSelected());//False condition---pass
		
		s.assertAll();
	
	}
	}


