package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar extends BaseScreen {
    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"NiaBottomBar\"]/android.view.View/android.view.View[3]/android.view.View[2]")
    private WebElement interestTab;
    public NavigationBar(WebDriver app) {
        super(app);
    }

    public InterestsScreen goToInterestsTab () {
        interestTab.click();
        return new InterestsScreen(app);
    }
}
