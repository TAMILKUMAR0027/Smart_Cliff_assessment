package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DashboardPage extends basePage{

	public DashboardPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//b[normalize-space()='TAMILKUMAR']")
	WebElement LoggedUsername;
	public String getUserName() {
		return LoggedUsername.getText();
	}
}
