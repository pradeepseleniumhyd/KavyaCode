package utilities;

import org.openqa.selenium.WebDriver;

public class Commons {
	
	public void navigateURL(WebDriver driver,String url)
	{
		try
		{
			driver.get(url);
		}catch (Exception e) {
			System.out.println("URL is not entered : " + e.getMessage());
		}
	}

}
