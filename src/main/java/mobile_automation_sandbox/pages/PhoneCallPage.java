package mobile_automation_sandbox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import mobile_automation_sandbox.utilities.MobileActions;

public class PhoneCallPage {

    AndroidDriver driver;
    MobileActions mobileActions;
    By numberDisplay;
    By keypadButton;
    By dialButton;
    By voicemailButton;
    By homeButton;

    public PhoneCallPage(AndroidDriver driver) {
        this.driver = driver;
        this.mobileActions = new MobileActions(driver);
        this.numberDisplay = AppiumBy.id("com.google.android.dialer:id/digits");
        this.keypadButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"Keypad\")");
        this.dialButton = AppiumBy.accessibilityId("dial");
        this.voicemailButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"Voicemail\")");
        this.homeButton = AppiumBy.androidUIAutomator("new UiSelector().text(\"Home\")");
    }

    public void selectKeypad() {
        mobileActions.waitForElementToBeVisible(keypadButton, 10);
        driver.findElement(keypadButton).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        for (char digit : phoneNumber.toCharArray()) {
            By digitLocator = AppiumBy.androidUIAutomator("new UiSelector().text(\"" + digit + "\")");
            mobileActions.waitForElementToBeVisible(digitLocator, 10);
            driver.findElement(digitLocator).click();
        }
    }

    public void validateAppearanceOfPhoneNumber(String phoneNumber) {
        mobileActions.waitForElementToBeVisible(numberDisplay, 10);
        String sanitized = driver.findElement(numberDisplay).getText().replaceAll("[^\\d+]", "");
        assert (sanitized.equals(phoneNumber)) : "Expected phone number: " + phoneNumber + ", but found: " + sanitized;
    }

    public void verifyBasicButtonsPresence() {
        verifyButtonPresence(voicemailButton, "Voicemail");
        verifyButtonPresence(homeButton, "Home");
        verifyButtonPresence(dialButton, "Dial");
    }

    public void verifyDialButtonPresence() {
        verifyButtonPresence(dialButton, "Dial");
    }

    public void clearDialPad() {
        driver.terminateApp("com.google.android.dialer");
        driver.activateApp("com.google.android.dialer");
    }

    private void verifyButtonPresence(By buttonLocator, String buttonName) {
        mobileActions.waitForElementToBeVisible(buttonLocator, 30);
        WebElement button = driver.findElement(buttonLocator);
        assert (button.isDisplayed()) : buttonName + " button is not displayed.";
    }

}
