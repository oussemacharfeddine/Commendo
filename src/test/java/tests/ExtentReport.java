package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	ExtentReports extent;
	ExtentSparkReporter htmlReporter;
	
@BeforeSuite
public void reportSetup(){
	htmlReporter = new ExtentSparkReporter("extent.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
}
@AfterSuite
public void reportTearDown() {
	
	extent.flush();
	
}
}
