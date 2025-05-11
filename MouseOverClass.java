package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Specifies the path to the GeckoDriver executable (for Firefox browser).
		// Required for Selenium to interact with Firefox.
		System.setProperty("webdriver.gecko.driver","/Users/bhuvana/Downloads/geckodriver");
		 
		// Launches a new Firefox browser instance using GeckoDriver.
		FirefoxDriver browserObject = new FirefoxDriver();
		
		// Opens the Amazon home page in the browser.
		browserObject.get("http://www.amazon.com/");
		
		// Maximizes the browser window for better visibility and to prevent hidden elements.
		browserObject.manage().window().maximize();
		
		// Finds the first element to hover over using its XPath.
		// This might be something like "Accounts & Lists" on Amazon's header.
		WebElement element=browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/div[2]/a/span"));
		
		// Creates an Actions object for simulating user interactions.
		Actions act=new Actions(browserObject);
		
		// Moves the mouse over the first element (hover action).
		// Triggers any hover effects like dropdowns.
		act.moveToElement(element).build().perform();
		
		// Pauses the execution for 3 seconds to see the hover effect.
		Thread.sleep(3000);
		
		
		// Finds a second element to hover over using XPath.
		WebElement element1=browserObject.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/div[1]/a/span"));
		
		// Creates an Actions object for simulating user interactions.
		Actions act1=new Actions(browserObject);
		
		// Moves the mouse over the second element (hover action).
		// Triggers any hover effects like dropdowns.
		act1.moveToElement(element1).build().perform();
		
		// Pauses the execution for 3 seconds to see the hover effect.
		Thread.sleep(3000);
		
		//close the browser
		browserObject.close();
		
		

	}

}
