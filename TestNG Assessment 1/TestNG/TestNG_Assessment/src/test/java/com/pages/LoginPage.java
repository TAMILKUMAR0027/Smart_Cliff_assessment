package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class LoginPage extends basePage{

	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement loginBtn;
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement clickLogin;
	@FindBy(xpath = "//p[text()='Email Address already exist!']")
	WebElement assertError;
	@FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
	WebElement invalid;
	public void login(String user,String pass) {
		loginBtn.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		clickLogin.click();
	}
	public void inValidLogin(String user,String pass) {
		loginBtn.click();
		username.sendKeys(user);
		password.sendKeys(pass);
		clickLogin.click();
	}
	public String getNotCreated() {
		return assertError.getText();
	}
	public String getInvalidCreation() {
		return invalid.getText();
	}
}
