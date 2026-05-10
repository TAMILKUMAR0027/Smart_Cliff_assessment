package com.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utilities.data;
@Listeners()
public class LoginTest extends baseTest{
	DashboardPage dp;
	LoginPage lp;
  @Test(dataProvider = "LoginData",dataProviderClass = data.class,priority = 3)
  public void login(String email,String password) {
	  LoginPage lp=new LoginPage(driver, wait);
	  lp.login(email, password);
	  DashboardPage dp=new DashboardPage(driver, wait);
	  String Expected ="TAMILKUMAR";
	  Assert.assertEquals(Expected, dp.getUserName());
  }
  @Test(dataProvider = "Invalid_LoginData",dataProviderClass = data.class,priority =  4)
  public void InvalidLogin(String user,String pass) {
	  LoginPage lp=new LoginPage(driver, wait);
	  lp.inValidLogin(user,pass);
	  String expected="Your email or password is incorrect!";
	  Assert.assertEquals(expected, lp.getInvalidCreation());
  }
}
