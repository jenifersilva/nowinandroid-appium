package screens;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {
    protected WebDriver app;

    public BaseScreen(WebDriver app) {
        this.app = app;
        PageFactory.initElements(new AppiumFieldDecorator(app),this);
    }
}
