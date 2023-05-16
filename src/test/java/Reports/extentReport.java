package Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;

public class extentReport {
	public static AndroidDriver driver;
	 public ExtentReports extent;
	ExtentSparkReporter htmlReporter;
	
	




  


	

	
@BeforeSuite
public void reportSetup() throws IOException{
	htmlReporter = new ExtentSparkReporter("Rapport.html");
	htmlReporter.config().setReportName("Commendo Release 0.11.0");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Device", "Samsung A11");
	extent.setSystemInfo("Equipment device", "Device B6R4");
	extent.setSystemInfo("OS", "Android");
	extent.setSystemInfo("Author", "Charfeddine oussema");
	extent.setSystemInfo("Product release", "Commendo V0.11.0");
	extent.getStats();



	
	







}
public static String CaptureScreen(AndroidDriver driver) throws IOException{
	File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshots/"+ System.currentTimeMillis()+".png");
		String absolutepath_screen = destFile.getAbsolutePath();
		FileUtils.copyFile(srcfile, destFile);
		return absolutepath_screen;
		
		

}




@AfterSuite
public void reportTearDown() {
	
	
	extent.flush();
	

}
}
