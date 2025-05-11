package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// This program is used to open the google.com and send the word selenium by locating the element by name.
public class locateByName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //which driver and where it is located
		
		//ChromeDriver  browserObject = new ChromeDriver();
		//browserObject.get("http://www.google.com/");
		
		WebDriver driver=new ChromeDriver(); //object for the driver is created
		
		driver.get("http://www.google.com/"); //calling the website using get method 
		
		driver.manage().window().maximize(); //maximizing the window
		
		
		
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium"); //locating the element by 'name' locator - driver element method
		
		Thread.sleep(3000);  //giving time 
		
		driver.close(); //closing the browser
		
		
	}

}
