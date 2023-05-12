package tests;

import java.awt.GraphicsConfiguration;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.ExtentX;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.tess4j.util.LoggHelper;
import org.monte.media.av.Format;
import org.monte.media.av.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.*;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.*;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.aventstack.extentreports.reporter.filter.*;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

public class ExtentReport {
	static AndroidDriver driver;
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
