package seleniumPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");
		
		// Creates a new instance of the Chrome browser.
		ChromeDriver  browserObject = new ChromeDriver();
		
		// Navigates the browser to the specified URL
		browserObject.get("http://google.com");
		
		//Maximize the browser Window
		browserObject.manage().window().maximize();
		
		//Creates a WebDriverWait object with a 30-second timeout. This will be used to wait for specific elements/conditions.
		//this webDriver object is applied here for Xpath to click.
		WebDriverWait wait=new WebDriverWait(browserObject, Duration.ofSeconds(30));
		
		
		
		//Declares a variable to hold the Gmail link element.
		WebElement gmailLink;
		//Locate the gmail element and apply the wait and until method to the element.
		gmailLink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Gmail')]")));
		
		gmailLink.click();
		
		
		
		//Closes all browser windows and ends the session.
		browserObject.quit();
		
		
		
		
		
		
	}

}
