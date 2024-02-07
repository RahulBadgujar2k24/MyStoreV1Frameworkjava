package com.mystore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver localdriver;

	public LoginPage(WebDriver rdriver) {
		localdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

// identify Element 
	
	
	@FindBy(id ="email")
	WebElement ulog;
	
	@FindBy(id ="passwd")
	WebElement upass;
	

	@FindBy(id ="SubmitLogin")
	WebElement clicklogin;
	
	@FindBy(xpath = "//a[@title='View my customer account']") 
	WebElement profilename;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a") 
	WebElement logout;
	

// action on element 
	
     public void entervalidUID(String userlogUID) {
    	 ulog.sendKeys(userlogUID);
     }
     public void entervalidPASS(String userlogPASS) {
    	 upass.sendKeys(userlogPASS);
     }
     public void clickloginbutton() {
 		clicklogin.click();
 	}
 	public String getUserName()
 	{
 		String text = profilename.getText();

 		return text;
 	}
 	  public void clicklogoutbutton() {
 	 		logout.click();
 	 	}
}
