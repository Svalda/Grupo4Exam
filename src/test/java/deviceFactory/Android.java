package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice {
    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "favi");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("appPackage", "net.fast_notepad_notes_app.fastnotepad");
        capabilities.setCapability("appActivity", "net.fast_notepad_notes_app.fastnotepad.MainActivity");
        /**
         * CREACION DE UNA LISTA DE GRUPOS::::::::::::
        capabilities.setCapability("appPackage", "lauresprojects.com.tareas");
        capabilities.setCapability("appActivity", "lauresprojects.com.listsandnotes.MainActivity");
        **/
        capabilities.setCapability("platformName", "Android");

        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        return driver;
    }
}
