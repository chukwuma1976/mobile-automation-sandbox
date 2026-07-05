import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mobile_automation_sandbox.pages.HomeScreenPage;
import mobile_automation_sandbox.pages.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {

    HomeScreenPage homeScreenPage;
    GoogleSearchPage googleSearchPage;

    @BeforeEach
    void setUp() {
        homeScreenPage = new HomeScreenPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
        homeScreenPage.goToHomeScreen();
        homeScreenPage.selectGoogleSearch();
    }

    @Test
    @DisplayName("Perform Google Search")
    void performGoogleSearch() {
        googleSearchPage.enterSearchQuery("Appium");
        googleSearchPage.verifyPresenceOfSearchResults("Appium");
    }
}
