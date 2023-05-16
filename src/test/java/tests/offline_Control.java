package tests;

import org.testng.annotations.Test;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.baseClass;
import Reports.extentReport;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import pageObjects.deviceConfig;
import pageObjects.espacesPage;
import pageObjects.homePage;
import pageObjects.intelligentPage;
import pageObjects.newAccessoryPage;
import pageObjects.newArea;
import pageObjects.siteCreationPage;
import tests.offline_Authentication;

public class offline_Control extends offline_Authentication {
	
	public siteCreationPage sitecreation;
	public homePage homepage;
	public newArea newarea;
	public newAccessoryPage newaccessory;
	public deviceConfig deviceconfig;
	public espacesPage espaces;
	public intelligentPage intelligentpage;
	public baseClass desiredcapabilities;
	public extentReport extentreport;
	public offline_Authentication offlineauth;

	

	
	 @Test
	 public void CreationSite() {
			

			sitecreation = new siteCreationPage();
			PageFactory.initElements(driver, sitecreation);
			
			ExtentTest CS = extent.createTest("Creation site ","Creation site sofiatech");
			
		    CS.assignCategory("provisionning_management");	
		    
			try {
			 
			sitecreation.site.click();
			sitecreation.name.sendKeys("sofiatech");
			sitecreation.adress.sendKeys("ghazela");
			sitecreation.suivantButton.click();
			sitecreation.wifi.sendKeys("globalnet");
			sitecreation.mdp.sendKeys("entropia");
			sitecreation.ajouterButton.click();
			sitecreation.createdSite.click();
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
	    	homepage = new homePage();
	    	PageFactory.initElements(driver, homepage);	
	    	newarea = new newArea();
	    	PageFactory.initElements(driver, newarea);	
	    	
	    	homepage.iconAjout.click();
	    	homepage.newArea.click();
	    	newarea.areaName.sendKeys("salle de réunion");
	    	newarea.AjouterButton.click();
	 
	    Thread.sleep(3000);
	    CA.log(Status.PASS, "passed");
	    
	    } catch (Exception e) {
	    	CA.log(Status.FAIL, "failed");
	    }
	    
	    
	   }
	    
	    
	    
	  
	    
	    
	    @Test
	    public void addDevice(){
	     	

	 	   
	     ExtentTest AD = extent.createTest("ADD device");
	     AD.assignCategory("Devices_control_mode");
	 		   
	           try {
	         	  
	         	homepage = new homePage();
	           	PageFactory.initElements(driver, homepage);  
	         	newaccessory  = new newAccessoryPage();
	           	PageFactory.initElements(driver, newaccessory);	
	           	deviceconfig  = new deviceConfig();
	           	PageFactory.initElements(driver, deviceconfig);	
	           	espaces = new espacesPage();
	 	    	PageFactory.initElements(driver, espaces);
	           		
	             homepage.newAccessory.click();
	 		    homepage.close.click();
	 		    newaccessory.next.click();
	 		    driver.switchTo().alert().accept();
	 		    newaccessory.deviceBLE.click();
	 		  
	 		    /*configuration*/
	 		    deviceconfig.stylo1.click();
	 		    deviceconfig.name1.clear();
	 		    deviceconfig.name1.sendKeys("lampe1");
	 		    driver.hideKeyboard();
	 		    deviceconfig.lampe.click();
	 		    deviceconfig.saveButton.click();
	 		    deviceconfig.stylo2.click();
	 		    deviceconfig.map.clear();
	 		    deviceconfig.map.sendKeys("map1");
	 		    driver.hideKeyboard();
	 		    deviceconfig.saveButton.click();
	 		    deviceconfig.stylo3.click();
	 		    deviceconfig.name1.clear();
	 		    deviceconfig.name1.sendKeys("lampe2");
	 		    driver.hideKeyboard();
	 		    deviceconfig.lampe.click();
	 		    deviceconfig.saveButton.click();
	 		    deviceconfig.stylo4.click();
	 		    deviceconfig.name1.clear();
	 		    deviceconfig.name1.sendKeys("store");
	 		    deviceconfig.store.click();
	 		    deviceconfig.confirm.click();
	 		    deviceconfig.saveButton.click();
	 		    deviceconfig.stylo5.click();
	 		    deviceconfig.map.clear();
	 		    deviceconfig.map.sendKeys("map2");
	 		    deviceconfig.saveButton.click();
	 		    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
	             deviceconfig.Area.click();
	             deviceconfig.selectedarea.click();
	             deviceconfig.saveButton.click();
	             deviceconfig.close.click();
	       	    espaces.salle.click();
	       		
	 		    AD.log(Status.PASS, "passed Test");
	 	
	 		   
	 		   
	 		   } catch(Exception e) {
	 			   e.printStackTrace();
	 			   AD.log(Status.FAIL, "failed Test");
	 		       
	 			   
	 		   }
	  
	   
	

				 ExtentTest ED = extent.createTest("Edit device Category");
				 ED.assignCategory("Devices_control_mode");
			   
			   try {
				   
				   
				   
				   espaces = new espacesPage();
			       PageFactory.initElements(driver, espaces);	
			       deviceconfig  = new deviceConfig();
		       PageFactory.initElements(driver, deviceconfig);
		       Thread.sleep(30000);		       
		       WebElement L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
		       LongPressOptions longPressOptions1 = new LongPressOptions();

		        longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

		        longPressOptions1.withElement(ElementOption.element(L)); // Set the element to long press on

		        try {

		            new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

		        } catch (Exception e) {

		            e.printStackTrace();

		        }
			   	  espaces.editer.click();
			   	  deviceconfig.stylo4.click();
			   	  deviceconfig.name1.clear();
			   	  deviceconfig.name1.sendKeys("lampe3");
			   	  driver.hideKeyboard();
			   	  deviceconfig.lampe.click();
			   	  deviceconfig.saveButton.click();
			   	  deviceconfig.stylo6.click();
			   	  deviceconfig.lampe.click();
			   	  deviceconfig.name1.clear();
			   	  deviceconfig.name1.sendKeys("lampe4");
			   	  driver.hideKeyboard();
			   	  deviceconfig.saveButton.click();
				  driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
		      deviceconfig.saveButton.click();
		      espaces.accessoires.click();
		      espaces.espaces.click();
		      espaces.salle.click();
		      ED.log(Status.PASS, "passed test");
		      
			   	  
				   
				   
			   }catch(Exception e) {
				   e.printStackTrace();
				   ED.log(Status.FAIL, "failed test");
				   
			   }
			  
			   
			   

			   
		 		ExtentTest GM= extent.createTest("Get Status");
		 		GM.assignCategory("Devices_control_mode");
		 		try {
		 			
		 			espaces = new espacesPage();
		 	    	PageFactory.initElements(driver, espaces);
		 	    	Thread.sleep(30000);	
		 		    espaces.lampe1.click();
		 	    	espaces.lampe2.click();
		 	    	espaces.back.click();
		 	    	espaces.accessoires.click();
		 	    	GM.info("Screenshot Tab ALL").addScreenCaptureFromPath(CaptureScreen(driver));
		 	    	espaces.tablampe.click();
		 	    	GM.info("Screenshot Lampes").addScreenCaptureFromPath(CaptureScreen(driver));
		 	    	espaces.tabstore.click();
		 	    	GM.info("Screenshot tab store").addScreenCaptureFromPath(CaptureScreen(driver));
		 	    	espaces.espaces.click();
		 	    	espaces.salle.click();
		 	    	GM.log(Status.PASS, "passed Test");
		 	    	
		 			
		 		} catch (Exception e) {
		 			e.printStackTrace();
		 			GM.log(Status.FAIL, "passed Test");
		 			
		 			
		 		}
		 	   
		 	   
		 	   
		   
				   
				   ExtentTest DN = extent.createTest("Edit device Name");
				   DN.assignCategory("Devices_control_mode");
				   
				   try {
					   
					   espaces = new espacesPage();
				       PageFactory.initElements(driver, espaces);
				       deviceconfig  = new deviceConfig();
			           PageFactory.initElements(driver, deviceconfig);
			           Thread.sleep(30000);	
			           WebElement L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
				       LongPressOptions longPressOptions1 = new LongPressOptions();

				        longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

				        longPressOptions1.withElement(ElementOption.element(L)); // Set the element to long press on

				        try {

				            new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

				        } catch (Exception e) {

				            e.printStackTrace();

				        }
			           

			 	    	
			 	   	  
			 	   	 espaces.editer.click();
			 	   	 deviceconfig.deviceName.clear();
				     DN.info("Screenshot edit device name").addScreenCaptureFromPath(CaptureScreen(driver));
					 driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));
				     DN.info("Screenshot edit device name").addScreenCaptureFromPath(CaptureScreen(driver));
				     DN.log(Status.FAIL, "failed");
				     deviceconfig.saveButton.click();
				     espaces.salle.click();
				    
			         

			           
			           
					   
					   
				   }catch (Exception e) {
					 e.printStackTrace();  
					   
				   }
				   
				   
				   
			 }
			 
			   @Test
			   
			   public void addFav() {
				   
				   
				   ExtentTest fav = extent.createTest("Add to favorite");
				   fav.assignCategory("Devices_control_mode");
				   try {
					   
					   espaces = new espacesPage();
				       PageFactory.initElements(driver, espaces);
				       deviceconfig  = new deviceConfig();
			           PageFactory.initElements(driver, deviceconfig);
			           WebElement L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
				       LongPressOptions longPressOptions1 = new LongPressOptions();

				        longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

				        longPressOptions1.withElement(ElementOption.element(L)); // Set the element to long press on

				        try {

				            new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

				        } catch (Exception e) {

				            e.printStackTrace();

				        }
			           
			           
			           
				         espaces.addFav.click();
				         espaces.back.click();
				         espaces.home.click();
				         driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"salle de réunion"+"\").instance(0))"));
				         fav.info("favorites screenshot").addScreenCaptureFromPath(CaptureScreen(driver));
				         homepage.espaces.click();
				         espaces.salle.click();
				         fav.log(Status.PASS, "passed test");
					   
				   }catch(Exception e) {
					   
				         fav.log(Status.FAIL, "passed test");
			             e.printStackTrace();
					   
				   }
				   
				   
				   
			   }

			   
			   @Test
			   public void removeFav() {
				   

				   ExtentTest remFav = extent.createTest("Remove from favorite");
				   remFav.assignCategory("Devices_control_mode");
				   
				   try {
						homepage = new homePage();
			          	PageFactory.initElements(driver, homepage);
					   espaces = new espacesPage();
				       PageFactory.initElements(driver, espaces);
				       deviceconfig  = new deviceConfig();
			           PageFactory.initElements(driver, deviceconfig);
			           
			          
			           WebElement L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
				       LongPressOptions longPressOptions1 = new LongPressOptions();

				        longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

				        longPressOptions1.withElement(ElementOption.element(L)); // Set the element to long press on

				        try {

				            new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

				        } catch (Exception e) {

				            e.printStackTrace();

				        }
			           
			           
			         
				         espaces.remFav.click();
				         espaces.back.click();
				         espaces.home.click();
				         remFav.info("favorites screenshot").addScreenCaptureFromPath(extentreport.CaptureScreen(driver));
				         homepage.intelligent.click();
					     Thread.sleep(3000);
				   }catch(Exception e) {
					   
					   e.printStackTrace();
				   }
				   
		
				   ExtentTest auto = extent.createTest("Add automation scene");
				   auto.assignCategory("Add/Edit_scenarios");
				
		           
				    intelligentpage = new intelligentPage();
		            PageFactory.initElements(driver, intelligentpage);
		           
				   try { 
					 
			           intelligentpage.automation.click();
			           intelligentpage.icon.click();
			           intelligentpage.auto.click();
			           intelligentpage.scenename.sendKeys("light ON");
			           driver.hideKeyboard();
			           intelligentpage.buttontime.click();
			           intelligentpage.time.sendKeys("6");
			           intelligentpage.save.click();
			           intelligentpage.accessory.click();
			           intelligentpage.lampe1.click();
			           intelligentpage.save.click();
			           intelligentpage.action.click();
				       driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Terminé"+"\").instance(0))"));
			           intelligentpage.save.click();
			           
			       
			           
					   
					   
				   }catch(Exception e) {
					   e.printStackTrace();
				   }
				   
				   
				   
				   ExtentTest autom = extent.createTest("Edit automation scene");
				   autom.assignCategory("Add/Edit_scenarios");   
				   
				   try {
					   
				   
					
			          
			          Thread.sleep(4000);
			           WebElement L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"));
				       LongPressOptions longPressOptions1 = new LongPressOptions();

				        longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press

				        longPressOptions1.withElement(ElementOption.element(L)); // Set the element to long press on

				        try {

				            new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();

				        } catch (Exception e) {

				            e.printStackTrace();
				            
				        }
				        
				        intelligentpage.edit.click();
				        intelligentpage.scenename.clear();
				        intelligentpage.scenename.sendKeys("Lights OFF");
				        driver.hideKeyboard();
				        intelligentpage.stylo.click();
				        intelligentpage.time.sendKeys("7");
				        intelligentpage.repeat.click();
				        intelligentpage.lundi.click();
				        intelligentpage.ok.click();
				        intelligentpage.save.click();
				        intelligentpage.action.click();
					    driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Terminé"+"\").instance(0))"));
                        intelligentpage.save.click();
                        Thread.sleep(3000);
				        autom.log(Status.PASS, "Passed test");
				        autom.info("favorites screenshot").addScreenCaptureFromPath(extentreport.CaptureScreen(driver));


				        }catch(Exception e) {
				        	e.printStackTrace();
				        	autom.log(Status.FAIL, "Failed test");
				        } 
				        	
				        	
				        
				   
				   
			   }
			   
				@AfterTest
				   public void tearDown() throws IOException
				   {
					 
					  driver.quit();
				     Desktop.getDesktop().browse(new File("Rapport.html").toURI());;
						
				   }  
			    
			}

		   
			 
				   
		
	




