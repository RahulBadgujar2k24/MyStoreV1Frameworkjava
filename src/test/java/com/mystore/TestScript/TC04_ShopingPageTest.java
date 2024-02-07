package com.mystore.TestScript;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.mystore.pom.IndexPage;
import com.mystore.pom.LoginPage;
import com.mystore.pom.ProductPage;

public class TC04_ShopingPageTest extends baseclassTC {

	@Test()
	public void shopping() throws IOException {

		driver.manage().window().maximize();

		IndexPage ip = new IndexPage(driver);
		ip.clickonsignIn();
		logger.info("click on signIn Link");

		LoginPage lp = new LoginPage(driver);
		lp.entervalidUID("rahularya387@gmail.com");
		logger.info("enter valid uid");
		lp.entervalidPASS("R@hul143");
		logger.info("enter valid pass");
		lp.clickloginbutton();
		logger.info("click on login button");

		ProductPage pp = new ProductPage(driver);
		pp.clickonseach();
		logger.info("click on search button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pp.productselect();
		logger.info("select the product");
		pp.setSize("M");
		logger.info("select size product");
		pp.setQuantity("5");// 5 nos
		logger.info("select qty product");
		pp.clickonaddtocart();
		logger.info("add to product");

	}
}
