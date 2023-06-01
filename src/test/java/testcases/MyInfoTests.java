package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class MyInfoTests extends TestBase{

	@Test(priority = 1, groups = {"myinfo", "regression"})
	public void verifyAddEmergenceyContact() {
		dashboardPage.clickMyInfo();
		myInfoPage.clickEmergencyContacts();
		myInfoPage.clickAddContact();
		myInfoPage.setName("Shiva");
		myInfoPage.setRelationship("Brother");
		myInfoPage.setMobile("123334");
		myInfoPage.clickSave();
	}
	
	@Test(priority = 1, groups = {"myinfo", "regression"})
	public void verifyDeleteAllContacts() {
		dashboardPage.clickMyInfo();
		myInfoPage.clickEmergencyContacts();
		myInfoPage.clickAllCheckbox();
		myInfoPage.clickDeleteSelected();
		myInfoPage.clickDeleteSelected();
	}
	
}
