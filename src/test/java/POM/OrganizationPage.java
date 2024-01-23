package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage {

	
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement plusiconorg;

	public WebElement getPlusiconorg() {
		return plusiconorg;
	}
}
