package mobile_automation_sandbox.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import mobile_automation_sandbox.utilities.MobileActions;

public class HomeScreenPage {

    private AndroidDriver driver;
    private MobileActions mobileActions;

    public HomeScreenPage(AndroidDriver driver) {
        this.driver = driver;
        this.mobileActions = new MobileActions(driver);
    }

    public void goToHomeScreen() {
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public void selectPlayStore() {
        mobileActions.clickAccessibilityId("Play Store");
    }

    public void selectGmail() {
        mobileActions.clickAccessibilityId("Gmail");
    }

    public void selectPhotos() {
        mobileActions.clickAccessibilityId("Photos");
    }

    public void selectPhone() {
        mobileActions.clickAccessibilityId("Phone");
    }

    public void selectMessages() {
        mobileActions.clickAccessibilityId("Messages");
    }

    public void selectChrome() {
        mobileActions.clickAccessibilityId("Chrome");
    }

    public void selectGoogleSearch() {
        mobileActions.clickAccessibilityId("Google app");
    }

}
