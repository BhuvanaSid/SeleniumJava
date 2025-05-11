package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//This program is about doing drag and drop: Mouse Hover operation
public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Sets the system property to let Selenium know where the ChromeDriver executable is located.
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); 
		
		// Creates a new instance of the Chrome browser.
		ChromeDriver  browserObject = new ChromeDriver();
		
		// Opens the web page that has a drag-and-drop demo.
		browserObject.get("https://jqueryui.com/droppable/"); 
		
		// Switches to the first (index 0) iframe on the page because
		// the drag-and-drop elements are inside an iframe.
		// Selenium cannot access elements inside an iframe without switching to it.
		browserObject.switchTo().frame(0);
		
		// Locates the draggable element by its ID ("draggable").This is the box you will drag.			
		WebElement source=browserObject.findElement(By.id("draggable"));
		
		// Locates the draggable element by its ID ("droppable").This is the box where you will drop.	
		WebElement target=browserObject.findElement(By.id("droppable"));
		
		// Creates an instance of the Actions class to perform complex mouse and keyboard interactions.
		Actions act=new Actions(browserObject);
		
		// Builds and performs the drag-and-drop action from source to target.
		
		act.dragAndDrop(source, target).build().perform();
		
		//act.dragAndDrop(source, target).perform(); This can be done without build() also, as this is a single action. 
		//If we want mutiple actions to be done than we need build()
		
	}

}
