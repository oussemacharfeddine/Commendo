package tests;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import Config.baseClass;
import pageObjects.changeCode;
import pageObjects.loginPage;
import Reports.extentReport;








public class offline_Authentication extends extentReport{
	
	public loginPage LoginPage;
	public changeCode changecode ;
	public extentReport extentreport;
	public baseClass desiredcapabilities;
	
	
	
	@BeforeTest
	public void setUp() throws IOException {

		desiredcapabilities = new baseClass();
		driver = desiredcapabilities.setup();
		
	}

	
    
	
	
	@Test
    public void login(){



 


  
   ExtentTest Auth = extent.createTest("login");
   Auth.assignCategory("User_Authentification");
   
	LoginPage = new loginPage();
	PageFactory.initElements(driver, LoginPage);
	
	changecode = new changeCode();
	PageFactory.initElements(driver, changecode);
	
	
 try {
	

LoginPage.zero.click();
loginPage.one.click();
LoginPage.two.click();
LoginPage.three.click();
LoginPage.four.click();
LoginPage.closeButton.click();



changecode.changecode();

loginPage.one.click();
loginPage.one.click();
loginPage.one.click();
loginPage.one.click();
loginPage.one.click();

Auth.log(Status.PASS, "Passed test");

 }
catch(Exception e) {
	e.printStackTrace();	
	
}
	}
	
}






