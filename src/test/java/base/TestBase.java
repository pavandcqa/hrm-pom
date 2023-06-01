package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.MyInfoPage;
import util.ConfigReader;

public class TestBase {

	protected static ConfigReader configReader;
	protected static WebDriver driver;
	protected LoginPage loginPage;
	protected DashboardPage dashboardPage;
	protected MyInfoPage myInfoPage;

	@BeforeMethod
	public void setUp() {

		configReader = new ConfigReader();

		System.out.println("*************** Setup browser and navigate to applcaiton ***************");
		initializeBrowser(configReader.getBrowserOption());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(configReader.getAppUrl());

		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		myInfoPage = new MyInfoPage(driver);

		loginPage.login(configReader.getUserName(), configReader.getPassword());

	}

	@AfterMethod
	public void tearDown() {

		System.out.println("***********logout****************");
		dashboardPage.clickUserDD();
		dashboardPage.clickLogout();
		System.out.println("****************close the browser***********");
		driver.close();
	}

	public static void initializeBrowser(String browserOption) {

		switch (browserOption) {
		case "firefox":
			System.setProperty(configReader.getFirefoxKey(), configReader.getFirefoxPath());
			driver = new FirefoxDriver();
			break;

		case "chrome":
			System.setProperty(configReader.getChromeKey(), configReader.getChromePath());
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("Invalid browser selection");
		}

	}

}
