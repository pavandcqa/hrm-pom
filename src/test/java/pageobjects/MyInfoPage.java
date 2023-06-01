package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {

	public MyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Emergency Contacts']")
	WebElement emergencyContacts;
	
	@FindBy(xpath = "(//button[@type=\"button\"])[3]")
	WebElement addContact;
	
	@FindBy(xpath = "(//input[contains(@class,' oxd-input--active')])[2]")
	WebElement nameInput;
	
	@FindBy(xpath = "(//input[contains(@class,' oxd-input--active')])[3]")
	WebElement relationshipInput;
	
	@FindBy(xpath = "(//input[contains(@class,' oxd-input--active')])[5]")
	WebElement mobileNum;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	WebElement allCheckBox;
	
	@FindBy(xpath = "//button[contains(@class,'label-danger')]")
	WebElement deleteSelected;
	
	public void clickEmergencyContacts() {
		emergencyContacts.click();
	}
	
	public void clickAddContact() {
		addContact.click();
	}
	
	public void setName(String name) {
		nameInput.clear();
		nameInput.sendKeys(name);
	}
	
	public void setRelationship(String relationName) {
		relationshipInput.clear();
		relationshipInput.sendKeys(relationName);
	}
	
	public void setMobile(String mobile) {
		mobileNum.clear();
		mobileNum.sendKeys(mobile);
	}
	
	public void clickSave() {
		saveBtn.click();
	}
	
	public void clickAllCheckbox() {
		allCheckBox.click();
	}
	
	public void clickDeleteSelected() {
		deleteSelected.click();
	}
	
}
