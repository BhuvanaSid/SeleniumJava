package seleniumPackage1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Sets the system property to let Selenium know where the ChromeDriver executable is located.
				System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); 
				
				// Creates a new instance of the Chrome browser.
				ChromeDriver  browserObject = new ChromeDriver();
				
				// Opens the web page 
				browserObject.get("http://demo.itlearn360.com/"); 
				
				//JavascriptExecutor js=(JavascriptExecutor) browserObject;
				
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //it will scroll to a particular height,scrolls to complete height of the page
				
				JavascriptExecutor js=(JavascriptExecutor) browserObject;
				
				js.executeScript("window.scrollTo(0, 200)"); 
				

	}

}
