package VELOCITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
			
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//a[@href=\"/web/index.php/leave/viewLeaveModule\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"oxd-topbar-body-nav-tab --parent\"]/span[text()='Entitlements ']")).click();
			
		
		driver.findElement(By.xpath("(//li[@class=\"--active oxd-topbar-body-nav-tab --parent\"]//li)[1]/a[text()='Add Entitlements']")).click();
		
		
	    driver.findElement(By.xpath("(//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"])[2]//input")).click();
	
	    Thread.sleep(3000);
		
	    
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Maggie  Manning");
		
		//driver.findElement(By.xpath("(//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"])[2]//input[@placeholder=\"Type for hints...\"]")).sendKeys("Ga");
		
		//WebElement list=driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		
		//list.click();
		
		
		//driver.findElement(By.xpath("//div[@role=\"listbox\"]//span[text()='US - Vacation']")).click();
              
		//driver.findElement(By.xpath("((//div[@class='oxd-grid-item oxd-grid-item--gutters'])[4]//div)[7]")).click();
		
       // driver.findElement(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[5]//input")).sendKeys("15");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//div[@class='oxd-form-actions'])[1]//button[2]")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
