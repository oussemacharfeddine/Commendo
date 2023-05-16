package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class homePage {
	


	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView[3]")
	public WebElement iconAjout;
	


	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
	public WebElement newArea;
	


	@FindBy(id="com.sofia.commendo:id/add_accessories_button")
	public WebElement newAccessory;
	

	@FindBy(id="com.sofia.commendo:id/close_on_boarding")
	public WebElement close;
	
	

	@FindBy(id="com.sofia.commendo:id/area")
	public WebElement espaces;
	
	@FindBy(id="com.sofia.commendo:id/smart")
	public WebElement intelligent;
	
	
	
	
	
	

}
