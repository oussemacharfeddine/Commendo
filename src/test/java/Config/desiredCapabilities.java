package Config;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class desiredCapabilities {
public static AndroidDriver driver;
	

	
    @BeforeTest
    public void setup(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A11");
        caps.setCapability(MobileCapabilityType.UDID, "R9JN90M9XXJ");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\hoove\\AppData\\Local\\Android\\Sdk\\platform-tools\\Commendo_0.11.0.apk");
  
      
        try {
            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
                 } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        }
    

	 @AfterTest
	 public void tearDown() throws IOException
	 {
		   

	      driver.quit();
	      Desktop.getDesktop().browse(new File("Rapport.html").toURI());;
			}
}
