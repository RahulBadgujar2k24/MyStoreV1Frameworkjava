package com.mystore.TestScript;

import org.testng.annotations.Test;

import com.mystore.pom.IndexPage;
import com.mystore.pom.MyAccountPage;

public class TC01_MyAccountPageTest extends baseclassTC


{

	@Test
	public void navigateRegestration() {
		
		
	driver.manage().window().maximize();
		
		IndexPage ip=new IndexPage(driver);
		ip.clickonsignIn();
		logger.info("click on signIn Link");
		
		MyAccountPage ma=new MyAccountPage(driver);
		// which email id for use create an account
		ma.enterCreateEmailAddress("yashwardhanrahul1307@gmail.com");
		ma.clickSubmitCreate(); 
		
		
		
		
	}


	}

