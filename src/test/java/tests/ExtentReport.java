package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class ExtentReport {
	ExtentReports extent;
	ExtentSparkReporter htmlReporter;
	public static AndroidDriver driver;
	
@BeforeSuite
public void reportSetup(){
	htmlReporter = new ExtentSparkReporter("extent.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);

}
public String captureScreenshot(String fileName) {
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshots/"+ fileName);
	try {
		FileUtils.copyFile(sourceFile, destFile);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Screenshot saved successfully");
	return destFile.getAbsolutePath();
}

@AfterSuite
public void reportTearDown() {
	
	extent.flush();
	
}
}
