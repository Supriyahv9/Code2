package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationinformationPage {

	@FindBy(name="accountname")
	private WebElement Organizationnametf;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement groupradiobtn;
	
	@FindBy(name="assigned_group_id")
	private WebElement dropdown;
	
	@FindBy(name="industry")
	private WebElement dropdownindustry;
	
	@FindBy(xpath="(//input[@name='button'])[3]")
	private WebElement savebtn;
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}



	public WebElement getDropdownindustry() {
		return dropdownindustry;
	}



	public WebElement getDropdown() {
		return dropdown;
	}



	public WebElement getGroupradiobtn() {
		return groupradiobtn;
	}



	public WebElement getOrganizationnametf() {
		return Organizationnametf;
	}
	
	
}
