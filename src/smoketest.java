import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class smoketest<webelement> {
	AndroidDriver<WebElement> driver;
	 
	//
	@BeforeClass
	public void Install() throws MalformedURLException{
	 File AppDir =new File("C:/Users/santosh/Desktop");
	 File App=new File(AppDir,"NikiApp_com.nikiapp.apk");

	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID );
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"A001" );
	cap.setCapability(MobileCapabilityType.APP,App.getAbsolutePath());
	//cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.nikiapp");
	//ap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.nikipp.LoginActivity");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
	
	driver =new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);	
	}
	
	@Test
	public void AppInvoke() throws InterruptedException{
	
	RepositoryOne repoone =new RepositoryOne(driver);
	String nm =repoone.DisplayMessage.getText();
	Assert.assertEquals("App invoke unsuccessfully","Enter username to start chat" , nm);
	System.out.println(nm);
	}
    @Test
	public void Login(){
    	RepositoryOne repoone =new RepositoryOne(driver);
    	repoone.Username.sendKeys("hi@xyz.com");
    	repoone.StartChat.click();
    	String nm =repoone.DisplayMessage.getText();
    	String a="Enter username to start chat";
    	Assert.assertFalse("Login failed", nm.equals(a));
    }
    @Test
   	public void SendMessageOneToOne(){
       	RepositoryTwo repotwo=new RepositoryTwo(driver);
       int sz= driver.findElementsByClassName("android.widget.TextView").size();
       System.out.println(sz);
       List<WebElement> sz1=(List<WebElement>) repotwo.Users.getSize();
      sz1.get(0).click();
       repotwo.EnterMessage.sendKeys("hi");
       repotwo.SendMessage.click();
       
      }
    @Test
   	public void SendMessageTogroup(){
       	RepositoryTwo repotwo=new RepositoryTwo(driver);
       List<WebElement> sz2=(List<WebElement>) repotwo.Users.getSize();
       sz2.get(2).click();
       repotwo.EnterMessage.sendKeys("hi all");
       repotwo.SendMessage.click();
       
      }
    @Test
   	public void AddUser(){
       	RepositoryTwo repotwo=new RepositoryTwo(driver);
       repotwo.AddUserCreateGroup.click();
       repotwo.PrivateChatSelectionButton.click();
       repotwo.OKButton.click();
      }
    @Test
   	public void AddGroup(){
       	RepositoryTwo repotwo=new RepositoryTwo(driver);
       repotwo.AddUserCreateGroup.click();
       repotwo.GroupChatSelectionButton.click();
       repotwo.OKButton.click();
      }
}