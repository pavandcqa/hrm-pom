package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement title;
	
	@FindBy(xpath = "//span[@class = 'oxd-userdropdown-tab']")
	WebElement userDropDown;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;
	
	@FindBy(xpath = "//p[text()='Time at Work']")
	WebElement timeAtWork;
	
	@FindBy(xpath = "//p[text()='My Actions']")
	WebElement myActions;
	
	@FindBy(xpath = "//p[text()='Assign Leave']")
	WebElement assignLeave;
	
	@FindBy(xpath = "//p[text()='Leave List']")
	WebElement leaveList;
	
	@FindBy(xpath = "//span[text()='My Info']")
	WebElement myInfoModuleLink;
	
	public String getTitle() {
		return title.getText();
	}
	
	public boolean verifyPresenceOfDashboardTitle() {
		return title.isDisplayed();
	}
	
	public void clickUserDD() {
		userDropDown.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public boolean verifyExistanceOfTimeAtWork() {
		boolean status = timeAtWork.isDisplayed();
		return status;
	}
	
	public boolean verifyExistanceOfMyActionsSection() {
		boolean status = myActions.isDisplayed();
		return status;
	}
	
	public boolean verifyExistanceOfAssignLeaveSection() {
		boolean status = assignLeave.isDisplayed();
		return status;
	}
	
	public boolean verifyExistanceOfLeaveListSection() {
		boolean status = leaveList.isDisplayed();
		return status;
	}
	
	public boolean verifyExistanceOfMyInfoModule() {
		boolean status = myInfoModuleLink.isDisplayed();
		return status;
	}
	
	public void clickMyInfo() {
		myInfoModuleLink.click();
	}
}
