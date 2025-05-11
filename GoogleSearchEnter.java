package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchEnter {

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
		
        

        

				// Find the search input box
				WebElement element =browserObject.findElement(By.name("q"));

				// Type "Selenium" and press ENTER
				element.sendKeys("Selenium", Keys.ENTER);
		
		
	}

}
