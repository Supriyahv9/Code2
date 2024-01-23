package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillrary1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();*/
		
	
	//	Step1:To Read data from External File
	FileInputStream fis = new FileInputStream("src\\test\\resources\\data1.properties");
	
	//Step2:To read data from Property file
	Properties p = new Properties();
	
	//Step3:To fetch the location of property file
	p.load(fis);
	
	//Step4:We read all keys present in property file
	String URL = p.getProperty("urlskillrary");
	String EMAIL = p.getProperty("Email");
	String PASSWORD = p.getProperty("passwords");
	
	//Step5:Load the url
	driver.get(URL);
	
	//Step6:Login to application
	driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys(EMAIL);
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(PASSWORD);
	Thread.sleep(2000);
	driver.findElement(By.id("last")).click();
	
	
	
	

}
}
