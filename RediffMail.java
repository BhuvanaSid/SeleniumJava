
// Define the package for the class
package seleniumPackage1;

//Import required Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class RediffMail {

	// Main method - the entry point of the program
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Set the system property to specify the path to the ChromeDriver executable
        // This tells Selenium which browser driver to use and where it is located
		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" );
		
		// Create an instance of ChromeDriver which opens a new Chrome browser window
		ChromeDriver  browserObject = new ChromeDriver(); 
		
		// Use the get() method to navigate to the Rediff Mail login page
		browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");         
		
		// Maximize the browser window to full screen
		browserObject.manage().window().maximize(); 
		
		// Pause execution for 3 seconds to allow the page to load completely
		Thread.sleep(3000);	
		
		// Find the login button using XPath and click on it without entering credentials
		browserObject.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/button")).click(); 
		
		// Pause execution for 3 seconds to allow the page to load completely
		Thread.sleep(3000); 
		
		// Switch the control to the alert and accept it (click 'OK')
		browserObject.switchTo().alert().accept(); 
		
		// Close the browser window
		browserObject.close(); 
		
		
	
	}

}
