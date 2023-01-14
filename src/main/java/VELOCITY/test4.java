package VELOCITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@21.1770822,79.6183323,13z");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id=\"searchbox\"]//input[@id=\"searchboxinput\"]")).sendKeys("Nanded");
			
		driver.findElement(By.xpath("((//div[@role=\"gridcell\"])[3]//span)[4]")).click();
		
		driver.findElement(By.xpath("//div[@data-ogsr-fb=\"true\"]//a[@class=\"gb_e gb_Ac\"]")).click();
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("(//ul[@jsname=\"k77Iif\"]/li)[3]//span[text()='Maps']")).click();
		
		Thread.sleep(2000);
		
	//driver.findElement(By.xpath("((//div[@jsname=\"Sx9Kwc\"]//ul)[1]/li)[3]/a//span[text()='Maps']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@aria-label=\"Google apps\"]//ul//li/a/div/span[text()='Calendar']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
