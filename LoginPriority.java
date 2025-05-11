package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPriority {

	WebDriver browserObject;
	
	@Test(priority=1)
	public void setUp() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //which driver and it's location
		browserObject = new ChromeDriver();
		
		browserObject.get("http://demo.itlearn360.com/");
		
		browserObject.manage().window().maximize(); //Maximize the browser window for better visibility
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=2)
	public void verify()
	{
		
		WebElement loginImage = browserObject.findElement(By.id("loginlabel"));
		loginImage.click();
		
		WebElement userName = browserObject.findElement(By.id("user_login"));
		userName.sendKeys("Demo12");
		
		WebElement pass = browserObject.findElement(By.id("user_pass"));
		pass.sendKeys("Test123456$");
		
		WebElement sub=browserObject.findElement(By.name("wp-submit"));
		sub.click();
		
	}

	
	@Test(priority=3)
	public void logoutProcess() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement logoutImage=browserObject.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i"));
		logoutImage.click();
		
		Thread.sleep(3000);
		
		WebElement logoutclick=browserObject.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a "));
		logoutclick.click();
		
		
	}
	
	
	
}
