package seleniumPackage1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v134.browser.Browser;

public class WindowTabClass {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		
		// Set the system property to specify the path to the ChromeDriver executable
        // This tells Selenium which browser driver to use and where it is located
		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" );
		
		// Create an instance of ChromeDriver which opens a new Chrome browser window
		ChromeDriver  browserObject = new ChromeDriver(); 
		
		// Use the get() method to navigate to the qed42.com page
		browserObject.get("https://www.qed42.com/");    
		
		
		// Store the handle (unique ID) of the current window i.e use string to get the original window which is open
		String originalWindow=browserObject.getWindowHandle(); 
		
		
		// Open a new tab in the same browser window
		browserObject.switchTo().newWindow(WindowType.TAB);
		// Navigate to Google in the new tab
		browserObject.navigate().to("https://www.google.com/");	
		
		// Print the title of the Google tab
		System.out.println("New Tab Page Title:" +browserObject.getTitle());
		
		
		// Open a completely new browser window (not just a tab)
		browserObject.switchTo().newWindow(WindowType.WINDOW);
		// Navigate to facebook in the new window
		browserObject.navigate().to("https://www.facebook.com/");	
		
		
		// Print the title of the Facebook window
		System.out.println("New Tab Page Title:" +browserObject.getTitle());
		
		
		// Switch back to original window
		browserObject.switchTo().window(originalWindow);
		Thread.sleep(3000);
		
		System.out.println("Switched back to original window. Title: " + browserObject.getTitle());
		
		
		browserObject.quit();
		
		
	}

}
