package com.xomicTest.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartRegisteredPage1 {
	// create object of webdriver
	WebDriver localdriver;
	//create constructor 
	public OpenCartRegisteredPage1(WebDriver rdriver) {
		//initialised the driver
		localdriver=rdriver;
		//use pagefactory
		PageFactory.initElements(rdriver, this);
		
	}
	// identify element
	@FindBy (name="firstname")
	WebElement R1;
	@FindBy(name="lastname")
	WebElement R2;
	@FindBy(name="email")
	WebElement R3;
	@FindBy(name="password")
	WebElement R4;
	@FindBy(xpath="//input[@name='agree']")
	WebElement R5;
	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/button")
	WebElement R6;
	
	// provide action on element
	public void setFirstname(String fn)
	{
		R1.sendKeys(fn);
	}
	public void setLastname(String ln) {
		R2.sendKeys(ln);
	}
	public void setEmailaddress(String email) {
		R3.sendKeys(email);
	}
	
	public void setpassword(String pass) {
		R4.sendKeys(pass);
	}
	public void privacypolicy() {
		R5.click();
	}
	public void clickonbutton() {
		R6.click();
	}
	}
	


