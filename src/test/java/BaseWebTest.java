import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseWebTest {
    URL url;
    AndroidDriver driver;

    @BeforeAll
    void setup() {

        try {
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName("Android")
                    .setDeviceName("emulator-5554")
                    .setAutomationName("UiAutomator2")
                    .withBrowserName("Chrome")
                    .setUiautomator2ServerLaunchTimeout(Duration.ofSeconds(90))
                    .setAutoGrantPermissions(true)
                    .setNoReset(true)
                    .setAdbExecTimeout(Duration.ofSeconds(90));
            // Tell Appium to automatically download the missing driver
            options.setCapability("appium:chromedriverAutodownload", true);

            url = new URL("http://127.0.0.1:4723/");
            driver = new AndroidDriver(url, options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    @AfterAll
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
