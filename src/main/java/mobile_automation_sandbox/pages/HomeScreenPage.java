package mobile_automation_sandbox.pages;

import java.util.Map;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HomeScreenPage {

    private AppiumDriver driver;

    public HomeScreenPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void goToHomeScreen() {
        driver.executeScript("mobile:pressKey", Map.ofEntries(Map.entry("keycode", 3)));
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

    public void selectAppiumSettings() {
        clickAccessibilityId("Appium Settings");
    }

    private void clickAccessibilityId(String accessibilityId) {
        driver.findElement(AppiumBy.accessibilityId(accessibilityId)).click();
    }

}
