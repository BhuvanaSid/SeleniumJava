package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Fill_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" ); //which driver and where the driver is located
		
		ChromeDriver  browserObject = new ChromeDriver(); //object for the driver is created
		
		browserObject.get("https://www.facebook.com"); //calling the website using get method 
		
		Thread.sleep(3000);
		
		browserObject.manage().window().maximize();// maximizing the window
		
		
		//clicking create account on FB page
		
		browserObject.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		Thread.sleep(3000);
		
		 
		// filling the create account form
		
		browserObject.findElement(By.name("firstname")).sendKeys("Bhuvana");
		
		Thread.sleep(3000);
		
		browserObject.findElement(By.name("lastname")).sendKeys("Doraisami");
		
		Thread.sleep(3000);
		
		
		//selecting month, day, year from the drop down
		
		Select MN= new Select(browserObject.findElement(By.id("month")));
		
		MN.selectByVisibleText("Nov");
		
		Thread.sleep(3000);
		
		
		Select DT= new Select(browserObject.findElement(By.id("day")));
		
		DT.selectByVisibleText("1");
		
		Thread.sleep(3000);
		
		Select YR= new Select(browserObject.findElement(By.id("year")));
		
		YR.selectByVisibleText("2002");
		
		Thread.sleep(3000);

		// selecting the gender (radio button)
		
		browserObject.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[1]/label/input")).click();
		
		Thread.sleep(3000);
		
		// sending the email address
		
		browserObject.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).sendKeys("bhuvana@gmail.com");
		
		// sending the password
		
		browserObject.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("Doraisami@0");
		
		// clicking the submit button
		
		browserObject.findElement(By.name("websubmit")).click();
		
		
		Thread.sleep(3000);
		
		
		

	}

}
