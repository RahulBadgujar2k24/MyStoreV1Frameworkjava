package com.mystore.TestScript;

import org.testng.annotations.Test;

import com.mystore.pom.IndexPage;
import com.mystore.pom.MyAccountPage;
import com.mystore.pom.RegistrationPage;

public class TC02_RegistrationPageTest extends baseclassTC {

	@Test()

	public void addcredentials() {

		
		driver.manage().window().maximize();

		IndexPage ip = new IndexPage(driver);
		ip.clickonsignIn();
		logger.info("click on signIn Link");

		MyAccountPage ma = new MyAccountPage(driver);
		// which email id for use create an account
		ma.enterCreateEmailAddress("rahularya8087@gmail.com");
		ma.clickSubmitCreate();

		RegistrationPage reg1 = new RegistrationPage(driver);
		reg1.selectgender();
		logger.info("gender select");
		reg1.enterfn("RAHUL");
		logger.info("enter firstname");
		reg1.enterln("BADGUJAR");
		logger.info("enter lastname");
		reg1.enteremail("rahularya8087.com");
		logger.info("enter emailid");
		reg1.enterpass("R@hul143");
		logger.info("enter password");
		reg1.Enterdateofbirth();
		logger.info("select date of birth");
		reg1.selectnews();
		logger.info("select news letter option");
		//For creation of an account comment out of clickon button
	//	reg1.clickonbutton();
	//	logger.info("click on register button");
		

	}

}
