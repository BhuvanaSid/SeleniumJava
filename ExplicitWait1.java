package seleniumPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");

        // Launch Chrome browser
        ChromeDriver browserObject = new ChromeDriver();

        // Navigate to Google
        browserObject.get("http://google.com");

        // Optional: Maximize the browser window
        browserObject.manage().window().maximize();

        // Create WebDriverWait with 30-second timeout
        WebDriverWait wait = new WebDriverWait(browserObject, Duration.ofSeconds(30));

        // Wait until the "Gmail" link is visible and click it
        WebElement gmailLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Gmail')]")));
        gmailLink.click();

        // Wait until the page title contains "Gmail"
        wait.until(ExpectedConditions.titleContains("Gmail"));

        // Get and print the current page title and URL
        String currentTitle = browserObject.getTitle();
        String currentURL = browserObject.getCurrentUrl();

        System.out.println("Page Title: " + currentTitle);
        System.out.println("Page URL: " + currentURL);

        // Optional: Verify title or URL contains "Gmail"
        if (currentTitle.contains("Gmail") || currentURL.contains("gmail")) {
            System.out.println("Gmail page loaded successfully.");
        } else {
            System.out.println("Failed to load Gmail page.");
        }

        // Close the browser
        browserObject.quit();
    }

}
