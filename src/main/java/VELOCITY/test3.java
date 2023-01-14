package VELOCITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
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
			
		driver.findElement(By.xpath("(//div[@class=\"oxd-sidepanel-body\"]/ul//a)[2]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"oxd-topbar-body\"]//ul//a[text()='Add Employee']")).click();
		
		WebElement s1=driver.findElement(By.xpath("(//img[@alt=\"profile picture\"])[2]"));
	//	s1.click();
		
		Thread.sleep(2000);
		
		s1.sendKeys("C:\\Users\\admin\\Pictures\\Camera Roll\\WIN_20221111_11_26_39_Pro.jpg");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

