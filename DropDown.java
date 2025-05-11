package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" );
		
		ChromeDriver  browserObject = new ChromeDriver();
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		Thread.sleep(3000);
		
		browserObject.manage().window().maximize();
		
		
		Select cn= new Select(browserObject.findElement(By.name("country")));
		
		cn.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		Select skill = new Select(browserObject.findElement(By.name("skill")));
		
		Thread.sleep(3000);
		
		skill.selectByVisibleText("Quality Assurance");
		
		Thread.sleep(3000);
		
		skill.selectByVisibleText("Programming");
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("submit")).click();
		
		
	}

}
