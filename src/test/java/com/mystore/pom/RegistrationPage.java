package com.mystore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver localdriver;

	public RegistrationPage(WebDriver rdriver) {
		localdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement radio;

	@FindBy(id = "customer_firstname")
	WebElement fn;

	@FindBy(id = "customer_lastname")
	WebElement ln;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "passwd")
	WebElement pass;

	@FindBy(id = "days")
	WebElement Sday;

	@FindBy(id = "months")
	WebElement Smonth;

	@FindBy(id = "years")
	WebElement Syear;

	@FindBy(id = "newsletter")
	WebElement news;
	
	@FindBy(xpath = "//span[text()='Register']")
	WebElement button;
	
	public void selectgender() {
		radio.click();
	}
	
	public void enterfn(String Efn) {
		fn.sendKeys(Efn);
	}
	
	public void enterln(String Eln) {
		ln.sendKeys(Eln);
	}
	public void enteremail(String Eemail) {
		email.sendKeys(Eemail);
	}
	
	public void enterpass(String Epass) {
		pass.sendKeys(Epass);
	}
	public void Enterdateofbirth() {
		Select sct1=new Select(Sday);
		sct1.selectByIndex(26);
		
		Select sct2=new Select(Smonth);
		sct2.selectByValue("9");
		
		Select sct3=new Select(Syear);
		sct3.selectByValue("1990");
		
	}
	
	public void selectnews() {
		news.click();
	}
	public void clickonbutton() {
		button.click();
	}

}
