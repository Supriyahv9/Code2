package testngtool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myntra1 {

	
	@Test
	public void MyntraTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		WebElement searchtf = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	
	//	Assert.assertTrue(searchtf.isDisplayed());//True condition----Pass
	
	//	Assert.assertTrue(searchtf.isSelected());//False condition----Fail
	
	//	Assert.assertFalse(searchtf.isDisplayed());//True condition----fail
	
		Assert.assertFalse(searchtf.isSelected());//False condition---Pass
	
	}
}
