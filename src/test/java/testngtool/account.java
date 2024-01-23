package testngtool;

import org.testng.Assert;
import org.testng.annotations.Test;

public class account {

	@Test
	public void Createaccount() {
		
		Assert.assertEquals("Pune", "Deccan");
		System.out.println("account is created");
	}
	
	@Test(dependsOnMethods="Createaccount")
	public void Deleteaccount() {
		System.out.println("account is deleted");
	}
	
	@Test
	public void Editaccount() {
		System.out.println("account is edited");
	}
}
