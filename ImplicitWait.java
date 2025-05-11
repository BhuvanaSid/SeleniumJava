package seleniumPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver");
		
		// Creates a new instance of the Chrome browser.
		ChromeDriver  browserObject = new ChromeDriver();
		
		// Navigates the browser to the specified URL
		browserObject.get("http://demo.itlearn360.com/");
		
		
		//Sets an implicit wait of 10 seconds. 
		//Selenium will wait up to 10 seconds for elements to be present before throwing an exception.
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Finds the Login button or link using XPath and clicks it to open the login form.
		browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		
		//Locates the username/email input field using its HTML id attribute and sends the username using sendkeys.
		WebElement email= browserObject.findElement(By.id("user_login"));
		email.sendKeys("Demo12");
		
		//Locates the password input field using its HTML id attribute and sends the password using sendkeys.
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys("Test123456$");
		
		//Clicks the Login button (identified by its id) to submit the login form.
		browserObject.findElement(By.id("wp-submit")).click();
		
		//After logging in, finds the logout dropdown toggle icon using XPath and clicks on it using click() method
		WebElement logoutimage= browserObject.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i"));
		logoutimage.click();
		
		//Clicks the logout link to sign the user out of the site.
		WebElement lg= browserObject.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a"));
		lg.click();
			
		
		
	}

}
