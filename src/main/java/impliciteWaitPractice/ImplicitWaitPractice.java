package impliciteWaitPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitPractice {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://learn-automation.com/implicit-wait-in-selenium-webdriver/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("bigBoss")).click();
			
			
			
		}
	
}
