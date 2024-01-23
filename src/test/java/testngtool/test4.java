package testngtool;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 {

	@Test
	public void AjioTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		WebElement searchtf = driver.findElement(By.name("searchVal"));
		searchtf.sendKeys("perfumes");
		searchtf.sendKeys(Keys.ENTER);
		WebElement Checkbox = driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"));
	
		Checkbox.click();
		
		Assert.assertTrue(Checkbox.isSelected());
	
	System.out.println("Good morning");
	
	
	
	
	}
}
