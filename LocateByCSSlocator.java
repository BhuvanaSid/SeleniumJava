package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSlocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// program to find the webelement using CSS selector (CSS selector used here is tag and ID)
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //set the chrome driver
		
		ChromeDriver  browserObject = new ChromeDriver(); //object for chrome driver
		
		browserObject.get("http://www.google.com/"); //get method to fetch the website
		
		browserObject.manage().window().maximize(); //maximizing the window
		
		
		
		// UserName Tag and Id
		
		//browserObject.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("SeleniumId"); //CSS selector used here is tag and ID (#)
		
		//browserObject.findElement(By.cssSelector("#APjFqb")).sendKeys("SeleniumId"); //CSS selector with this also can be used
		
		
		// Tag and Class
		
		//browserObject.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("SeleniumId"); //CSS selector used here is tag and class (. for tag classs)
		
		//browserObject.findElement(By.cssSelector(".gLFyf")).sendKeys("seleniumId"); //tag and class
		
		
		//Tag and attribute
		
		//browserObject.findElement(By.cssSelector("textarea[name='q']")).sendKeys("SeleniumId");
		
		//browserObject.findElement(By.cssSelector("[name='q']")).sendKeys("SeleniumId");
		
		
		// Tag, class , Attribute
		
		//browserObject.findElement(By.cssSelector("textarea.gLFyf[name='q']")).sendKeys("SeleniumId");
		
		browserObject.findElement(By.cssSelector(".gLFyf[name='q']")).sendKeys("SeleniumId");
		
		
		Thread.sleep(3000); 
		
		browserObject.close(); //close the browser
		
		
	}

}

