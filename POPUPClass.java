package seleniumPackage1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
				System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); 
				
				// Creates a new instance of the Chrome browser.
				ChromeDriver  browserObject = new ChromeDriver();
				
				// Navigates the browser to the specified URL
				browserObject.get("https://omayo.blogspot.com/"); 
				
				// Stores the current (parent) window handle
				String pw=browserObject.getWindowHandle();
				
				
				// Finds the hyperlink with text "Open a popup window" and clicks on it
				browserObject.findElement(By.linkText("Open a popup window")).click();
				
				// Retrieves all window handles after the popup window is opened
				Set<String>windows = browserObject.getWindowHandles();
				
				// Loops through each window handle
				for (String win:windows)
				{
					// Switches the browser context to the window represented by the handle
					browserObject.switchTo().window(win);
					
					// Checks if the title of the current window is "New Window"
					if (browserObject.getTitle().equals("New Window"))
						
					{
						// Maximizes the popup window
						browserObject.manage().window().maximize();
						// Waits for 3 seconds to observe the popup before closing
						Thread.sleep(3000);
						// Closes the popup window
						browserObject.close();
					}
				}
				
				
				//browserObject.switchTo().window(pw); // In case u want to witch to the main window otherwise "pw" is no use here...

	}

}
