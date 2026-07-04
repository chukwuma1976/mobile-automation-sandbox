import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
    URL url;
    AppiumDriver driver;

    @BeforeEach
    void setup() {

        try {
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName("Android")
                    .setDeviceName("emulator-5554")
                    .setAutomationName("UiAutomator2")
                    .setNewCommandTimeout(Duration.ofSeconds(60));

            url = new URL("http://127.0.0.1:4723");
            driver = new AndroidDriver(url, options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
