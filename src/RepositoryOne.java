
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RepositoryOne {
WebDriver driver;


public RepositoryOne(AndroidDriver<WebElement> driver) {
	this.driver=driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
  
@AndroidFindBy(id="com.nikiapp:id/labelUserName")
WebElement DisplayMessage;
//
@AndroidFindBy(className="android.widget.EditText")
WebElement Username;
//
@AndroidFindBy(className="android.widget.Button")
WebElement StartChat;

//public WebElement DisplayMessage(){
	//return DisplayMessage ;
//}
/*public WebElement Username(){
	return Username ;
}
public WebElement StartChat(){
	return StartChat ;
}*/

}
 

