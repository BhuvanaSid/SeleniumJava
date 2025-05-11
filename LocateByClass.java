package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		       System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //setting the path for the driver location
				
				ChromeDriver  browserObject = new ChromeDriver();//object for the driver is created
				
				browserObject.get("http://www.google.com/"); //calling the website using get method 
				
				browserObject.findElement(By.className("gLFyf")).sendKeys("Selenium Python"); //locating the element by 'className' locator - driver element method
				
				
				Thread.sleep(3000);  //giving time 
				
				browserObject.close(); //closing the browser
				
				
			}

		

	}


