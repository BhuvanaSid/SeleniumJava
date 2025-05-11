package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //mentioning which driver and where it is located
		
		ChromeDriver  browserObject = new ChromeDriver();// declaring object for the driver
		
		browserObject.get("http://www.facebook.com/"); //using get method calling the website 

		browserObject.manage().window().maximize(); //maximizing the browser
		
		browserObject.findElement(By.id("email")).sendKeys("bhuvana.asg@gmail.com"); //using webelement of id to send keys
		
		browserObject.findElement(By.id("pass")).sendKeys("cauvery@river"); //using webelement of id to send keys
		
		//Thread.sleep(3000);
		
		browserObject.findElement(By.name("login")).click(); //lusing webelement of name to click
		
		Thread.sleep(3000);
		
		//browserObject.close();
		

	}

}
