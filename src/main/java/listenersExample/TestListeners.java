package listenersExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListenerBlog.class)
public class TestListeners {

	WebDriver driver ;
	
	@Test
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String expectedTitle = "Googlee";
		String actualTilte = driver.getTitle();
		Assert.assertEquals(actualTilte, expectedTitle);
	
	}
	
	@Test
	public void closeBrowser() {
		driver.close();
		System.out.println("Brwoser close");
	}
	
	@Test
	public void skipTest() {
		throw new SkipException("Forcefull skipped test");
	}
	
	private int i =1;
	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2)
				Assert.assertEquals(i , i);
		i++;
	}
	
}
