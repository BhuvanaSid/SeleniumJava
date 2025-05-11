package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// program to send text "selenium Path" using webelement Xpath
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //set the driver
		
		ChromeDriver  browserObject = new ChromeDriver(); //declaring object for the driver
		
		browserObject.get("http://www.google.com/"); //calling the website using get method
		
		Thread.sleep(3000);
		

		browserObject.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium Path"); //using webelement of xpath to send keys
		
		//browserObject.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Selenium Path"); 
		
		
		Thread.sleep(3000);
		
		browserObject.close(); //closing the browser

	}

}
