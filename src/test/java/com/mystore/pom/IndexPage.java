package com.mystore.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	WebDriver localdriver;

	public IndexPage(WebDriver rdriver) {
		localdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

// identify Element 
	@FindBy(xpath ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement R1;

// action on element 
	public void clickonsignIn() {
		R1.click();
	}

}
