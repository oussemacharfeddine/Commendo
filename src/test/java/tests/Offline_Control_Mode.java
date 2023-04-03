package tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidStartScreenRecordingOptions;

import java.util.Base64;

public class Offline_Control_Mode extends Offline_Authentification{
	
	
@Test
public void CreationSite() {
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
    f.sendKeys("SOFIA_STAGE_RDC");
  
   
    WebElement x = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
    x.sendKeys("P94@#2ASx!7wri%T");
    
    WebElement p = driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.Button"));
    p.click();
	 }
	 @Test
	public void Creation_Area() throws InterruptedException {
  
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
    
    WebElement t= driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Area\"]/android.widget.ImageView"));
    t.click();
	 }
    @Test
    public void editArea() {
    	

        driver.startRecordingScreen(new AndroidStartScreenRecordingOptions()
                .withVideoSize("1280x720")
                .withTimeLimit(Duration.ofSeconds(7)));
        
        WebElement bb= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
        bb.click();
        

        WebElement nn= driver.findElement(By.id("com.sofia.commendo:id/edit_room"));
        nn.click();

        WebElement rr= driver.findElement(By.id("com.sofia.commendo:id/add_photo_house"));
        rr.click();

        WebElement tt= driver.findElement(By.id("com.sofia.commendo:id/imageView2"));
        tt.click();
        

        WebElement rp= driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        rp.click();
        
        driver.switchTo().alert().accept();
        

        


        WebElement kk= driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"IMG_20230403_053730.jpg, 145 kB, 5:37 AM\"]/android.widget.RelativeLayout/android.widget.FrameLayout[2]"));
        kk.click();
        
        WebElement mm= driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"IMG_20230403_053730.jpg, 145 kB, 5:37 AM\"]/android.widget.RelativeLayout/android.widget.FrameLayout[2]"));
        mm.click();
        		
        
        
        
        		
        
        
        
        
    	
    
   	
     
	 }
	 
	 @AfterTest
	 public void tearDown()
	 {

	        String video =driver.stopRecordingScreen();
	        byte[] decode = Base64.getDecoder().decode(video);
	        try {
				FileUtils.writeByteArrayToFile(new File("androidclip.mp4"), decode);
				String
				destinationPath="target/filename.mp4";
				Path path = Paths.get(destinationPath);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.quit();
	 }

}


