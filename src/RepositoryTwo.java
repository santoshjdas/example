import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RepositoryTwo {
	WebDriver driver;

	public RepositoryTwo(AndroidDriver<WebElement> driver){
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(className="android.widget.TextView")
	WebElement Users;

	@AndroidFindBy(className="com.nikiapp:id/message_et")
	WebElement EnterMessage;

	@AndroidFindBy(id="com.nikiapp:id/sendMessage")
	WebElement SendMessage;

	@AndroidFindBy(id="com.nikiapp:id/createNewChat")
	WebElement AddUserCreateGroup;

	@AndroidFindBy(id="com.nikiapp:id/privateChat")
	WebElement PrivateChatSelectionButton;

	@AndroidFindBy(id="com.nikiapp:id/GroupChat")
	WebElement GroupChatSelectionButton;
	@AndroidFindBy(id="OkButtonPath")
	WebElement OKButton;
	//com.nikiapp:id/user_presence
	//com.nikiapp:id/chat_time


	}


