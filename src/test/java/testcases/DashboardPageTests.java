package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class DashboardPageTests extends TestBase{

	@Test(priority = 1, groups = {"dashboard", "smoke"})
	public void verifyTimeAtWork() {
		
		Assert.assertTrue(dashboardPage.verifyExistanceOfTimeAtWork(), "Time At work section not loaded..");
	}
	
	@Test(priority = 2, groups = {"dashboard", "smoke"})
	public void verifyMyActions() {
		Assert.assertTrue(dashboardPage.verifyExistanceOfMyActionsSection(), "My Actions section not loaded..");
	}
	
	@Test(priority = 2, groups = {"dashboard", "smoke"})
	public void verifyAssignLeave() {
		Assert.assertTrue(dashboardPage.verifyExistanceOfAssignLeaveSection(), "Assign Leave section not loaded..");
	}
	
	@Test(priority = 2, groups = {"dashboard", "smoke"})
	public void verifyLeaveList() {
		Assert.assertTrue(dashboardPage.verifyExistanceOfLeaveListSection(), "Leave List section not loaded..");
	}
}
