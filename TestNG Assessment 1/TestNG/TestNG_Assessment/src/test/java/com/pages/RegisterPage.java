package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends basePage{

	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement loginBtn;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement nameOfUser;
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement signUpBtn;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address;
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement phone;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement createAccBtn;
	@FindBy(xpath = "//b[text()='Account Created!']")
	WebElement assertAccount;
	public void register(String name,String emailId,String pass,String fn,String ln,String address1,String stateofUser,String cityOfUser,String zip,String mobile) {
		loginBtn.click();
		nameOfUser.sendKeys(name);
		email.sendKeys(emailId);
		signUpBtn.click();
		password.sendKeys(pass);
		firstName.sendKeys(fn);
		lastname.sendKeys(ln);
		address.sendKeys(address1);
		state.sendKeys(stateofUser);
		city.sendKeys(cityOfUser);
		zipcode.sendKeys(zip);
		phone.sendKeys(mobile);
		createAccBtn.click();
	}
	public void invalidRegister(String name,String emailId) {
		loginBtn.click();
		nameOfUser.sendKeys(name);
		email.sendKeys(emailId);
		signUpBtn.click();
	}
	public String getAccountCreation() {
		return assertAccount.getText();
	}
}
