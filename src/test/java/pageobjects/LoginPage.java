package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement loginPageTitle;
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement userName;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//p[text()='Invalid credentials']")
	WebElement invalidLoginMsg;
	
	public String getTitle() {
		return loginPageTitle.getText();
	}
	
	public void setUserName(String uName) {
		userName.clear();
		userName.sendKeys(uName);
	}
	
	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public boolean verifyInvalidCredentialsMsg() {
		return invalidLoginMsg.isDisplayed();
	}
	
	public void login(String uname, String pwd) {
		setUserName("Admin");
		setPassword("admin123");
		clickLoginBtn();
	}
	
}
