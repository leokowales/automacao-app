package automacao.app;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class AppiumDriverHelper {

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.example.vamsi.login");
        capabilities.setCapability("appActivity", "com.example.vamsi.login.MainActivity");
        capabilities.setCapability("app", "/Users/local/IdeaProjects/automacao-app/apk/app-debug.apk");
        capabilities.setCapability("noReset", true);

        return capabilities;
    }

    public static URL getURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static AppiumDriver getDriver(){
        AppiumDriver driver = null;

        try {
            driver = new AppiumDriver(getURL(), getCapabilities());
        } catch (Exception e){
            log.error("Error on driver creation", e);
            throw new RuntimeException(e);
        }
        return driver;
    }
}