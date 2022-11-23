package allCommonPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		String originalWin = driver.getWindowHandle();
		System.out.println(originalWin);
		
		Set<String> childWin = driver.getWindowHandles();
		System.out.println(childWin);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Car");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
