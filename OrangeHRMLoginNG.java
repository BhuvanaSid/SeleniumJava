package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMLoginNG {

	// This test method will be run with multiple sets of username and password provided by the DataProvider. 
	//With help of Data Provider we can work with multiple sets of Data
	
	
	@Test(dataProvider="OrangeData")
	public void Ologin (String Un, String Pwd) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver"); //setting the path for the driver location
		
		ChromeDriver  browserObject = new ChromeDriver(); //object for chrome driver
		
		 browserObject =new ChromeDriver(); //object browser_object  is created
		 
		 browserObject.manage().window().maximize(); //Maximize the browser window for better visibility
		 
		 browserObject.get("https://opensource-demo.orangehrmlive.com/"); // Navigate to the OrangeHRM demo login page
		 
		 Thread.sleep(3000); // Wait for 3 seconds to let the page load fully
		 
		 browserObject.findElement(By.name("username")).sendKeys(Un); //Enter the username passed from the DataProvider
		 
		 browserObject.findElement(By.name("password")).sendKeys(Pwd); //Enter the password passed from the DataProvider
		
		 Thread.sleep(3000); // Wait for 3 seconds to let the page load fully
		 
		
		 browserObject.navigate().refresh(); // Refresh the browser page to simulate reloading the login page
		 
		 browserObject.close(); //close the browser page

	}
	
	// This DataProvider supplies three sets of login credentials to the test method
	
	@DataProvider
	
	public Object[][] OrangeData()
	
	{
		Object[][] Obj= new Object[3][2];  // Create a 2D array to hold 3 sets of username/password combinations
		
		Obj[0][0]="Admin";
		Obj[0][1]="admin123";
		
		Obj[1][0]="Adminabc";
		Obj[1][1]="admin";
		
		
		Obj[2][0]="AdminPqr";
		Obj[2][1]="admin";
		
		return Obj;
		
		
		
		
	}

}
