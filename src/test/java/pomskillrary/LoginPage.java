package pomskillrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement logintxt;
	
	@FindBy(id="email")
	private WebElement emailtf;

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getLogintxt() {
		return logintxt;
	}
}
