package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //mentioning which driver and where it is located
		
		ChromeDriver  browserObject = new ChromeDriver();// declaring object for the driver
		
		browserObject.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); 
		
		browserObject.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement source=browserObject.findElement(By.id("box6"));
		
		WebElement target=browserObject.findElement(By.id("box106"));
		
		
		Actions act=new Actions(browserObject);
		
		act.dragAndDrop(source, target).perform();
		
		
	}

}
