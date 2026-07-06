import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mobile_automation_sandbox.pages.HomeScreenPage;
import mobile_automation_sandbox.pages.PhoneCallPage;

public class PhoneCallTest extends BaseTest {
    HomeScreenPage homeScreenPage;
    PhoneCallPage phoneCallPage;

    @BeforeEach
    void setUp() {
        homeScreenPage = new HomeScreenPage(driver);
        phoneCallPage = new PhoneCallPage(driver);
        homeScreenPage.goToHomeScreen();
        homeScreenPage.selectPhone();
    }

    @Test
    @DisplayName("Perform Phone Call")
    void performPhoneCall() {
        phoneCallPage.selectKeypad();
        phoneCallPage.verifyBasicButtonsPresence();
        phoneCallPage.enterPhoneNumber("12345678900");
        phoneCallPage.validateAppearanceOfPhoneNumber("12345678900");
    }

    @AfterEach
    void clearDialPad() {
        phoneCallPage.clearDialPad();
    }

}
