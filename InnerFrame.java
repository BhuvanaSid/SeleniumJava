package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
				System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");
								
				// Creates a new instance of the Chrome browser.
				ChromeDriver  browserObject = new ChromeDriver();
								
				// Navigates the browser to the specified URL
				browserObject.get("https://demo.automationtesting.in/Frames.html");
				
				//Click the second tab: "Iframe with in an Iframe"
				browserObject.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
				
				//creating an object to hold the outer frame WebElement
				WebElement OutterFrame=browserObject.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
				
				//Switch WebDriver context to the outer frame
				browserObject.switchTo().frame(OutterFrame);
				
				//creating an object to hold the inner frame WebElement
				WebElement InnerFrame=browserObject.findElement(By.xpath("/html/body/section/div/div/iframe"));
				
				//Switch WebDriver context to the inner frame
				browserObject.switchTo().frame(InnerFrame);
				
				//Wait 3 seconds
				Thread.sleep(3000);
				
				// Find the text input box and type "Welcome to Frames" into it
				browserObject.findElement(By.cssSelector("input[type='text']")).sendKeys("Welcome to Frames");
				
				//switching to parent Frame from inner frame
				
				browserObject.switchTo().parentFrame();
				
				//From the outer frame, get the heading text and store it
				String Text= browserObject.findElement(By.xpath("/html/body/section/div/div/h5")).getText();
				
				//printing the text in the outer frame or the parent frame
				System.out.println(Text);
				
				
		
	}

}
