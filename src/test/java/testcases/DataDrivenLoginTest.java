package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;

public class DataDrivenLoginTest extends TestBase{

	@DataProvider
	public Object[][] testData() {
		
		Object[][] data = {{"admin","admin123"},{"admin","123ac"},{"abc","admin123"}};
		return data;
	}
		
	
	@Test(dataProvider = "testData")
	public void verifyLoginUsingDataDrivenApproach(String uName, String Pwd) {
		
		System.out.println("Enter valid username");
		loginPage.setUserName(uName);

		System.out.println("Enter password");
		loginPage.setPassword(Pwd);

		System.out.println("Click on Login Button");
		loginPage.clickLoginBtn();
	}
	
}
