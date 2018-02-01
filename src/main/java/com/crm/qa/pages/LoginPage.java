package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
public class LoginPage extends TestBase{
	

	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(className="img-responsive")
	WebElement crmLogo;
	
	public LoginPage()
	{
		 PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLogo()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage Login(String un,String pwd)
	{
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
		
	}
	
}
