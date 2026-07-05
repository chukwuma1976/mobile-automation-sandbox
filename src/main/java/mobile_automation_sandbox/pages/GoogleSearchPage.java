package mobile_automation_sandbox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import mobile_automation_sandbox.utilities.MobileActions;

public class GoogleSearchPage {

    private AndroidDriver driver;
    private By searchBox;
    private By landingPageSearchBoxText;
    private By facadeSearchBox;
    private MobileActions mobileActions;

    public GoogleSearchPage(AndroidDriver driver) {
        this.driver = driver;
        this.mobileActions = new MobileActions(driver);
        this.searchBox = AppiumBy.id("com.google.android.googlequicksearchbox:id/googleapp_search_box");
        this.landingPageSearchBoxText = AppiumBy
                .id("com.google.android.googlequicksearchbox:id/googleapp_srp_search_box_text");
        this.facadeSearchBox = AppiumBy.xpath(
                "//android.view.View[@resource-id=\"googleapp_facade_search_box\"]/android.widget.TextView[@text=\"Search\"]");
    }

    public void enterSearchQuery(String query) {
        mobileActions.clickByElement(facadeSearchBox, 60);

        mobileActions.clickByElement(searchBox, 60);
        driver.findElement(searchBox).sendKeys(query);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void verifyPresenceOfSearchResults(String query) {
        mobileActions.waitForElementToBeVisible(landingPageSearchBoxText, 60);

        WebElement results = driver.findElement(landingPageSearchBoxText);
        assert (results.getText()).contains(query);
    }

}
