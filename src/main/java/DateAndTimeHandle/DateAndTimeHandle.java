package DateAndTimeHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAndTimeHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demo.guru99.com/test/";
		
		driver.get(URL);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement dateAndTime = driver.findElement(By.name("bdaytime"));
		
		dateAndTime.sendKeys("05222021");
		
		dateAndTime.sendKeys(Keys.TAB);
		
		dateAndTime.sendKeys("0305Pm");
		
		//Thread.sleep(5000);
		
		//driver.close();
		
		

	}

}
