package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://www.ajio.com/");
		WebElement searchtf = driver.findElement(By.name("searchVal"));
		searchtf.sendKeys("Perfumes");
		searchtf.sendKeys(Keys.ENTER);*/
		
//		Step1:To Read data from External File
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Ajio.properties");
		
		//Step2:To read data from Property file
		Properties p = new Properties();
		
		//Step3:To fetch the location of property file
		p.load(fis);
		
		//Step4:We read all keys present in property file
		String URL = p.getProperty("url");
		String SEARCH = p.getProperty("search");
	
		//Step5:Load the url
		driver.get(URL);
		
		//Step6:Search the product
		WebElement searchtf = driver.findElement(By.name("searchVal"));
		searchtf.sendKeys(SEARCH);
		searchtf.sendKeys(Keys.ENTER);
	
	
	
	
	
	
	
	
	
	
	}

}
