package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// program uses link text to click
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); // set the driver
		
		ChromeDriver  browserObject = new ChromeDriver(); //create a driver object
		
		browserObject.get("http://www.facebook.com/"); //using get method calling the website 
		
		browserObject.manage().window().maximize(); //maximizing the window
	
		//browserObject.findElement(By.linkText("Forgot password")).click();
		
		browserObject.findElement(By.partialLinkText("Forgot")).click(); //using the link element to click
		
		Thread.sleep(3000);
		
		browserObject.close(); //close the browser
		

	}

}
