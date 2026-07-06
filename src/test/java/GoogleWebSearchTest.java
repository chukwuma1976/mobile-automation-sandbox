import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleWebSearchTest extends BaseWebTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com");

        Thread.sleep(5000);

        System.out.println("Package: " + driver.getCurrentPackage());
        System.out.println("Contexts: " + driver.getContextHandles());
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        // driver.findElement(By.name("q")).sendKeys("Appium");
        // driver.findElement(By.name("q")).submit();
        // String title = driver.getTitle();
        // assert title.contains("Appium") : "Expected title to contain 'Appium', but
        // got: " + title;
    }

}
