package com.mystore.TestScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.pom.IndexPage;
import com.mystore.pom.LoginPage;
import com.mystore.utilities.ReadExcelFile;

public class TC03_LoginPageTest extends baseclassTC {

	@Test()
	public void verifyLogin() throws IOException {

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

		String validatename = lp.getUserName();
		if (validatename.equals("Rahul BADGUJAR")) {
			logger.info("verify login -passed");
			Assert.assertTrue(true);
			lp.clicklogoutbutton();
			logger.info("signout ");
		} else {
			logger.info("verify login -failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);

		}

	}

}
