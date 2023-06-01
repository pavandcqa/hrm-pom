package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginPageTests extends TestBase {

	@Test(priority = 1, groups = { "smoke", "login" })
	public void verifyLoginWithValidCredentials() {

		//Assert.assertTrue(loginPage.getTitle().contains("Login"), "Login Page not loaded..");

		System.out.println("Enter valid username");
		loginPage.setUserName("Admin");

		System.out.println("Enter password");
		loginPage.setPassword("admin123");

		System.out.println("Click on Login Button");
		loginPage.clickLoginBtn();

		System.out.println("Verify Login Success message displayed or user navigates to Dashboard");
		Assert.assertTrue(dashboardPage.verifyPresenceOfDashboardTitle(), "Dashboard page not loaded...");
	}

	@Test(priority = 2, groups = { "smoke", "login" })
	public void verifyLoginWithInvalidCredentials() {

		//Assert.assertTrue(loginPage.getTitle().contains("Login"), "Login Page not loaded..");

		System.out.println("Enter valid username");
		loginPage.setUserName("Admin");

		System.out.println("Enter password");
		loginPage.setPassword("admin");

		System.out.println("Click on Login Button");
		loginPage.clickLoginBtn();
		
		Assert.assertTrue(loginPage.verifyInvalidCredentialsMsg(), "Login successfuly");

	}

}
