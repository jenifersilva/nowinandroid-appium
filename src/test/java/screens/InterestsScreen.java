package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InterestsScreen extends BaseScreen {
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Follow interest\"])[1]")
    private WebElement followInterestBtn;

    @AndroidFindBy(accessibility = "Unfollow interest")
    private WebElement unfollowInterestBtn;

    public InterestsScreen(WebDriver app) {
        super(app);
    }

    public InterestsScreen followInterest(){
        followInterestBtn.click();
        return this;
    }

    public InterestsScreen unfollowInterest(){
        unfollowInterestBtn.click();
        return this;
    }

    public WebElement getUnfollowInterestsButton(){
        return unfollowInterestBtn;
    }

    public WebElement getFollowInterestButton(){
        return followInterestBtn;
    }
}
