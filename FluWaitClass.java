package seleniumPackage1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluWaitClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");
				
		// Creates a new instance of the Chrome browser.
		ChromeDriver  browserObject = new ChromeDriver();
				
		// Navigates the browser to the specified URL
		browserObject.get("http://google.com");
				
		//Maximize the browser Window
		browserObject.manage().window().maximize();
		
		//Locates the webelement by name (q) and types in the keyword Selenium.
		browserObject.findElement(By.name("q")).sendKeys("Selenium");
		
		//Pauses execution for 2 seconds to simulate delay before clicking 
		Thread.sleep(2000);
		
		//Locates the webelement by name (btnK) and clicks. //check with sir
		//browserObject.findElement(By.name("btnK")).click(); //check with sir
		
		browserObject.findElement(By.name("q")).submit();
		
		@SuppressWarnings(("deprecation"))
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(browserObject).withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
		
		WebElement element=(WebElement)wait.until(new Function<WebDriver, WebElement>() {

			
			public WebElement apply(WebDriver arg0) {
				
				WebElement linkelement =browserObject.findElement(By.partialLinkText("selenium"));
				
				if (linkelement.isEnabled()) {
					System.out.println("Element is Found");
					
				}
				return linkelement;
				
			}
			
			
		});
		
		element.click();
		
	}

}
