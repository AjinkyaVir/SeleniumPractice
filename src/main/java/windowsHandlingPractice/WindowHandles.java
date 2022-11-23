package windowsHandlingPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,350)", "");

		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newWindowsBtn']")));
		  
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String w : windows) {
			
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
			
		}

	}

}
