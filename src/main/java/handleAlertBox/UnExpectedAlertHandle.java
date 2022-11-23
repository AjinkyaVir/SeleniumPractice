package handleAlertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnExpectedAlertHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		try {
			
			driver.findElement(By.id("timerAlertButton")).click();
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("UnExpected Alert is present");
			
		}catch(Exception e) {
			System.out.println("UnExpected Alert is not present");
		}
		
	}
	
}
