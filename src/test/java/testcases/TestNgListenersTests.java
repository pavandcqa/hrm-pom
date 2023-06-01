package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TestNgListenersTests extends TestBase{

	@Test(priority = 1)
	public void testCaseOne() {
		
		System.out.println("Test case one");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2)
	public void testCaseTwo() {
		
		System.out.println("Test case Two");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 3, dependsOnMethods = "testCaseTwo")
	public void testCaseThree() {
		
		System.out.println("Test case Three");
		Assert.assertTrue(true);
		
	}
	
}
