package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSingle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
				System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");
								
		// Creates a new instance of the Chrome browser.
				ChromeDriver  browserObject = new ChromeDriver();
								
		// Navigates the browser to the specified URL
				browserObject.get("https://netbanking.hdfcbank.com/netbanking/");
				
       ;

        // Switch to the frame by name or ID and there are 3 ways to switch (here i have taken the name of the frame)
        browserObject.switchTo().frame("login_page");

        // Or switch by index (e.g., the first frame on the page)
        // driver.switchTo().frame(0);

        // Or switch by WebElement
        // WebElement frameElement = driver.findElement(By.xpath("//iframe"));
        // driver.switchTo().frame(frameElement);

        // Now interact with an element inside the frame
        WebElement input = browserObject.findElement(By.name("fldLoginUserId"));
        input.sendKeys("Hello Frame!");
        
        Thread.sleep(3000);

        // Switch back to the main content
        browserObject.switchTo().defaultContent();

        
        browserObject.quit();
    }
	
}


