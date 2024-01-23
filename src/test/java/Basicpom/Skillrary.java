package Basicpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys("Pune");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		emailtf.sendKeys("admin");
		
		
	}

}
