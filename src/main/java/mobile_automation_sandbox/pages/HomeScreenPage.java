package mobile_automation_sandbox.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HomeScreenPage {

    private AndroidDriver driver;

    public HomeScreenPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void goToHomeScreen() {
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public void selectPlayStore() {
        clickAccessibilityId("Play Store");
    }

    public void selectGmail() {
        clickAccessibilityId("Gmail");
    }

    public void selectPhotos() {
        clickAccessibilityId("Photos");
    }

    public void selectPhone() {
        clickAccessibilityId("Phone");
    }

    public void selectMessages() {
        clickAccessibilityId("Messages");
    }

    public void selectChrome() {
        clickAccessibilityId("Chrome");
    }

    private void clickAccessibilityId(String accessibilityId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By app = AppiumBy.accessibilityId(accessibilityId);

        wait.until(ExpectedConditions.visibilityOfElementLocated(app));
        driver.findElement(app).click();
    }

}
