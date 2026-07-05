package mobile_automation_sandbox.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobileActions {

    private AndroidDriver driver;

    public MobileActions(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickAccessibilityId(String accessibilityId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By app = AppiumBy.accessibilityId(accessibilityId);

        wait.until(ExpectedConditions.visibilityOfElementLocated(app));
        driver.findElement(app).click();
    }

    public void clickAccessibilityId(String accessibilityId, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        By app = AppiumBy.accessibilityId(accessibilityId);

        wait.until(ExpectedConditions.visibilityOfElementLocated(app));
        driver.findElement(app).click();
    }

    public void clickByElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).click();
    }

    public void clickByElement(By element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).click();
    }

    public void waitForElementToBeVisible(By element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
