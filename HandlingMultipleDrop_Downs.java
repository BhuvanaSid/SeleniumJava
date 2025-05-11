package seleniumPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDrop_Downs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/bhuvana/Downloads/chromedriver-mac-x64/chromedriver" ); //set Up WebDriver
		
		ChromeDriver  browserObject = new ChromeDriver();
		
		browserObject.get("https://www.facebook.com"); //Open Facebook Website
		
		Thread.sleep(3000);
		
		browserObject.manage().window().maximize(); //Maximize Browser Window and Wait
		
		//click "create New Account"
		
		browserObject.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		Thread.sleep(3000);
		
	
		
		
		//Handle Drop-downs (Month, Day, Year)
		
		WebElement Month= browserObject.findElement(By.id("month"));
		
		SelectOption(Month, "Mar");
		
		WebElement Day=browserObject.findElement(By.id("day"));
		
		SelectOption(Day, "10");
		
		
		
		WebElement Year=browserObject.findElement(By.id("year"));
		
		SelectOption(Year, "2005");
		
		
		
	}
	
	// SelectionOption() Method
	
	public static void SelectOption(WebElement Ele,String Value)
	{
		
		Select DropDown = new Select(Ele);
		
		java.util.List<WebElement> ALLDD=DropDown.getOptions();
		
		for (WebElement option: ALLDD)
		{
			if(option.getText().equals(Value))
				
			{
				option.click();
				break;
			}
		}
			
		
	}
}


