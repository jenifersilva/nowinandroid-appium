package modules;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import utils.Utils;

public class BaseTest {
    protected AppiumDriver app;
    private File apkFile = new File
            ("src" + File.separator
                    + "main" + File.separator
                    + "resources" + File.separator
                    + "app-demo-debug.apk");

    @BeforeEach
    public void beforeEach () throws IOException {
        initDriver();
        app.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void afterEach() {
        quitDriver();
    }

    private void initDriver() throws IOException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", Utils.getDataFromConfigFile("ANDROID_DEVICE_NAME"));
        capabilities.setCapability("platformName", Utils.getDataFromConfigFile("ANDROID_PLATFORM_NAME"));
        capabilities.setCapability("appPackage", Utils.getDataFromConfigFile("ANDROID_APP_PACKAGE"));
        capabilities.setCapability("appActivity", Utils.getDataFromConfigFile("ANDROID_APP_ACTIVITY"));
        capabilities.setCapability("automationName", Utils.getDataFromConfigFile("ANDROID_AUTOMATION_NAME"));
        capabilities.setCapability("app", apkFile.getAbsolutePath());
        capabilities.setCapability("autoGrantPermissions", true);
        this.app = new AndroidDriver(new URL(Utils.getDataFromConfigFile("LOCAL_APPIUM_SERVER")), capabilities);
    }

    private void quitDriver(){
        app.quit();
    }
}
