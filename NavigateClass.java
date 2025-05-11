package seleniumPackage1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); 
		
		// Creates a new instance of the Chrome browser.
		ChromeDriver  browserObject = new ChromeDriver();
		
		// Navigates the browser to the specified URL
		browserObject.get("https://www.facebook.com/"); 
		
		// Navigates to Instagram using .navigate().to() — works like .get(), but allows more navigation options
		browserObject.navigate().to("https://www.instagram.com/"); 
		
		
		// Navigates to Twitter using .navigate().to()
		browserObject.navigate().to("https://www.twitter.com/"); 
		
		// Navigates back to the previous page (Instagram)
		browserObject.navigate().back();
		
		// Prints the title of the current page (Instagram)
		System.out.println("this is"+browserObject.getTitle()+ "website");
		
		// Prints the URL of the current page
		System.out.println("url is"+browserObject.getCurrentUrl());
		
		// Navigates back again (to Facebook)
		browserObject.navigate().back();
		
		// Navigates forward (to Instagram)
		browserObject.navigate().forward();
		
	}

}
