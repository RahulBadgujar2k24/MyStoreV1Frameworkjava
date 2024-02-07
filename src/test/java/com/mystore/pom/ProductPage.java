package com.mystore.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	WebDriver localdriver;

	public ProductPage(WebDriver rdriver) {
		localdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "search_query_top")
	WebElement search;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	WebElement searchbutton;

	@FindBy(xpath = "//*[@id=\"best-sellers_block_right\"]/div/ul/li[2]/div/h5/a")
	WebElement product;

	@FindBy(id = "group_1")
	WebElement selectdropsize;

	@FindBy(id = "quantity_wanted")
	WebElement quantityWanted;

	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	WebElement addtocart;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement Proceed1;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement Proceed2;
	
	public void clickonseach() {
		search.click();
		search.sendKeys("T-shirt");// T-shirt

		searchbutton.click();

	}

	public void productselect() {

		JavascriptExecutor js = (JavascriptExecutor) localdriver;
		js.executeScript("window.scrollBy(0,600)", "");
		product.click();

		System.out.println("==");

	}

	public void setSize(String entersize) {
		Select sct = new Select(selectdropsize);
		sct.selectByVisibleText(entersize);
	}

	public void setQuantity(String qty) {
		quantityWanted.clear();
		quantityWanted.sendKeys(qty);
	}

	public void clickonaddtocart() {
		addtocart.click();
		Proceed1.click();
		JavascriptExecutor js = (JavascriptExecutor) localdriver;
		js.executeScript("window.scrollBy(0,600)", "");
		Proceed2.click();
		
	}

}
