package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavenTest {
	
		@Test
		public void maven_1()
		{
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pshar\\selenium1\\driver3\\chromedriver.exe");
			WebDriver driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");

		System.out.println("...new");

		}


}
