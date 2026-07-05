import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import mobile_automation_sandbox.pages.HomeScreenPage;

public class HomeScreenTest extends BaseTest {
    HomeScreenPage homeScreenPage;

    @BeforeEach
    void setUp() {
        homeScreenPage = new HomeScreenPage(driver);
        homeScreenPage.goToHomeScreen();
    }

    @Test
    @DisplayName("Verify App Launch")
    void verifyConnection() {
        assertNotNull(driver);
        System.out.println("Session ID = " + driver.getSessionId());
    }

    @Test
    @DisplayName("select photo app")
    void selectPhotosApp() {
        homeScreenPage.selectPhotos();
    }

    @Test
    @DisplayName("select phone app")
    void selectPhoneApp() {
        homeScreenPage.selectPhone();
    }

    @Test
    @DisplayName("select messages app")
    void selectMessagesApp() {
        homeScreenPage.selectMessages();
    }

    @Test
    @DisplayName("select chrome app")
    void selectChromeApp() {
        homeScreenPage.selectChrome();
    }

    @Test
    @DisplayName("select gmail app")
    void selectGmailApp() {
        homeScreenPage.selectGmail();
    }

    @Test
    @DisplayName("select play store app")
    void selectPlayStoreApp() {
        homeScreenPage.selectPlayStore();
    }

    @Test
    @DisplayName("select google search")
    void selectGoogleSearch() {
        homeScreenPage.selectGoogleSearch();
    }

}
