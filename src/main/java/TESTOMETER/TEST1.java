package TESTOMETER;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST1 
{
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
			
		driver.get("https://testiopro.iea.net/upload");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("samadmin@iea.net");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"passwd\"]")).sendKeys("H=\\9JkxAo4?r");
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-report-event=\"Signin_Submit\"]")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Yes\"]")).click();
		
		driver.findElement(By.xpath("//a[@id=\"begin\"]/span[text()='Begin']")).click();
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-rounded btn-block label-themecolor col-white\"]/i)[1]")).click();
	
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@id=\"dropzone\"]/form[@id=\"demo-upload\"]")).click();
		
	
		Robot rb=new Robot();
		
		rb.delay(2000);
		// put path to file in clipboard
		
		//StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\Barco Rent 2.pdf");
		
		//StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\12pages.pdf");
		
		//StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\Express Car 2.pdf");
		
		StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\Express Car 3.pdf");
		
		
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTROL+V
	
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		
		//ENTER
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Upload']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id=\"begin\"]/span[text()='Begin']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("((//div[@id=\"invoice_table_wrapper\"]//tr)[2]//td)[1]")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
