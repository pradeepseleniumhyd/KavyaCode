package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCode 
{
	
	public WebDriver browserOpen(WebDriver driver,String browsername) throws Exception
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge"))
		{
			 WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
			}else
			{
				System.out.println(browsername + " is invalid");
				throw new Exception(browsername + " is invalid");
			}
		return driver;
	}

}
