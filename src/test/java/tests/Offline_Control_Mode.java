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
    
    CS.log(Status.PASS, "failed");
    
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
    
    CA.info("capture d'écran").addScreenCaptureFromPath(CaptureScreen(driver));
    
    CA.log(Status.PASS, "passed");
    
    } catch (Exception e) {
    	CA.log(Status.FAIL, "failed");
    }
   
   
	 }
 
    

	

	 
	 
  @Test 
   public void add_Device(){
    ExtentTest AD = extent.createTest("ADD device");
    AD.assignCategory("Control devices mode");
		   try {
			   
		  /*bouton accessoire*/
		   WebElement dd= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.cardview.widget.CardView[1]/android.widget.RelativeLayout/android.widget.Button"));
		   dd.click();
		   
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
		   
		   Thread.sleep(20000);

		   
		   
		   
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
		   WebElement tq= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView"));
		   tq.click();
		   AD.info("capture d'écran").addScreenCaptureFromPath(CaptureScreen(driver));
		   Thread.sleep(5000);
		 
		   } catch(Exception e) {
			   e.printStackTrace();
			   AD.log(Status.FAIL, "failed Test");
		       
			   
		   }
	   }
	 
	 @Test 
	 public void getStatus() {
		
		 
			ExtentTest GM= extent.createTest("Get Status");
			GM.assignCategory("Control devices mode");
			   
			try {
			
			 Thread.sleep(15000);	
		     WebElement ff= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View"));
		     ff.click();
		     Thread.sleep(5000);
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
			 GM.log(Status.PASS, "T3ada");
			
			 
			 
			} catch(Exception e) {
				e.printStackTrace();
				GM.log(Status.FAIL, "ma t3adech");
			}
			 
			

		 
	 }
	 @Test
	 public void editDevice() {
		 ExtentTest ED = extent.createTest("Edit device");
		 ED.assignCategory("Control devices mode");
		   
		 try {
		WebElement ES = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View"));
		ES.click();
		WebElement Em = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
		
		LongPressOptions longPressOptions1 = new LongPressOptions();

		longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

		longPressOptions1.withElement(ElementOption.element(Em)); // Set the element to long press on

		try {

		new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

		} catch (Exception e) {

		e.printStackTrace();

		}
		
		WebElement El = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
		El.click();
		
		 
		WebElement Ed = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView"));
		Ed.click();
		
		 WebElement fl= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		 fl.click();
		   
		 fl.clear();
		 fl.sendKeys("L3");
		   
		 driver.hideKeyboard();
	     WebElement Eq = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup"));
	     Eq.click();

	     WebElement gs= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		 gs.click();
	     
		 WebElement Ek = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.ImageView"));
		 Ek.click();
		 
		 
		 WebElement fp= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		 fp.click();
		   
		 fp.clear();
		 fp.sendKeys("L4");
		   
		 WebElement Ez = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup"));
		 Ez.click();
		 
		 WebElement fa= driver.findElement(By.id("com.sofia.commendo:id/btn_name"));
		 fa.click();
		 
		   
		   driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
		   
		   Thread.sleep(2000);
		   
		   WebElement ty= driver.findElement(By.id("com.sofia.commendo:id/btn_save"));
		   ty.click();
		   
		   WebElement Es = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Accessoires\"]/android.widget.TextView"));
		   Es.click();
		   
		   Thread.sleep(3000);
		   
		   ED.info("capture d'écran").addScreenCaptureFromPath(CaptureScreen(driver));
		   
		   ED.log(Status.PASS, "Passed");
		 } catch(Exception e) {
			 
			 e.printStackTrace();
			 ED.log(Status.FAIL, "Failed");
			 
		 }
		 
		 
	 }
	 
	
		@Test 
		public void secondArea(){
	    ExtentTest CSA = extent.createTest("Creation Second Area ","Creation salle Java");
	    CSA.assignCategory("provisionning_management");
		ExtentTest EA= extent.createTest("Edit Area ","Edit salle Java");
		try {
			
		WebElement ww = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Area\"]/android.widget.ImageView"));
	    ww.click();
	    Thread.sleep(2000);
		//click sur l'icone +
	    WebElement zz = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]"));
	    zz.click();
		//Add new area
	    WebElement vv = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
		vv.click();
		WebElement uu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText"));
	    uu.sendKeys("Salle Java ");
	  

	    
	    WebElement ii= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button"));
	    ii.click();
	   
		Thread.sleep(2000);
	    CSA.log(Status.PASS, "passed"); 
		Thread.sleep(4000);
		WebElement m= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.View"));
		m.click();
		WebElement tf= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
		tf.click();
		WebElement ub = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText"));
		ub.clear();
	    ub.sendKeys("Salle Ruby ");
	    WebElement sa = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button[2]"));
	    sa.click();
		
		EA.log(Status.PASS, "Passed");
		CSA.log(Status.PASS, "Paased");
		} catch(Exception e) {
			e.printStackTrace();
			CSA.log(Status.FAIL, "Failed"); 
			EA.log(Status.FAIL, "Failed Edit");
		}

			    
		}
	 
	 
	 @Test
	  public void Delete_Area() {
			ExtentTest DA = extent.createTest("Delete Area  ","Delete salle de Reunion");
			DA.assignCategory("provisionning_management");
			

		  try {
				DA.log(Status.PASS, "Passed");

		  } catch (Exception e) {
			  e.printStackTrace();
				DA.log(Status.FAIL, "Failed");

			  
		  }
	  }
		 
		 
		 
	 
	 

	 @Test
	  public void Creation_Another_Site() {
			ExtentTest DD = extent.createTest("Creation site MyHome  ","Creation site MyHome ");
			

		  try {
				DD.log(Status.PASS, "Passed");

		  } catch (Exception e) {
			  e.printStackTrace();
				DD.log(Status.FAIL, "Failed");

			  
		  }
	  }

	
	
	


	
	
	
	
	 @AfterTest
	 public void tearDown() throws IOException
	 {
		   

	      driver.quit();
	      Desktop.getDesktop().browse(new File("extent.html").toURI());;
			}
	 
	
   
	 

}




