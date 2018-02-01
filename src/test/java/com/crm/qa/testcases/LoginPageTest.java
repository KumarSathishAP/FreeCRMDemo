package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Intialization();
		login = new LoginPage();
	}
	
	@Test
	public void loginPageTitleTest()
	{
		String title= login.validateTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
	@Test
	public void LoginPageLogoTest()
	{
		Boolean flag = login.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginPageValidInput()
	{
		homepage = login.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
