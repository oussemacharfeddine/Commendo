package tests;

import java.awt.Desktop;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.testng.annotations.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.screenrecording.ScreenRecordingUploadOptions;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import ru.sbtqa.monte.screenrecorder.ScreenRecorder;


public class Manual_Auto extends Offline_Control_Mode {


 @Test
	 public void addAutomationScene() {
		 ExtentTest AA = extent.createTest("Add automation scene");
		 AA.assignCategory("Add/Edit__automated_scenarios");	
		 
		 try {
			 
			 WebElement Es = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Accueil\"]/android.widget.ImageView"));	 
			 Es.click();
			 
			 WebElement Ez = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.cardview.widget.CardView[2]/android.widget.RelativeLayout/android.widget.Button"));
			 Ez.click();
			 
			 WebElement Et = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Automatisation\"]/android.widget.TextView"));
			 Et.click();
			 
			 WebElement Er = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button"));
			 Er.click();
			 
			 WebElement EI = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
			 EI.click();
			 EI.sendKeys("auto");
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		 } catch (Exception e) {
			 
			 
		 }
		 
	 }
}
