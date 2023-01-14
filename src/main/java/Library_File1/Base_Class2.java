package Library_File1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class2 
{
	
	
	
	public void initilisebrowser() 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
       driver.get("https://testiopro.iea.net/");
		
	
	}
	
	
	
	
	
	
	

}
