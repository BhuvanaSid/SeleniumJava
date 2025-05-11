package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// This program finds whether the link is present or not
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //set the driver
		
		ChromeDriver  browserObject = new ChromeDriver(); //create the object for the driver
		
		browserObject.get("http://www.google.com/"); //using get method call the website
		
		browserObject.manage().window().maximize(); //maximizing the window
	
		//browserObject.findElement(By.linkText("Gmail")).click(); //here the gmail link is clicked on the webpage
		
		
		WebElement text=browserObject.findElement(By.linkText("Gmail")); //following is used to find whether the link is present or not.
		
		if(text.isDisplayed())
		{
			System.out.println("The text is a link");
		}
		else 
		{
			System.out.println("This is not a link");
		}
		
		Thread.sleep(3000); //give sometime
		
		browserObject.close(); //close the browser
		
		
	}

}
