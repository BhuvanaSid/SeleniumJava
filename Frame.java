package seleniumPackage1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");
						
		// Creates a new instance of the Chrome browser.
		ChromeDriver  browserObject = new ChromeDriver();
						
		// Navigates the browser to the specified URL
		browserObject.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		//this is not possible as the element is in a frame, hence throws error
		//browserObject.findElement(By.xpath("//*[@id=\"pageBody\"]/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("48925");
		
		
		//check for number of frames available in the page
		//This is required to get the number of frames and name of the frame.
		// we can just switch to the frame and send data
		List<WebElement> Frames= browserObject.findElements(By.tagName("frame"));
			
		System.out.println(Frames.size()); //gives out the frame size which is 1
		
		// Print the name attribute of each frame
		for(WebElement frame : Frames) {
			
			System.out.println("Frame name: " + frame.getAttribute("name"));
			
		}
		
		
		
		// Switch to the frame to interact with elements inside it
        browserObject.switchTo().frame(0);

        // Send input into the customer ID field inside the frame
        browserObject.findElement(By.name("fldLoginUserId")).sendKeys("48925");
        
        Thread.sleep(3000);

       

        // Close the browser
        browserObject.quit();
		

	}

}
