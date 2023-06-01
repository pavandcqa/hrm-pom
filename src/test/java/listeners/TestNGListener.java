package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;

public class TestNGListener extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("*** Test Execution Started --> " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Test Execution Passed --> " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test Case Failed --> " + result.getName());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destLocation = new File("Screenshots", result.getName() + ".png");
		try {
			FileUtils.copyFile(sourceFile, destLocation);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test Execution Skipped --> " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("*** Test Execution Started ****");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("*** Test Execution Completed ****");
		
	}

	
	
}
