package testngtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test3 {
	
	
	
	@Test
	public void MyntraTest() {
		
		SoftAssert s = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		
	String	expectedurl="https://www.myntra.com/deccan";
		
	//Assert.assertEquals(actualurl, expectedurl);
	s.assertEquals(actualurl, expectedurl);
	System.out.println("Good afternoon");
	s.assertAll();
	}

}
