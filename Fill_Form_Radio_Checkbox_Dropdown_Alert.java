package seleniumPackage1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_Form_Radio_Checkbox_Dropdown_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" );//which driver and where the driver is located
		
		ChromeDriver  browserObject = new ChromeDriver(); //driver object is created
		
		browserObject.get("http://training.qaonlinetraining.com/testPage.php"); //calling the website using get method
		
		
		// filling the form using send keys
		
		browserObject.findElement(By.name("name")).sendKeys("Infotek");
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("email")).sendKeys("Infotek_solution@gmail.com");
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("website")).sendKeys("www.infotek.com");
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("comment")).sendKeys("This is a new website");
		
		Thread.sleep(3000);
		
		//clicking on the radio button
		
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
		Thread.sleep(3000);
		
		
		//checking the boxes
		
		browserObject.findElement(By.name("bike")).click();
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("car")).click();
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("boat")).click();
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("horse")).click();
		Thread.sleep(3000);
		
		// selecting from drop down list
		
		Select cn= new Select(browserObject.findElement(By.name("country")));
		cn.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		
		
		Select skill = new Select(browserObject.findElement(By.name("skill")));
		
		Thread.sleep(3000);
		
		skill.selectByVisibleText("Quality Assurance");
		
		Thread.sleep(3000);
		
		
		skill.selectByVisibleText("Programming");
		
		Thread.sleep(3000);
		
		//submitting the form
		
		browserObject.findElement(By.name("submit")).click();
		
		// Handling the Alerts
		
		browserObject.findElement(By.id("alert")).click();
		Alert alert1 = browserObject.switchTo().alert(); //Alert is the class and alert1 is object created to call method browserObject.switchTo().alert().accept(); 
		Thread.sleep(5000);
		alert1.accept();
		
		
		browserObject.findElement(By.id("confirm")).click();
		Alert alert2= browserObject.switchTo().alert();
		Thread.sleep(5000);
		alert2.dismiss();
		
		
		browserObject.findElement(By.id("prompt")).click();
		Alert alert3=browserObject.switchTo().alert();
		Thread.sleep(3000);
		alert3.sendKeys("Mr Bond");
		alert3.accept(); 
		
		
		
	}

}
