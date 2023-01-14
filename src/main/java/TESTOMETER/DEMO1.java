package TESTOMETER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO1 
{
	
	 public static void main(String[] args) throws InterruptedException
	{
		 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]")).click();
	
	
			
			
				 
		 
		 
		 
		 
		 
		
	}

	
	
	
	
	
	
	

}
