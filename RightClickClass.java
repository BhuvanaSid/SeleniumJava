package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Program Mouse Interface Actions- Right Click
public class RightClickClass {

	
		// Main method - entry point of the Java program.
			// It throws InterruptedException because of Thread.sleep() used later.
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// Sets the path to the ChromeDriver executable.
		// This is required for Selenium to launch Chrome browser.

		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" );
		
		
		// Creates a new instance of Chrome browser using ChromeDriver.
		ChromeDriver  browserObject = new ChromeDriver();
		
		// Opens the given URL in the Chrome browser.
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		// Maximizes the browser window for better visibility.
		browserObject.manage().window().maximize();
		
		// Pauses execution for 3 seconds to allow page to fully load.
		Thread.sleep(3000);
		
		// Finds the element on the page (a span that responds to right-click).
		// This is the element that will be right-clicked and that is stored in WebElement "button".
		
		WebElement button= browserObject.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		//Action class, in the constructor of the Action class we pass the object 
		//This sets up the ability to perform user-like interactions in the browser.
		//creates an Action object
		//call it initiating the action class
		
		Actions act=new Actions(browserObject);
		
		//with the action object (instance of Action class), We pass the object which has to be right clicked in [.contextClick()]
		//webElement is passed here
		act.contextClick(button).build().perform();
		
		
	}

}
