package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateById {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //setting the path for the driver location
		
	
		
		WebDriver driver=new ChromeDriver(); //object browser_object  is created
		
		driver.get("http://www.google.com/"); //open  the google website using get method 
		
		driver.manage().window().maximize(); //maximizing the eclipse window
		
		
		
		
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium"); //locating the webelement using id locator 
		
		Thread.sleep(3000);  //giving time 
		
		driver.close(); //closing the browser

	}

}
