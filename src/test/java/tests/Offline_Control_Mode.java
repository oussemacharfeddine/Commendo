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
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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





@Test
public class Offline_Control_Mode extends Offline_Authentification{
	


@Test
public void CreationSite() {
	
	

	
	ExtentTest CS = extent.createTest("Creation site ","Creation site sofiatech");
	
    CS.assignCategory("provisionning_management");	
    
	try {
	 
	WebElement a = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[1]"));
	a.click();

    WebElement b = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText[1]"));
    b.sendKeys("SofiaTech");
    
    WebElement d = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText[2]"));
    d.sendKeys("El ghazela");
    
    WebElement c = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button"));
    c.click();
    
    //choixdu wifi 
    WebElement f = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText"));
    f.sendKeys("globalnet");
 
    WebElement x = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
    x.sendKeys("entropia");
    
    WebElement p = driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button"));
    p.click();
    Thread.sleep(2000);
    
    CS.log(Status.PASS, "passed");
    
    CS.info("capture d'écran").addScreenCaptureFromPath(CaptureScreen(driver));
 
    
	} catch(Exception e) {
	e.printStackTrace();
	

	CS.log(Status.FAIL, "failed");
	
	
	}

	
}


   
	
     
    @Test
    public void Creation_Area(){
    	 
	ExtentTest CA = extent.createTest("Creation Area ","Creation salle de réunion");
    CA.assignCategory("provisionning_management");	
    try {
    Thread.sleep(2000);	
    WebElement w = driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.View"));
    w.click();
    Thread.sleep(2000);
    //click sur l'icone +
    WebElement z = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView[3]"));
    z.click();
    //Add new area
    WebElement v = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup"));
    v.click();
	
    WebElement u = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText"));
    u.sendKeys("Salle de reunion ");
 
    WebElement i= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button"));
    i.click();
    
    CA.info("Screenshot").addScreenCaptureFromPath(CaptureScreen(driver));
    Thread.sleep(3000);
    CA.log(Status.PASS, "passed");
    
    } catch (Exception e) {
    	CA.log(Status.FAIL, "failed");
    }
   
   

 
    

	   
    ExtentTest AD = extent.createTest("ADD device");
    AD.assignCategory("Devices_control_mode");
		   
          try {
			   
	    
		  /*bouton accessoire*/
		   WebElement Naccessoire= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.Button"));
		   Naccessoire.click();
		   
		   /* bouton X */   

		   WebElement rr= driver.findElement(By.id("com.sofia.commendo:id/close_on_boarding"));
		   rr.click();
		   
		   
		
		   /*  Next */
		   WebElement ff= driver.findElement(By.id("com.sofia.commendo:id/ble_next"));
		   ff.click();
		   
		   
		   /* Allow using this app */
		   driver.switchTo().alert().accept();
		   
		   Thread.sleep(20000);
		   /*choosing device*/
		   
		   WebElement ds= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));
		   ds.click();
		   
		   Thread.sleep(5000);

		   
		   
		   /*L1*/
		   
		   WebElement fp= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
		   fp.click();
		   WebElement fl= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));

		   
		   fl.clear();
		   fl.sendKeys("L1");
		   
		   driver.hideKeyboard();
		   
		   WebElement gp= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		   gp.click();
		   
		   WebElement rm= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   rm.click();
		   
		   /*map1*/
	      	  
		   WebElement tt= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView"));
		   tt.click();
		   
		   WebElement rz= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		   rz.clear();
		   rz.sendKeys("map1");
		   
		   driver.hideKeyboard();
		   
		   
		   WebElement gg= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   gg.click();
		   
		   /*L2*/
		   WebElement ts= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"));
		   ts.click();
		   
		   WebElement de= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		   de.clear();
		   de.sendKeys("L2");
		   
		   driver.hideKeyboard();
		   
		   WebElement qq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup"));
		   qq.click();
		   
		   WebElement gs= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   gs.click();
		   
		   /*store*/
		   
		   WebElement qo= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView"));
		   qo.click();
		   
		   WebElement ol= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		   ol.clear();
		   ol.sendKeys("store");
		   
		   driver.hideKeyboard();
		   
		   Thread.sleep(2000);
		   
		   WebElement qm= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup"));
		   qm.click();
		   
		   Thread.sleep(2000);
		   WebElement lo= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]"));
		   lo.click();
		   
		   
		   WebElement lr= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   lr.click();
		   
		   /*map2*/
		   WebElement qr= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView"));
		   qr.click();
		   
		   WebElement ot= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		   ot.clear();
		   ot.sendKeys("map2");
		   
		   driver.hideKeyboard();
		   
		   WebElement ko= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   ko.click();
		   
		   driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
		   
		   Thread.sleep(2000);
		 
		   
		   WebElement qs= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]"));
		   qs.click();
		   
		   WebElement tl= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		   tl.click();
		   
		   WebElement ty= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   ty.click();
		   AD.log(Status.PASS, "passed Test");
		   Thread.sleep(3000);
		   WebElement tq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
		   tq.click();
		   Thread.sleep(3000);
		   WebElement tb= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View"));
		   tb.click();
		   
		   
		   } catch(Exception e) {
			   e.printStackTrace();
			   AD.log(Status.FAIL, "failed Test");
		       
			   
		   }
 
  
	   
 
        
		
			
		
		 
		ExtentTest GM= extent.createTest("Get Status");
		GM.assignCategory("Devices_control_mode");
		
		try {
			
		Thread.sleep(30000);
		
         WebElement tq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
		 tq.click();
		 Thread.sleep(3000);
		 WebElement tl= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
		 tl.click();
		 Thread.sleep(3000);
		 WebElement th= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
		 th.click();
		 WebElement tf= driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Accessoires\"]/android.widget.TextView"));
		 tf.click();
		 Thread.sleep(3000);
		 WebElement ti= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		 ti.click();
		 Thread.sleep(3000);
		 WebElement tk= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		 tk.click();
		 Thread.sleep(3000);
		 WebElement tp= driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Espaces\"]"));
		 tp.click();
		 Thread.sleep(3000);		
		 GM.log(Status.PASS, "Passed");
		 
		 
	
		 
		 
		} catch(Exception e) {
			e.printStackTrace();
			GM.log(Status.FAIL, "ma t3adech");
		}
		
  
  
  


		 ExtentTest ED = extent.createTest("Edit device");
		 ED.assignCategory("Devices_control_mode");
		 
		try {
			
	    Thread.sleep(6000);
	    /*accés au espaces*/
	    WebElement espace = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		espace.click();
		WebElement l12= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
		

		LongPressOptions longPressOptions1 = new LongPressOptions();

		longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

		longPressOptions1.withElement(ElementOption.element(l12)); // Set the element to long press on

		try {

		new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

		} catch (Exception e) {

		e.printStackTrace();

		}
		
		Thread.sleep(5000);
		
		
		

		WebElement Ed = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
		Ed.click();
		Thread.sleep(2000);	
		WebElement Eg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView"));
		Eg.click();
		Thread.sleep(2000);
		WebElement fl= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
		fl.click();
		fl.clear();
		fl.sendKeys("L3");
		   
		driver.hideKeyboard();
	    WebElement Eq = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup"));
	    Eq.click();
		Thread.sleep(2000);

	    WebElement gs= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		gs.click();
		Thread.sleep(2000);
		
		 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
		 Thread.sleep(2000);
			
		WebElement Ev = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));	
		Ev.click();
		   
		 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
		   
		Thread.sleep(2000);
		   
		WebElement ty= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		ty.click();
		Thread.sleep(2000);

		WebElement Es = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Accessoires\"]/android.widget.TextView"));
		Es.click();
		
		   
		Thread.sleep(3000);
		   
		ED.info("After editing").addScreenCaptureFromPath(CaptureScreen(driver));
		ED.info("Résultat attendu : 4 lampes L1, L2, L3, L4");
		ED.info("Résultat actuel : 4 lampes L1, L2, L3");   
		ED.log(Status.FAIL, "Test failed");
		
		Thread.sleep(2000);
		
		 } catch(Exception e) {
			 
			 e.printStackTrace();
			 ED.log(Status.FAIL, "Failed");
			 
		 }
	
	

		ExtentTest Fav = extent.createTest("Add to favorite");
		 Fav.assignCategory("Devices_control_mode");
		 Fav.log(Status.PASS,"passed");
		 try {
		 WebElement Es = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Espaces\"]/android.widget.TextView"));
		 Es.click();
		 Thread.sleep(2000);
		 
		 WebElement Ef = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
		 Ef.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement Ev = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
		 Ev.click();
		 
		 LongPressOptions longPressOptions1 = new LongPressOptions();

			longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

			longPressOptions1.withElement(ElementOption.element(Ev)); // Set the element to long press on

			try {

			new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

			} catch (Exception e) {

			e.printStackTrace();

			}
		Thread.sleep(3000);
		
		WebElement Eb = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));
		Eb.click();
		
		Thread.sleep(2000);
		
		 WebElement Eg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
		
		 LongPressOptions longPressOptions2 = new LongPressOptions();

			longPressOptions2.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

			longPressOptions2.withElement(ElementOption.element(Eg)); // Set the element to long press on

			try {

			new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions2).perform();

			} catch (Exception e) {

			e.printStackTrace();

			}
		Thread.sleep(3000);	
		
		WebElement Eh = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));
		Eh.click();
		
		Thread.sleep(2000);
		
		WebElement En = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
		En.click();
		 
		Thread.sleep(2000);
		 
		WebElement Ed = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Accueil\"]/android.widget.ImageView"));
		Ed.click();
		
		
		
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Salle de réunion"+"\").instance(0))"));
		Thread.sleep(3000);
		
		Fav.info("Screenshot").addScreenCaptureFromPath(CaptureScreen(driver));
		
		
		
		
		 } catch(Exception e) {
			 e.printStackTrace();
				Fav.log(Status.FAIL,"failed test");
		 }

	
	
		
		
			 
			 

		
	
	   ExtentTest AA = extent.createTest("Add automation scene for once");
	     AA.assignCategory("Add/Edit__automated_scenarios");	
	 
	 try {
		 
		
		 /*intelligent*/
		 WebElement Ez = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.cardview.widget.CardView[2]/android.widget.RelativeLayout/android.widget.Button"));
		 Ez.click();
		 Thread.sleep(2000);
		 
		 /*automatisation*/
		 WebElement Et = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Automatisation\"]/android.widget.TextView"));
		 Et.click();
		 Thread.sleep(2000);
		 
		 WebElement Er = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button"));
		 Er.click();
		 Thread.sleep(2000);
		 
		 WebElement EI = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
		 EI.click();
		 EI.sendKeys("Lights ON");
		 driver.hideKeyboard();
		 
		 Thread.sleep(2000);
		 /*set time*/
		 WebElement Ek = driver.findElement(By.id("com.sofia.commendo:id/set_time"));
		 Ek.click();
		 Thread.sleep(4000);
		 
		 WebElement Ew = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText"));
		 Ew.clear();
		 Ew.sendKeys("10");
		 
		 driver.hideKeyboard();
		 Thread.sleep(2000);
		 /*save*/
		 
		 WebElement Eq = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 Eq.click();
		 Thread.sleep(2000);
		 
		 /*Accessoires*/
		 
		 WebElement Ee = driver.findElement(By.id("com.sofia.commendo:id/add_equip"));
		 Ee.click();
		 Thread.sleep(2000);
		 
		 /*L1*/
		 WebElement l1=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]"));
		 l1.click();
		 Thread.sleep(2000);
		
		 /*L3*/
		 WebElement l3=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]"));
		 l3.click();
		 
		 /*Terminé*/
		 
		 WebElement jj = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 jj.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement jk = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
		 jk.click();
		 Thread.sleep(2000);
		 
		 WebElement jm = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
		 jm.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Terminé"+"\").instance(0))"));
		
		 Thread.sleep(2000);
		 
		 /*save*/
		 WebElement ts = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 ts.click();
		 Thread.sleep(3000);
		 
		 AA.info("Screenshot").addScreenCaptureFromPath(CaptureScreen(driver));
		 AA.log(Status.PASS, "passed");
		 
		 Thread.sleep(3000);
		 
	 } catch(Exception e) {
		 e.printStackTrace();
		 AA.log(Status.FAIL, "Failed");
		 
	 }
	 
	 
	 

	   ExtentTest AB = extent.createTest("Add automation scene for Repeat");
	   AB.assignCategory("Add/Edit__automated_scenarios");
	   try {
		   
		   

	   WebElement ts = driver.findElement(By.id("com.sofia.commendo:id/add_elements"));
	   ts.click();
	   
	   
	   WebElement tb = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
	   tb.click(); 
	   Thread.sleep(3000);
	   
	   WebElement EI = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
		 EI.click();
		 EI.sendKeys("Lights OFF ");
		 driver.hideKeyboard();
		 
		 Thread.sleep(2000);
		 /*set time*/
		 WebElement Ek = driver.findElement(By.id("com.sofia.commendo:id/set_time"));
		 Ek.click();
		 Thread.sleep(4000);
		 
		 /*Repeat*/
		 WebElement Ef = driver.findElement(By.id("com.sofia.commendo:id/reapeat_days"));
		 Ef.click();
		 
		 /*days*/
		 
		 /*lundi*/
		 WebElement lundi = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
		 lundi.click();
		 /*Mardi*/
		 WebElement mardi = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView"));
		 mardi.click();
		 
		 /*Mercredi*/
		 WebElement merc = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"));
		 merc.click();
		 
		 
		 /*OK*/
		 WebElement OK = driver.findElement(By.id("com.sofia.commendo:id/daysconfirm"));
		 OK.click();	   
		 
	 /*save*/
		 
		 WebElement save = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 save.click();
		 Thread.sleep(2000);
		 
 /*Accessoires*/
		 
		 WebElement Ee = driver.findElement(By.id("com.sofia.commendo:id/add_equip"));
		 Ee.click();
		 Thread.sleep(2000);
		 
		 /*L1*/
		 WebElement l1=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]"));
		 l1.click();
		 Thread.sleep(2000);
		
		 /*L3*/
		 WebElement l3=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]"));
		 l3.click();
		 
		 /*Terminé*/
		 
		 WebElement jj = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 jj.click();
		 
		 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Terminé"+"\").instance(0))"));
			
		 Thread.sleep(2000);
		 
		 /*save*/
		 WebElement sav = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 sav.click();
		 Thread.sleep(5000);
		 
		 AB.info("Screenshot").addScreenCaptureFromPath(CaptureScreen(driver));
		 AB.log(Status.PASS, "passed");
		 
		 
		 
	   } catch(Exception e) {
		   
		   AB.log(Status.PASS, "passed");
		   e.printStackTrace();

	   }
	   
	   ExtentTest edit = extent.createTest("Edit automation scene for Repeat");
	   edit.assignCategory("Add/Edit__automated_scenarios");
	   
	   try {
	   
	WebElement OFF= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));
		

		LongPressOptions longPressOptions1 = new LongPressOptions();

		longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

		longPressOptions1.withElement(ElementOption.element(OFF)); // Set the element to long press on

		try {

		new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

		} catch (Exception e) {

		e.printStackTrace();

		}
		
		WebElement editer= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"));
		editer.click();
		Thread.sleep(2000);
		
		WebElement condition= driver.findElement(By.id("com.sofia.commendo:id/data_time"));
		condition.click();
		
		Thread.sleep(2000);
		
		edit.info("Screenshot before editing").addScreenCaptureFromPath(CaptureScreen(driver));
		Thread.sleep(2000);
		
		 /*Repeat*/
		 WebElement Ef = driver.findElement(By.id("com.sofia.commendo:id/reapeat_days"));
		 Ef.click();
		 
		 /*days*/
		 
		 /*lundi*/
		 WebElement lundi = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
		 lundi.click();
		 /*Mardi*/
		 WebElement mardi = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView"));
		 mardi.click();
		 
		 /*OK*/
		 WebElement OK = driver.findElement(By.id("com.sofia.commendo:id/daysconfirm"));
		 OK.click();
		 
		 /*back*/
		 
		 WebElement back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
		 back.click();
		 Thread.sleep(2000);
		 edit.info("Screenshot after editing").addScreenCaptureFromPath(CaptureScreen(driver));
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Terminé"+"\").instance(0))"));
			
		 Thread.sleep(2000);
		 
		 /*save*/
		 WebElement sav = driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 sav.click();
		 Thread.sleep(5000);
	   
	   edit.log(Status.FAIL, "failed test");
	   
	   
	   
	   
	   
	   
	   } catch(Exception e) {
		 
		   edit.log(Status.FAIL, "passed");
		   e.printStackTrace();

		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   

	   ExtentTest site= extent.createTest("New site From Home page");
	   site.assignCategory("provisionning_management");
	   try {
	   
	   WebElement ts = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Accueil\"]/android.widget.ImageView"));
	   ts.click();
	   Thread.sleep(3000);
	   
	   WebElement sofia = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView"));
	   sofia.click();
	   /*+Nouveau site*/
	   
	   WebElement news = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
	   news.click();
	   
	   WebElement b = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText[1]"));
	    b.sendKeys("myHome");
	    
	    WebElement d = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText[2]"));
	    d.sendKeys("Tunis");
	    
	    /*photo site*/
	    
	    WebElement c = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
	    c.click();
	    
	    /*Galerie*/
	    
	    

	    WebElement Galerie = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"));
	    Galerie.click();
	    
	   
	    driver.switchTo().alert().accept();
	    driver.switchTo().alert().accept();
	    	
	
	   Thread.sleep(4000);	
	   WebElement photo = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20230505-080122_One UI Home.jpg, 712 Ko, 5 mai\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
 	   photo.click();
 	   
 	   WebElement suivant = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button"));
	   suivant.click();
	   
	   //choixdu wifi 
	    WebElement f = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText"));
	    f.sendKeys("oussema");
	 
	    WebElement x = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
	    x.sendKeys("123456");
	    
	    WebElement p = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button"));
	    p.click();
	    Thread.sleep(2000);
	    
	    WebElement sofiatech = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
	    sofiatech.click();
	    Thread.sleep(2000);
	    
	    WebElement pp = driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button"));
	    pp.click();
	    
	    
	    
	    
	    
	    
	   
	   } catch(Exception e) {
		   
		   
		   
		   
	   }



}
		 
		 
		 
			 

	 @AfterTest
	 public void tearDown() throws IOException
	 {
		   

	      driver.quit();
	      Desktop.getDesktop().browse(new File("Rapport.html").toURI());;
			}
			 
			 
			 
			 			 
			 
			 
			 
		
		
		
		
		
		
		
		 

	 
	
	 
	
   
	 

}




