package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.RegisterPage;
import com.utilities.data;

public class RegisterTest extends baseTest{
	RegisterPage rp;
	LoginPage lp;
  @Test(dataProvider = "RegisterData",dataProviderClass = data.class,priority = 1)
  public void register(String name,String email,String pass,String fn,String ln,String state,String city,String zip,String mobile) {
	  RegisterPage rp=new RegisterPage(driver, wait);
	  rp.register(name, email, pass, fn, ln, ln, state, city, zip, mobile);
	  String expected="ACCOUNT CREATED!";
	  Assert.assertEquals(expected, rp.getAccountCreation());
  }
  @Test(dataProvider = "Invalid_RegisterData",dataProviderClass = data.class,priority = 2)
  public void InValid_register(String name,String email) {
	  RegisterPage rp=new RegisterPage(driver, wait);
	  rp.invalidRegister(name, email);
	  LoginPage lp=new LoginPage(driver, wait);
	  String expected="Email Address already exist!";
	  Assert.assertEquals(expected, lp.getNotCreated());
  }
}
